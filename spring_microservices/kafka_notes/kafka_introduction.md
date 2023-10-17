## Introduction

Source: [java-techie](https://www.youtube.com/watch?v=xGwzuz8F9k0&list=PLVz2XdJiJQxwpWGoNokohsSW2CysI6lDc&ab_channel=JavaTechie)<br>
[This](https://docs.confluent.io/kafka/introduction.html) site is also very much useful.

---
Topics to cover: 
* Kafka fundamentals 
* Setting up Kafka 
* Kafka producers 
* Kafka consumers 
* Serialize and deserialization 
* Error handling and msg process 
* Concurrency & Scaling 
* Monitoring and logging 
* Integration with Spring Boot 

## What is Kafka
Kafka is a distributed event streaming platform. Its operation is consists of:
* Creating real time stream 
* Process the real-time stream 

It also<br>
* Stores stream of events in a fault-tolerant durable way. 
* Processes streams of events as they occur

**Real Time Event Streaming:** continuously sending message/event to the Kafka server and reading and process them is called real time event streaming. 

**Distributed:** We can have 3 separate Kafka server running in 3 different regions. If any of them goes down or fails, others will come to rescue. This concept is indicating the Distribute feature of Kafka. 

## Why we need? 
Postman letter box analogy: <br>
If there is a letter box, the postman will be able to send the letter to the letter box. As a result the receiver, no matter what, will be able to receive the letter when he is not at home. Kafka also make sures that the consumers get the message/event whether is online or not. The producer sends the message/event to the Kafka-server with specific topic and the consumer will be receive them from the Kafka server using that topic. <br><br>
In microservice based system when there is lots of service running and communicating with each other this is very much needed. It acts as an object for centralizing the system and making the system much reliable.

## How does it work? (High level overview) 
* PUB-SUB model 

Publisher publishes an information to the message broker with a topic name and the subscribers whom are subscribed with that topic gets the message. Kafka is the message broker. 