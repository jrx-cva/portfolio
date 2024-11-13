-module(functions).
-compile(export_all).

greet(male, Name) ->
     io:format("Hello, Mr. ~s!", [Name]);
greet(female, Name) ->
     io:format("Hello, Mrs. ~s!", [Name]);
greet(_, Name) ->
     io:format("Hello, ~s!", [Name]).


head([H|_]) -> H. 
    % functions:head([1,2,3,4]).
    % 1

second([_,X|_]) -> X.
    % functions:second([1,2,3,4]).
    % 2


same(X,X) ->
    true;
        % functions:same(1,1).
        % true

same(_,_) ->
    false.
        % functions:same(1,2).
        % false
