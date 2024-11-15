-module(cliente).
-export([ls/1, get_file/2, put_file/3]).

ls(Server) ->
    Server ! {self(), list_dir},
    receive
        {Server, FileList} ->
            FileList
    end.

get_file(Server, File) ->
    Server ! {self(), {get_file, File}},
    receive
        {Server, Content} ->
            Content
    end.

put_file(Server, Dir, File) ->
    Full = filename:join(Dir, File),
    case file:read_file(Full) of
        {ok,Binario} ->
            Server ! {self(), {put_file, File, Binario}},
            receive
                {Server, Reply} ->
                    Reply
            end;

        {error,Error} ->
            {error,Error}
        
    end. 
