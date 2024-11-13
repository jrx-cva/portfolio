%no se si funcionara

-module(leer_teclado).
-import(lists,[nth/2]).
-export([start/0,user2/5,user1/3,inp/1]).

inp(P) ->
{ok, [S]} = io:fread("entry: \n", "~s"),

P ! S.


user2(0, USERID1,_,_,_) ->
USERID1 ! bye,
io:format("finish");

user2(N, USERID1,Mess,Rep,K) ->
USERID1 ! {message, self(),Mess,K},
receive
    reply ->

    S=self(),
        spawn(third, inp, [S])
end,
user2(N-1, USERID1,Mess,Rep,K+1).

user1(Mess,Rep,K) ->
receive
        bye ->
            io:format("conversation over");
        {message, USERID2,Mess,K} ->
            io:format("~p~n",[nth(K,Mess)]),
            USERID2 ! reply,
            user1(Mess,Rep,K+1)
    end.

start() ->
Mess=["HEY","sup","how are you","yhank you","bye"],
USERID1=spawn(third, user1, [Mess,Rep,1]), 
spawn(third, user2, [5,USERID1,Mess,Rep,1]).