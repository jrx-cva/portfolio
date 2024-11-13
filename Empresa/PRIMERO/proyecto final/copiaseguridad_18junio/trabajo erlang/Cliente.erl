-module(cliente).
-export([start/0, start/2]).

start() ->
    start(server, 'servidor@DESKTOP-TUPS0JG').

start(PID, Node) ->
    UserName = prompt("Introduzca su nombre de usuario: "),
    
    State = #{
        username => UserName,
        pid => PID,
        node => Node
    },

    case login(State) of
        {ok, State2} ->
            io:format("Hola ~s, escribe /help para ver los comandos disponibles ~n", [UserName]),
            spawn_link(fun() -> loop(State2) end),
            receiver(State2);
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
        <<"exit">> ->
            ok;

        <<"/help">> ->
            io:format(" exit                   -- salir ~n"),
            io:format(" /ls                    -- listar canales ~n"),
            io:format(" cualquier otro texto   -- escribir mensaje ~n");

        <<"/ls">> ->
            io:format("listando canales... ~n", []),
            loop(State);

        Text ->
            io:format("~s~n", [Text]),
            loop(State)
    end.  

receiver(State) ->

    State2 = receive
        {_PID2, Response} ->
            io:format("[Server] -> ~p", [Response]),
            State     
    end,
    receiver(State2).   

login(State) ->
    UserName = maps:get(username, State, <<>>),
    send(State, {login, UserName}),

    receive
        {_PID, {login, ok}} ->
            {ok, State#{status => connected}};
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
    {PID, Node} ! {self(), Message}.

