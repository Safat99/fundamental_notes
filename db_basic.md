## Database Fundamentals

What is Database?
==> organised collections of data

Why needed?
```
To store all datas in a formatted way db is needed.
```
Relational Database
```
Where multiple tables are handled
```

### Transactions
Transactions are group of set of tasks(queries) into a single execution unit. If any of the task fails, the transaction fails. So a transaction only have 2 result, success or failure. 

**A database transaction, by definition must be atomic, consistent, isolated and durable.**


###  ACID Property
In order to maintain consistency in a db, before and after the transaction certain properties are followed.

* Atomacy
* Consistency
* Isolation
* Durablilty

To record all the changes in the database **Commit** is used and to undo or go to the last commit **Rollback** is used.


