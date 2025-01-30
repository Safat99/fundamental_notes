# Sets

A set is an **unordered** collection of **distinct** objects(elements)

$$
c = \{0,1,0\} >> not\, a\,set 
$$

The size of set S as |S|, denotes how many elements we have in the set. Also known as **cardinality** of the set.

Example: 

$$
if, \; V = \{A, E, I, O, U\} \\ 
then \; |V| = 5
$$

* A $\in$ V means, A exists on V
* B $\notin$ means, B does not exist on V.

## Subset
A set A is a subsset of set B, if every element in set A appears in set B.

We denote this as
$$
A \subset B \; or A \subseteq B
$$

If A is not a subset of B, We denote this as:

$$
A \nsubseteq B
$$


**Ques:** If |A| = n, how many subsets does A have? <br>
==> $2^n$

Ex:

$$ 
A = \{1,2,3\} \\[10pt]
P(A) = \{\; \emptyset, \{1\}, \{2\}, \{3\}, \{1,2\}, \{1,3\}, \{2,3\}, \{1, 2, 3\} \; \} \\[10pt]
|P(A)| = 8 = 2^3
$$

## MultiSets
A set that allows duplicate elements.

M = {1, 2, 2, 3, 4, 5} ==> multiset $\neq$ set

A multiset M is an **ordered pair** (A, m), where:
- A is the underlying **set** (the unique elements) 
- m is a **multiplicity function**, assigning a **non-negative integer** to each element in A, representing the **frequency** 
such that 
$$
m:A \to Z^+
\\[5pt]
M = \{a,a, b,b,b, c, d \}
\\[5pt]
$$
We can define:

* Underlying set: A = {a,b,c,d}
* Multiplicity function:
$$
m(a) = 2, \; m(b) = 3, \; m(c) = 3, \; m(d) = 1
$$

### Application of Multisets

- Counting & Combinatorics
- Database & Information Retrieval
    - `select` queries often return duplicates


## Set Builder Notation
The set S = { x: a rule about x}

The set S contains element x, such that x follows the rule given.

Example:

$$
Even = \{x: \in Z \; and \; 2 | x  \}