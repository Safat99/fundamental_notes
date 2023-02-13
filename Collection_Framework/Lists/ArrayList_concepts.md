How you can change the virtual capacity of an ArrayList?

* ArrayList and all the collections will only store objects not primitive types of data
* we have to write the wrapper class in the array list.

```
ArrayList<int> --> not allowed
```
 How can we get the value from ArrayList?
 3 ways -->>
    1. using for loop -->> we can iterate the values of arrayList by arrayList.get() method
    1. using for each and
    3. streams with lambda
    4. using iterator
    ```

iterator:
iterator is an interface which is use to iterate the values from the collection  


declration:

we can create an ArrayList with the help of another List too using the 
Arrays.asList();

**Virtual Capacity**
<br>
by default virtual capacity is 10

---
## Synchronize(ThreadSafe) ArrayList in Java

---

* What is the different between synchronize ArrayList and NonSynchronize ArrayList?

-->

By default ArrayList is not a synchronized. But we can do that.

