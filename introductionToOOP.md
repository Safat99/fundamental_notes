# Introduction to OOP
notes

-------------------------
**Primitive Data** <br>
variables those store single or simple value are the primitive data types.<br>
Examples --> byte, int, float, double, boolean, char etc.

At the early stage of programming the codes are simple and small. So they are easily handled by those data types. Soon after program becomes more complex and wider. Then the datas become no longer primitive. <br>

Now to organise those large, complex codes the need of groupping similar types of datas became obvious. So **array,string** comes along. All the similar types of data started groupping by arrays. 

In the referened video, an example of chess game was given.

### Chess example
**The arrival of Struct** 

To manage all the functionalities of each item in the chess game, suppose a knight has some properties. They are position, color, boolean(is dead or alive). We need more variables like each pawn etc. And to control all this we need to group this properties. In C programming the **struct** handles all these things.

In C struct is similar to array. But it can store different types of data(int, float, char) on the same struct. This **struct** is called the **precursor of Object**.

**Limitations of Struct**

We cannot define function inside struct. We can only reference them. 

**Objects Advantage:**
Objects can store both data variable and functions.<br> 
```
Object is called the instance of Class and 
Class is the template of creating objects
```
We don't need to initialize class in class. We can define function variable in class.

## What is OOP?
```
OOP is the best tool have the programmers right now to create complex programs by grouping together by datas and functions
```

## 4 principles of OOP

1. Abstraction
2. Encapsulation
3. Inheritance 
4. Polymorphism
---
## Abstraction
Users(client) don't have the full control of the functionality rather user can see the list of functions
There are two ways of abstraction:

1. Full Abstraction(100%)==> Using **Interface**. ==> All the implementations are hidden from users.
2. Partial Abstraction. ==> Using **Abstract Class** 

Example
```
abstract ClassName {
    ...
    ...
    abstract void message();
}
```

There are two types of method.

* non-abstract method (traditional method)
* abstract method.

Abstract Method e.g. `abstract void message()` has some features/rules:

* there will be no body {}
* It must be inside the abstract class
* It must be overriden ==> If some class extends this abstract class, then this method must be overriden
* **It can never be final and static.**

*Inside abstract class, we can use both abstract and non-abstract method
But when 100% abstraction(interface) happens ==> only abstract method have to be used.*

* abstract method can never be in the non-abstract class
* We cannot create any object of Abstract class. Instead we have to create reference variable 

### Example of abstraction
```
abstract class MobileUser {
    abstract void sendMessage();
}

class Rahim extends MobileUser {

    @Override
    void sendMessage() {
        System.out.println("Hi this is Rahim");
    }
}

class Karim extends MobileUSer {
    
    @Override
    void sendMessage() {
        System.out.println("Hi, this is Karim!");
    }
}
```
The main class will be look like this.  

```
public class Test {
    
    public static void main(String[] args) {

        MobileUser ms;
        ms = new Rahim();
        ms.sendMessage();

        ms = new Karim();
        ms.sendMesage
    }
}
```
---

### Interface

* An interface is a collection of abstract methods
* Only abstract methods are in the interface
* It is useful for fully abstraction
* Multiple inheritance can be possible of interface.

Declaration
```
interface className {

}
```
in the interface method, java compiler automatically include auto, public inside the **methods of interface**
<br><br>

### Advantage(Why do we use interface?)
A class can only inherit only one super class using the **extends**. It can not inherit multiple class. But Interface can extend multiple class.
Interface can inherit multiple super class. <br>
<br>

### Why interface supports multiple interface and class don't?

If there is some common name method between two class, and the 3rd class  wants to extend the both class, it willface ambiguity when it creates an object and call that common-name method.


### Features of Interface:
* the interface variable will be alltime constant.
Compiler automatically includes **publc static** in front of the variable.
* We **cannot declare any instance variable** in interface
* All **method** has to be **public**
