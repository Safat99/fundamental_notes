# Factory Pattern
[source](https://www.youtube.com/watch?v=pt1IbV1aSZ4&list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol&index=3&ab_channel=Telusko)


It's a creational design pattern. So in the case of new object creation factory pattern is widely used.

The main theme about factory pattern is somebody else will provide me the object that I needed. This is the `FactoryClass`. 

In SDLC whenever, we build a project we have to work with different modules. ALl the modules should have **low coupled**. If we want to achieve low coupling, we will use factory. Instead of we creating the object, we ask someone else to create the object. **Factory(factoryClass)** will give us the object.


## Main Example
In the video there give an good example of implementing Factory pattern in the context of mobile phone's OS. 


Let's create our factory package's main method

The main class will be named as `FactoryMain.java`
```
package FactoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args) {

// before using factory pattern
//        OS obj = new Windows();
//        obj.specs();


// after using factory pattern
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.specs();
    }
}
```
The main interface can be look like `OS.java`
```
package FactoryDesignPattern;

public interface OS {
    public void specs();
}
```

The 3 class Windows, Android, Ios will implement this OS interface. So there class will be look like:

`Android.java`
```
package FactoryDesignPattern;

public class Android implements OS {

    public void specs() {
        System.out.println("most powerful OS");
    }
}
```
The `IOS.java` :
```
package FactoryDesignPattern;

public class IOS implements OS {
    @Override
    public void specs() {
        System.out.println("most secure OS");
    }
}
```
and the `Windows.java`:
```
package FactoryDesignPattern;

public class Windows implements OS {
    @Override
    public void specs() {
        System.out.println("Im about to die...");
    }
}
```
