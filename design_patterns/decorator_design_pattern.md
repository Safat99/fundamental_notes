# Decorator Design Pattern
* It's a **structural** (it helps us to improve Java code quality/readability) design pattern. 

* this pattern acts as a wrapper to existing class.

### Why do we need?
It allows a user to add new functionality to an existing object without altering its structure.

### When is it used?
Whenever we want to modify the object at the **runtime**, then we use this decorator design pattern.

### How it works?
* This pattern creates a decorator class which wraps the original class and provides additional functionalities keeping class intact.

* Whatever the different class we have, they will extend the decorator. It will call the decorator function(using **super**) before implementing its method.