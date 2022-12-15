## Introduction
A enum is a special "class" that represents **a group of constants** 
(Unchangeable variables like **final** variables)

## Declaration
```
public enum Level{
    LOW,
    MEDIUM,
    HIGH
}
```
*Enum is short for "enumerations" which means "specially listed"*

## Diff Between Enums & Classes
* enum constants are/must be public, static and final whereas class can be anytype we knows
* An enum can have attributes and methods
* An enum cannot be used to create objects. (It cannot extend other classes but can implement interfaces)

## When and Why we use ENUMs
* We can use where we will not change values like months, days, colors etc.
