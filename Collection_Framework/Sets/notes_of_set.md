## Set Interface

### Overview
* Cannot contains duplicate values
* Unordered Collection. Set will not print like we insert them.
* Set is a interface not a class.
* random access of an element can be achieved.

We cannot create **instance** of a interface. 
To create an instance of an interface we have to use a **Class** which **implements** the **interface**.
```
Set<String> names = new HashSet<String>();
```
Here, HashSet is a **Class** and **Set** is a interface.

---
Most useful applications of Set
* remove duplicates from a given list
```
    List<Integer> nums = new ArrayList<>();
    nums.add(100);
    nums.add(100);
    nums.add(2);
    nums.add(2);
    nums.add(300);
    nums.add(300);
    System.out.println("nums as List: " + nums);
    
    Set<Integer> numsSet = new HashSet<>(nums);
    System.out.println("nums as HashSet: " + numsSet);
```
This will give the following output:
```
nums as List: [100, 100, 2, 2, 300, 300]
nums as HashSet: [2, 100, 300]
```
## Different Types of Sets
### HashSet
* This set implementation actually use a **HashTable** as its storage mechanism.
* Hashtable allows extremely fast operation.
* Hashtable takes **constant time** whatever the size of the List is. Compare to List, all the
basic operations like add(), remove(), insert() takes constant time; where ArrayList will take more time as the size gets bigger.

* default capacity of HashSet is 16, **load factor** is 0.75
* doesn't maintain the insertion order
* best approach for search operation.

### TreeSet
**Features**

* It maintains the natural order, not the insertion order. Like for string
it maintains the alphabetical orders. 
* HashSet is way faster than TreeSet but we use TreeSet in such situation where we needs to maintain the order as well. 

### LinkedHashSet
**Features**
* It is similar like the HashSet. But it keeps the insertion order
* Almost as fast as HashSet. Slightly less it keeps the insertion order.
* maintain the insertion order.