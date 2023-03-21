# Elastic-Search-->
##### No Define defination.
---> No SQL database,Solution to big data,search engine
* Sacable open source,multitenant capable ,full text ,distributed search and analytics engine
* Provide Realtime data analytics and searches 
* Document Oriented Database
## Use of Elastic Seacrh 
***
* Application Search 
* Website Search
* Enterprise Search
* Logging and log analytics 
* Infrastructure meteics and container monitoring(Docker)
* Security Analytics 
* Business Analytics

## Why we use Elastic Search ?
Product with huge database facing issues.productuct infromation retriveal taking too long.Because Relational database work comparartively slow  when it comes huge data and fetching search through SQl Queries.beacuse tables ar dependen on another and basically normal search queries use linear seach techique for find any data. coplexity of n. if a table have 100000 row.for a search it may take 100000 times for find result.
All those thing Lead 
**Poor User Experience.**
***
## Elastic Search VS SQL

|SQL|VS|Elastic Search|
|----|-----|----|
|Column|----|Field|
|Row|----|Document|
|Table|----|Index|
|Schema|----|Implicit|
|Database|----|Cluster|
|Table|Data oriantation |Json|

## RDMS --> Databases -->Tables --> Columes/Row
## Elastic Search --> Index --> Types --> Document with properties
### Elastic Search API
* Document API ---> 1. Single Document APIs(CRUD) 2. Multi Document APIs
* Search API
* Indces API
* Cat API
* Cluster APi

## Elastic Search Basic Termas

* Index --> An index is like a table in a relational database.It store compklex data structure  in the from of Json.Index are some time data organization mecganisam aline the user with pertison of data with a certain way.it provide optimize collection of document has a feild a key value pare with store data.index organize data logically which map with one or more shards.
#### Index Craete API
'PUT/my-index-000001'
**Request**
'PUT/000001'
* Cluster --> Some collection of shards and replica are called nodes and collection of nodes are called Cluster.For example Table Of database.**Collection of connected Nodes are called Cluster**
* Shards --> Shards are the pieces of our information.
> IF you have an index of 1000 documents  and a cluster with 2 nodes
> Each node will hold 500 documents
> if  you have assigned the value shard_number =2 in your index.
> Each machine in your cluster only has to deal with some pieces of your data.



**PUT/my_index_000001**
**{***
 "Settings":{
              "number_of_shards": 3,
              "number_of_replicas":2
              }
**}**
'''
* Nodes --> collection of shards and replicas.
***

## List of company Use Elastic Search 
* NETFLIX
* EBAY
* WALMART

# Document - 


# types-

# indices-
RESTful API-->

clint API's-->

analytic tool--> kibana
why git clone canceled in intellij
