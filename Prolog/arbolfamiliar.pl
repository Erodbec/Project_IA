child(bridget,caroline).
child(donna,bridget).
child(donna,emily).

descend(X,Y):-child(X,Y).
descend(X,Y):-descend((X,M),descend(M,Y).







