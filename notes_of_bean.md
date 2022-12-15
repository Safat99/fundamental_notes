## Bean or @Bean in Spring
This annotation is used to **mark a method** as one that creates a bean and Spring will then add to it to the **context** for us.

## Definitions:
### Bean
In Spring, the objects that form the backbone of our application and that are managed by **Spring IoC Container** are called Beans.

### IoC (Inversion of Control)
IoC is a **process** in which an object defines its dependencies without creating them.
* The object hand overs the task of contructing the depeendencies to an IoC container.

* **Why?** --> Managing lots of objects are critical. This is where IoC comes to rescue.

## **Description**
Let we have a class Company. which is also dependent on another class Address.
```
@Component
public class Company{
    private Address address;
    public Company(Address address){
        this.address = address;
    }
} 
```
So for this Company class, Address class is the dependency. So we need to define it as well:
```
public class Address{
    private String street;
    private int number;
    // constructor
    // getter() and setter()
}
```
Now if we want to call can object of Company we have to first create an address object of Address class and then initiate company object with address as constructor.
```
Address address = new Address("High Street", 1000);
Company company = new Company(address);
```
So if we have a lot of dependency like this type of subclass, maintainig all of them is a critical task. where IoC is the rescuer.

If we create a Bean all this things from initiating to descrution will be handled by Spring IoC Container. As spring container creates all this objects we can access it from anywhere in the app without adding the objects. All the works of object creation will done by Spring Configuration.

**When Spring application startup, spring container will scan code and it will create beans or objects in other words of necessary classes**

To create Beans we have to do:
```
@Configuration
//Configuration class will create a bean with type address
@ComponentScan(basePackage Classes = Company.class)
// this will instrucdt the contaier to look for beans in the package containing company class
public class Config{
    
    @Bean
    public Address getAddresS(){
        return new Address("High Street", 1000);
    }
}
```
Then we have to build our IoC container. As a result our beans will be created perfectly.<br>
To do that,
We need an `Instance` of `AnnotationConfigApplicationContext`
```
ApplicationContext context = new AnnotationConfigApplicationContext(Config.class)
```