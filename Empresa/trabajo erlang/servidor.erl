-module(servidor).
-export([start/0, loop/1, register/1, stop/0]).

start() -> spawn(servidor, register, [server]).

%para registrar
register(Name) ->
    try register(Name, self()) of
        true ->
            loop(#{})
    catch
        error:badarg ->
            io:format("servidor ya registrado ~n"),
            {error, server_already_started}
    end.

loop(State) ->
    State2 = receive
        {Cliente, {login, UserName}} ->
            io:format("[~p] -> ~p~n", [Cliente, {login, UserName}]),
            Users = maps:get(users, State, #{}),
            UserNames = maps:values(Users),
            case lists:member(UserName, UserNames) of
                true ->
                    Cliente ! {self(), {login, error, user_already_exists}},
                    State;
                false ->
                    Cliente ! {self(), {login, ok}},
                    Channels = maps:get(channels, State, #{<<"General">> => []}),
                    General = maps:get(<<"General">>, Channels, []),
                    State#{
                        users => Users#{
                            Cliente => UserName
                        },
                        channels => Channels#{
                            <<"General">> => [Cliente | General]
                        }
                    }
            end;
        {Cliente, close} ->
            io:format("[~p] -> ~p~n", [Cliente, close]),
            Users = maps:get(users, State, #{}),
            case maps:is_key(Cliente, Users) of
                true ->
                    Cliente ! {self(), {close, ok}},
                    State#{
                        users => maps:without([Cliente], Users)
                    };
                false ->
                    Cliente ! {self(), {close, error, user_not_found}},
                    State
            end;
        {Cliente, ls} ->
            io:format("[~p] -> ~p~n", [Cliente, ls]),
            Users = maps:get(users, State, #{}),
            case maps:is_key(Cliente, Users) of
                true ->
                    Channels = maps:get(channels, State, #{<<"General">> => []}),
                    Cliente ! {self(), {ls, ok, maps:keys(Channels)}},
                    State;
                false ->
                    Cliente ! {self(), {ls, error, user_not_found}},
                    State
            end;
        {Cliente, {activate, ChannelName}} ->
            io:format("[~p] -> ~p~n", [Cliente, {activate, ChannelName}]),
            Users = maps:get(users, State, #{}),
            case maps:is_key(Cliente, Users) of
                true ->
                    Channels = maps:get(channels, State, #{<<"General">> => []}),
                    case maps:get(ChannelName, Channels, undefined) of
                        undefined ->
                            Cliente ! {self(), {activate, error, channel_not_found}},
                            State;
                        _ ->
                            Channels2 = maps:map(fun (K, V) ->
                                case K of
                                    ChannelName ->
                                        case lists:member(Cliente, V) of
                                            true ->
                                                V;
                                            false ->
                                                [Cliente | V]
                                        end;
                                    _ ->
                                        lists:delete(Cliente, V)
                                end
                            end,
                            Channels),
                            Cliente ! {self(), {activate, ok}},
                            State#{
                                channels => Channels2
                            }
                    end;
                false ->
                    Cliente ! {self(), {activate, error, user_not_found}},
                    State
            end;
        {Cliente, {create, ChannelName}} ->
            io:format("[~p] -> ~p~n", [Cliente, {create, ChannelName}]),
            Users = maps:get(users, State, #{}),
            case maps:is_key(Cliente, Users) of
                true ->
                    Channels = maps:get(channels, State, #{<<"General">> => []}),
                    case maps:get(ChannelName, Channels, undefined) of
                        undefined -> %no existe el canal
                            Cliente ! {self(), {create, ok}},
                            Channels2 = maps:map(fun (_K, V) ->
                                lists:delete(Cliente, V)
                            end,
                            Channels),
                            State#{
                                channels => Channels2#{
                                    ChannelName => [Cliente]
                                }
                            };
                        _ ->
                            Cliente ! {self(), {create, error, channel_already_exists}},
                            State
                    end;
                false ->
                    Cliente ! {self(), {create, error, user_not_found}},
                    State
            end;

        {Cliente, {write, Message}} ->
            io:format("[~p] -> ~p~n", [Cliente, {write, Message}]),
            Users = maps:get(users, State, #{}),
            case maps:is_key(Cliente, Users) of
                true ->
                    Channels = maps:get(channels, State, #{<<"General">> => []}),
                    ActiveChannel = maps:fold(fun (K, V, Acc) ->
                        case Acc of
                            undefined ->
                                case lists:member(Cliente, V) of
                                    true ->
                                        K;
                                    false ->
                                        undefined
                                end;
                            _ ->
                                Acc
                        end
                    end,
                    undefined,
                    Channels),
                    case ActiveChannel of
                        undefined ->
                            Cliente ! {self(), {write, error, channel_not_active}},
                            State;
                        _ ->
                            ActiveUsers = maps:get(ActiveChannel, Channels, []),
                            UserName = maps:get(Cliente, Users, <<>>),
                            [C ! {self(), {write, ok, UserName, Message}} || C <- ActiveUsers, C =/= Cliente],
                            State
                    end;
                false ->
                    Cliente ! {self(), {write, error, user_not_found}},
                    State
            end;

        {Cliente, Mensaje} ->
            io:format("mensaje recibido de ~p: ~p ~n", [Cliente, Mensaje]),
            Cliente ! {self(), Mensaje}
    end,
    loop(State2).

stop() ->
    case whereis(server) of
        undefined ->
            ok;
        PID ->
            exit(PID, kill),
            ok
    end.
