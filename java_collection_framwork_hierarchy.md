# Java Collection FrameWork(Overview)


* source [this_video](https://www.youtube.com/watch?v=B4WmfcjQ9QA&list=PLFGoYjJG_fqoDQHufg7XVk-yb2w6CNpgF)


* collection framework and the collection interface are not the same. The collection interface is the part of the whole collection framework.
<br>
<br>
### Why Collection is useful:
* reduces programming effort
* Optimized performances as this frameworks used the best algorithms
* built in methods and classes
* Inter operationability --> Two APIs communicate with each other with collections like --> transfer values in Dictionary formats etc.<br>
<br>

### The Collection Framework Hierarchy
```
collection_structure
├── Collection_interface
│   ├── List_interface
│   │   ├── Array_list
│   │   ├── Linked_list
│   │   └── Vector
│   ├── Queue_interface
│   │   ├── Linked_list
│   │   └── Priority_queue
│   └── set_interface
│       ├── Hash_set
│       ├── Linked_hash_set
│       └── Sorted_set
│           └── Tree_set
├── Map_interface
│   ├── HashMap
│   ├── hashtable
│   ├── LinkedHashMap
│   └── SortedMap
│       └── TreeMap
└── Object_class
    ├── Arrays_class
    └── Collections_class
```

### List Interface 
1) an Order based collection. (We can traverse it through for loops).
2) Index based collection. (We can search the value by Index)
3) Example :: ArrayList, LinkedList
4) Dynamic Array (Size will be automatically increased and decreased).

### Set Interface
1. Cannot have the duplicate values

### Queue Interface
1. FIFO (First In First Out)
2. LIFO (Last In First Out)

### Map Interface
1. Stores Data in **key:value** formats
2. We can directly search (search time is faster than traversing as uses the memory address of the keys)

### Iterator Interface
1. To iterate the elements from a collections(anything. It can be ArrayList or Map or others.)
```
When the datas are not ordered like in the arrays, we cannot use the for loops for searching. In that case we have to iterator and use the next() method to it.
```

### Common Methods of Collection Frameworks
In this video only the name of the methods are shown:<br>

* add()
* addAll()
* remove()
* removeAll()
* size()
* clear()
* contains()
* retains()
* retainsAll()

<br>

### Common Exceptions
* NullPointerExceptions
* ClassCastExceptions
* IllegalArgumentExceptions
* IllegalStateExceptions
* UnsupportedOperationExceptions -- > When particular collection cannot be modified this exception shows.
