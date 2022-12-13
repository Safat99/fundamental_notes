## Introduction
----
[source1 >> **bezkoder**](https://www.bezkoder.com/spring-boot-pagination-filter-jpa-pageable/)<br>
[source2 >> **Interface Page<T>**](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Page.html)<br>
[source3 >> **Interface Pageable**](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Pageable.html)



Paging means displaying a small number of all, by a page.

A **page** is a **sublist** of a list of objects. It allows gain information about the position of it in the containing entire list. 

`Page` is a sub-interface of Slice with a couple of additional methods. It contains total amount of elements and total pages of the entire list.

```
public interface Page<T>
extends Slice<T>
```
**Pageable** is a  **Abstract interface** for pagination information. Spring Data infrastructure will recognizes this parameter automatically to apply pagination and sorting to database.

```
public interface Pageable
```
<br>

## How Spring works with Pagination
---
Spring Data JPA provides way to **implement pagination** with `PagingAndSortingRepository`. This is a extended version of `CrudRepository`. But the `JpaRepository` also extends the `PagingAndSortingRepository`. So we can also use the `JpaRepository` instead of this. 

```
public interface PagingAndSortingRepository<T, ID> extends CrudRepository<T, ID> {
  Page<T> findAll(Pageable pageable);
}
```

In JPA, We can use `Pageable object` as input parameter to make pagination.

In the method definition, this parameter will be added and the return type will be a `Page<User>` :

```
Page<Tutorial> findAll(Pageable pageable);

Page<Tutorial> findByTitle(String title, Pageable  pageable)
```
When we want to get pagination (with or without filter) in the results, we just add `Pageable` to the definition of the method as a parameter.

<br>

## Example of Pageable interface with JPA
---
`Pageable` can also be used for paging and sorting with the help of `PageRequest.of()` method.

```
int page = 0;
int size = 3;

Pageable pageable = PageRequest.of(page, size);

// lets our model class is Tutorial
tutorials = tutorialRepository.findAll(pageable).getContent();
show(tutorials)
```
`page` : zero based page index. must not be negative <br>
`size` : numbers of rows in a page to be returned. must be greater than 0.

