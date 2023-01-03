## Answers of those Questions that I have failed to satisfy

## Why do we use DTO? 
```
In Spring DTO is an object that carries data between processes.
When we are working with remote interface, each call is expensive.
Also we needs to be serialize our calls.
```

## @Id, Generated Value why this annotations are used?

```
The id annotation have inherited from javax.persitence.id
Indicating that member field below it is the primary key of the current entity. So hibernate and spring frameworks can do all the necessary things for this annotation.
```

**Generated Value**
[full details](https://stackoverflow.com/questions/47676403/spring-generatedvalue-annotation-usage)
```
There are 4 options to generate primary keys.
1. GenerationType.AUTO
2. GenerationType.IDENTITY
3. GenerationType.SEQUENCE
4. GenerationType.TABLE
```
### GenerationType.Auto

* the default generation type. It tells lets the persistance provider to choose the default generation strategy. We use the **Hibernate** as our persistance provider. 

* For most popular databases, it selects **GenerationType.SEQUENCE**

### GenerationType.IDENTITY

* easiest but not for the best one from the performance view.
*   


## FetchType Lazy,Eager details --????

[full details is on here](https://stackoverflow.com/questions/2990799/difference-between-fetchtype-lazy-and-eager-in-java-persistence-api)

Sometimes we have two entities and they have some relations on it between them. 

When we want to load an entity from the database JPA loads all the fileds(columns) for us. But we have 2 options how the datas are come to us from DB

* To load it together(both entities) with the rest of the fields (i.e. eagerly)
* To load it on demand(i.e.lazily).


```
LAZY = fetch when needed
EAGER = fetch immediately

-------------------------

FetchType.LAZY = This does not load the relationships unless you invoke it via the getter method.

FetchType.EAGER = This loads all the relationships.

```

## Primary Key and foreign key explanation(why I have commented the line of Shared Primary Key Foreign Key)

[details](https://learn.microsoft.com/en-us/sql/relational-databases/tables/primary-and-foreign-key-constraints?view=sql-server-ver16)

* when we specify a primary key(pk) constraint for the table, the db engine enforces data uniqueness by automatically creating a unique index for the primary key column.

* This index also permits fast access to data when pk is used in quieres.

* If a pk is defined on more than one column, values may be duplicated within one column, but each combination of values from one column definition must be unique.  


```


```

## Getter() Setter() are in the Domain of Encapsulation. Give The necessary explanation of them..

```
```
## Why haven't I use any kind of validation to my codes

```

```

## Why getter() setter() is used?
```
```
## Why this keyword is used? Why not are we using `this.something` for returning the getter().
```
```

