## Topics

* A particular stream of data
* Similar to a table in the database
* We can have as many topics as we want
* A topic is identified by its name.

## Partitions
* Topics are split into partitions
* Each partition is ordered
* When we create a topic we will set our partitions, we can change it later too. 

## Offset
* Each message within a partition gets an incremented id which is called "Offset"

## Example
![topic_example](topic_example.png)

## More info

* Offset only have a meaning for a specific partitions.
* Order is guranted within partition. (not across partitions)
* Data is kept only foor a limited time. (default 1 week)
* Once the data is written to a partition, it can't be changed (immutability)
* Data is assigned randomly to a partition unless a key is provided.


## Brokers (servers)
* Kafka cluster is composed of multiple brokers (servers).
* Each broker is identified with its ID
* Each broker contains certain topic-partitions. That means, some amount of data will be in each brokers. But not all as Kafka is distributed. 
* After connecting to any broker (called **Bootstrap broker**), you will be connected to entire cluster.
* Big clusters have over 100 brokers, but we can start with 3 (good number)

### Broker and Topics

that's the beauty of kafka is:
**When we create a topic, Kafka will automatically assigned the topic and distributed accross all the brokers**. 

![ef](broker_topic-paritions.png)

*Data is distributed and Broker 103 doesn't have any Topic-B data.*