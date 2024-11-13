-module(cliente).
-export([start/0, start/2, start1/0]).

start1() ->
    start(server, 'servidor@localhost').

start() ->
    start(server, 'servidor@DESKTOP-TUPS0JG').

start(PID, Node) ->
    UserName = prompt("Introduzca su nombre de usuario: "),

    State = #{
        username => UserName,
        pid => PID,
        node => Node,
        receiver_pid => self()
    },

    case login(State) of
        {ok, State2} ->
            io:format("Hola ~s, escribe /help para ver los comandos disponibles ~n", [UserName]),
            KeyboardPID = spawn_link(fun() -> loop(State2) end),
            receiver(State2#{keyboard_pid => KeyboardPID});
        {error, Error} ->
            {error, Error}
    end.

prompt(Text) ->
    String = io:get_line(Text),
    Binary = binary:list_to_bin(String),
    Length = size(Binary),
    binary:part(Binary,0,Length-1).


loop(State) ->
    case prompt("> ") of
        <<"/exit">> ->
            close(State);

        <<"/help">> ->
            io:format(" /exit                  -- salir ~n"),
            io:format(" /ls                    -- listar canales ~n"),
            io:format(" /activate canal        -- activar canal 'canal' ~n"),
            io:format(" /create canal          -- crear nuevo canal 'canal' ~n"),
            io:format(" cualquier otro texto   -- escribir mensaje ~n"),
            loop(State);

        <<"/ls">> ->
            io:format("listando canales... ~n", []),
            send(State, ls),
            loop(State);

        <<"/activate ", ChannelName/binary>> ->
            io:format("abriendo canal ~s... ~n", [ChannelName]),
            send(State, {activate, ChannelName}),
            loop(State);

        <<"/create ", ChannelName/binary>> ->
            io:format("creando canal ~s... ~n", [ChannelName]),
            send(State, {create, ChannelName}),
            loop(State);

        Text ->
            send(State, {write, Text}),
            loop(State)
    end.

receiver(State) ->
    ServerPID = maps:get(server_pid, State, undefined),
    receive
        {ServerPID, {close, ok}} ->
            io:format("[Server] -> ~p~n", [{close, ok}]),
            ok;
        {ServerPID, {close, error, Error}} ->
            io:format("[Server] -> Error al cerrar sesión: ~p~n", [Error]),
            {error, Error};
        {ServerPID, {ls, ok, ChannelList}} ->
            io:format("Canales disponibles: ~n"),
            lists:map(fun (Channel) ->
                io:format(" - ~s ~n", [Channel])
            end,
            ChannelList),
            receiver(State);
        {ServerPID, {ls, error, Error}} ->
            io:format("[Server] -> Error al listar canales: ~p~n", [Error]),
            {error, Error};
        {ServerPID, {activate, ok}} ->
            receiver(State);
        {ServerPID, {activate, error, Error}} ->
            io:format("[Server] -> Error al activar el canal: ~p~n", [Error]),
            receiver(State);
        {ServerPID, {write, ok, UserName, Message}} ->
            io:format("~s: ~s~n", [UserName, Message]),
            receiver(State);
        {ServerPID, {write, error, Error}} ->
            io:format("[Server] -> Error al mandar mensaje: ~p~n", [Error]),
            receiver(State);
        {ServerPID, {create, ok}} ->
            receiver(State);
        {ServerPID, {create, error, Error}} ->
            io:format("[Server] -> Error al crear canal: ~p~n", [Error]),
            receiver(State);
        {ServerPID, Response} ->
            io:format("[Server] -> ~p~n", [Response]),
            receiver(State);
        {OtherPID, Response} ->
            io:format("[Unknown ~p] -> ~p~n", [OtherPID, Response]),
            receiver(State)

    end.

login(State) ->
    UserName = maps:get(username, State, <<>>),
    send(State, {login, UserName}),

    receive
        {ServerPID, {login, ok}} ->
            {ok, State#{server_pid => ServerPID, status => connected}};
        {_PID, {login, error, Error}} ->
            {error, Error};
        {_PID, _} ->
            {error, unknown_message}
    after 3000 ->
        {error, timeout}
    end.

send(State, Message) ->  %envia mensajes
    PID = maps:get(pid, State, undefined),
    Node = maps:get(node, State, undefined),
    ReceiverPID = maps:get(receiver_pid, State, undefined),
    {PID, Node} ! {ReceiverPID, Message}.

close(State) ->
    send(State, close),
    ok.
