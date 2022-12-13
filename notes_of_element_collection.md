## Introduction of Element Collection (Why it is needed or used)
------------
[reference](https://www.callicoder.com/hibernate-spring-boot-jpa-element-collection-demo/)<br>

Suppose we have a table of users who have multiple phone numbers and addresses.<br>
So to that we can follow 3 approaches: <br>
* we can use a column which will be String data type and the list of numbers and addresses will be inputted there. But suppose our address have some more informations like street,city,house_number, in short it is an `Embeddable type`. So the possible solution will be use an **`json/dictionary based structure`** on that column. But if we want to access them or update them it will be a difficult task. To simplify that we can add more columns in the main table but adding more column in that table will make the table more complex.
<br>
* This relationship can be achieved using **`OnetoMany`** relationship. We will have to separate them into new `phone_number` table and `address` table. This approach is widely and most used and more optimized approach.
<br>

* But like our case if the data types of the schema are Collection type more *briefly basic(phone_number) and embeddable(address) type*, JPA has a simple solution in the form of **`ElementCollection`**.

 ### Process
we need to follow the previous *reference* for the brief process. The important summary of the notes are given below:<br>

* JPA's `@ElementCollection` and `@CollectionTable` are used to map the collection into a new table.The `@CollectionTable` annotation will configure the table.

* When we are using `Embeddable` type with Element Collection, we can use the `@AttributeOverrides` and `@AttributeOverride`annotations to override/customize/modify our embeddable type
    
