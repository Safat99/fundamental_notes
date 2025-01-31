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


## Simple Graphs
A graph with no self loop and parallel edges
