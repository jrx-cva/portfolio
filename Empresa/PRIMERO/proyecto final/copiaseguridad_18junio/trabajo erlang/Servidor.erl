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
        {Cliente, login, UserName} ->
            Users = maps:get(users, State, #{}),
            case maps:is_key(UserName, Users) of 
                true ->
                    Cliente ! {self(), {login, error, user_already_exists}},
                    State;
                false ->
                    Cliente ! {self(), {login, ok}},
                    State#{
                        users => Users#{
                            UserName => Cliente 
                        }
                    }
            end;
        {Cliente, Mensaje} ->
            io:format("mensaje recibido de ~p: ~p ~n", [Cliente,Mensaje]),
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