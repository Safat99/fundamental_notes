# Builder Design Pattern
[source](https://www.youtube.com/watch?v=k4EkJgY9P4c&list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol&index=5&ab_channel=Telusko)

* Creational Pattern -> used for object creation
* We are providing the same object as a input and the output will be the same object.

    Object A ----setter()----> Object A

### Why Builder?
to create a object we normally use constructor. Where we have to give all the parameters. If we don't want to set an inital value in the time of creating object, we still have to pass some random/garbage value to it. Besides we also have to maintain the sequence when using the constructor.
So in short: 
* we have to pass all the parameters
* We have to maintain the sequences
* If we don't want to set a value when we are creating we can't do that.

Using Setter() we don't have to do that. This is the advantage of the builder pattern.


### Main Example
There are Phone class and Shop class where the main method is at the shop class. We want to create a phone and all the features of the phone are at the phone class.

The `Phone.java` will be:
```
package BuilderDesignPattern;
// Builder Pattern
public class Phone {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    // to create a object we need to make constructor
    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
```
Now the `Shop.java` class will be look like this:
```
package BuilderDesignPattern;

public class Shop {

    public static void main(String[] args) {

       // without using builder
//       Phone p = new Phone("Android", 2, "QualComm", 5.5, 3100);
//       System.out.println(p);

       // with using builder pattern
         Phone p = new PhoneBuilder().setBattery(233).setOs("Android").setRam(2).getPhone();
         System.out.println(p);

        /*
         we don't need to pass all the values. it will take default value
         we don't need to follow the sequences
        */
    }
}
```

The `PhoneBuilder.java` will be look like this:
```
package BuilderDesignPattern;

public class PhoneBuilder {

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;

    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, processor, screenSize, battery);
    }
}
```
