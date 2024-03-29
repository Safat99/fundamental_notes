### Start Kafka
first navigate to the kafka/ directory

#### Start the Zookeeper service
```
bin/zookeeper-server-start.sh config/zookeeper.properties
```

#### Start the Kafka broker service
```
kafka-server-start.sh config/server.properties
```
then on another terminal we have to launch kafka's basic operations

####  If USING KRAFT 

first, again navigate to the kafka/ directory<br>
**Start the kafka environment using Kraft**
```
KAFKA_CLUSTER_ID="$(bin/kafka-storage.sh random-uuid)"

bin/kafka-storage.sh format -t $KAFKA_CLUSTER_ID -c config/kraft/server.properties

bin/kafka-server-start.sh config/kraft/server.properties
```
---

### Console Operations
* **create a topic**
    ```
    kafka-console-producer.sh --bootstrap-server localhost:9092 --topic your-topic-name

    ```

*  **To list or view topics**
    ```
    kafka-topics.sh --bootstrap-server localhost:9092 --list
    
    kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic your-topic-name
    ```

* **To produce a message to a Kafka topic**
    ```
    kafka-console-producer.sh --bootstrap-server your-bootstrap-servers --topic your-topic-name
    ```

* **To produce a message for a explicit key-value format we need to use the ***--property*** keyword**
    ```
    kafka-console-producer.sh --bootstrap-server your-bootstrap-servers --topic administration-register-topic --property "parse.key=true" --property "key.separator=:"
    ```

* **To describe Consumer groups and their members**
    ```
    kafka-consumer-groups.sh --bootstrap-server localhost:9092 --list

    kafka-consumer-groups.sh --bootstrap-server localhost:9092 --describe --group your-consumer-group
    ```

    Then we can provide a key-value pair like this
    ```
    key1:{'userEmail': 'sarkersafat99@gmail.com', 'password': 'abcxyz'}
    ```

* **To see the messages that are being sent through Kafka in real-time**
    ```
    kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic your-topic-name --from-beginning
    ```
