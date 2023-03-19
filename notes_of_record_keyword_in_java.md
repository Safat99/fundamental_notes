# Record keyword in Java
[source](https://www.youtube.com/watch?v=tNNz0dGlJbw&ab_channel=SebastianDaschner)

Records are called DTO (Data Transfer Object) type class which is mainly used to declare a special class type that acts as a "data carrier". This keyword is added to Java since JDK 14.

## Why needed?

To make our java code much more concise and readable.

A traditional class is normally declared as below:

```
public class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // all the getter() setter()
    // toString() method.
}
```

This whole code can be replacable by the `record` keyword. Java compiler will do the same thing when it sees:
```
record Point(int x, int y) {}
```

### Canonical Constructor
A Java record must always have a constructor that takes the same argument type sequence as the field types declared for that record. This is called canonical constructor. Compiler implicitly creates this constructor or can be explicitly created manually.

## Features of Record
Records will have:

* `private final` fields for each header components.
* public accessor methods
* a [**canonical constructor**](###canonical-constructor) (are signature as header)
* compiler generates equals(), hashCode(), toString() method for a record type.

### Restrictions/Limitations of record

* can't declare `native methods`.
* can't declare fields(variables) other than in the header.