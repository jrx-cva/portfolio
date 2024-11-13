-module(funcions2).
-export([functions/1]).


function(X) ->
    io:format("Variable X");
function(Y) ->
    io:format("Variable Y");
function(_) ->
    io:format("Variable _");