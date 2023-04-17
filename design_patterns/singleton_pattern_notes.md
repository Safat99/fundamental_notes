# Singleton Pattern

source --> head first design pattern book <br>
source2 --> [telusko video](https://www.youtube.com/watch?v=yvwIZzur-lw&ab_channel=Telusko)


## When it is used?
When we want to eliminate the option of instantiating more than one object.

We will create one object and always only one object will be called from this class.

## Why needed?
* There will be case where if we are to instantiate more than one object of a class, we will find problems like incorrect program behaviors or inconsistent results. Such as:
    1. thread pools,
    2. caches,
    3. dialogue boxes,
    4. object that handle preferences and registry settings.


* Singleton pattern gives us a global point of access just like a gloabl variables without its **downsides**. 
The downsides of a global variable are:

    *If we assign a object to a global variable, the object might be created when the app begins if needed or not. So it is not efficient in limited resources.
    But in singleton, the object is created if needed.*

* Let's we have an object that contains registry settings. We don't want to multiple copies of that object and its values running around -- that will lead to chaos. By using singleton object, we can assure that every object of our application is making the use of same global resources.

* Singleton object is often used to mange pools of resources, like connections or thread pools.

## How can we prevent more than one object being initiated?
If a class has no public constructor we can not create a object.


## How to implement Singleton pattern to create singleton object?

The singleton class don't allow users to create instance with any default constructor. It has a public method call getInstance() where it returns only one object. The 3 steps are:
* A **static variable** to hold the one instance of the class Singleton.
* To don't allow users to create object with default constructor, making a private default constructor.
```
private Singleton() {}
```
* create the **static** getInstance() method which gives the way to instantiate the class. This will return an instance of the class.


The Singleton Class:
```
private class Singleton {
    private static Singleton firstInstance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if (firstInstance == null) {
            firstInstance = new Singleton();
        }
        return firstInstance;
    }

    // other useful methods
}
```

## Java Static method / the class method
* static method belongs to the class rather than the object of a class.
* static method can be invoked/called without the need for creating an instance of a class. (means we can call the static method wihout creating an object.)
* another power of static method is it can access any static variable and change them.

also using the static keyword, when the class is loaded object will be created also and stored in the memory as a global variable. If we don't manually create any object, it will also be stored in the memory.

