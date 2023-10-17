Event streaming is the practice of capturing events in real-time from sources like databases, sensors, mobile devices and software applications. Kafka captures events in order. It then can process it durably. 

## Components: 

**Kafka:** itself a distributed system consisting of different kinds of servers and clients that communicate events via high-performance TCP network protocol. 

**Producers:** Publish messages/events. They are the source of data. 

**Brokers:** A broker refers to a server in the Kafka storage layer. It stores event streams from one or more sources.  

**Cluster:** Distributed computing system. Consists of several brokers. There can be one or more brokers on a Kafka cluster.  

**Topic:** Broker receives different types of message/events. They are categorized by topic. The producer can also set message on different types of topics. Consumers subscribed to different topics so that when any message/event come to broker it sends to its particular consumer based on the topic. Consumers can also go to specific topic and collect those message. 

**Partitions:** When producers produce millions of data on the same topic, to store all those message topic needs more space on a single machine. As Kafka is a distributed system, we can break Kafka-topic into multiple parts and distribute those parts into different machines. It gives better performance. We can decide the number of partitions during a topic creation. 

**Offset:** When the producer sends message or publish a new event to a broker partition based on a topic, there is no control over that message. This messages are tag by numbers. These numbers are called offset. Offset is needed for the following case: 

- Suppose a consumer start receives message from a partitions and after sometimes it stops in the middle of receiving. Now, to restart from the last checkpoint, offset number is needed.  

**Consumer Groups:** If there is only a single consumer, receives data from multiple partitions, it'll create a performance issue. As a result, if we can make multiple consumer instance for multiple partitions the load will be less on per partition. So, the ultimate performance will be increased. 

**Zookeeper:** One of the key component. Kafka uses zookeeper for 
* co-ordination and track the status of the Kafka cluster.  
* Also keeps track of Kafka topics, partitions, offsets 
* Act as a manager of the broker of the Kafka system. 