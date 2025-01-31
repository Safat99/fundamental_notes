# Graphs

## Undirected Graph or General Graph
- A undirected graph is a *pair* $G = <V, E>$
- V is a nonempty *set* of vertices or nodes
- E is a **set of edges joining pairs of vertices** which can be written as:
    - E $\subseteq$ $\{ \{u,v\} : u,v \in V \}$

Suppose this is a graph 

```
A --- B
|\   /
| \ /
D--C
```
So, We can represent this graph as:\

```math
G = ( \{A,B,C,D\},\; \{\;(A,B), (A,C), (A,D), (B,C), (C,D)\ \; \})
```

Here, If $V$ is the set of Vertices/nodes and $E$ is the set of edges then,

```math
V = \{A,B,C,D\} \\
E = \{\;(A,B), (A,C), (A,D), (B,C), (C,D)\ \; \}
```

There is a confusion in the edge representation in directed and undirected graphs. Will fix in future.


## Simple Graphs
A graph with **no self-loop and no parallel edges**(multiple edge between same two nodes) is called a simple graph

the following has parallel edges and a self loop\
so not a simple graph.

```
(A) ---- (B)    (A)-,
 \_______/       \_/
```


## Directed Graph
A directed graph G = (V, E) is a directed graph where:
- V is a non-empty set 
- E $\subseteq$ V $\times$ V is a set of edges joining(ordered) pairs of vertices.


## Subgraph


## Path




