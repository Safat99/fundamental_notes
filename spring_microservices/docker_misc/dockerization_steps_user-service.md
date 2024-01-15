# Steps of dockerization for a service (user-service) 

To dockerize the user-service we have to follow the following steps:

1. Create the .jar file in the target folder
2. In the base directory, create a Dockerfile
3. Give instructions to the Dockerfile. Need to expose and run commands so that the app will start running if we run the image.

    ```
    FROM openjdk:17
    EXPOSE 7979
    ADD target/user-service-docker.jar user-service-docker.jar
    # adding the jar file in the container named as user-service-docker.jar
    ENTRYPOINT ["java", "-jar", "/user-service-docker.jar"]
    ```
4. Run the following command for building the docker image
```docker build -t user-service-docker .``` (user-service docker >> image name)
5. Now to see the image list and latest image created ```docker images```
6. To run the docker image on a port, like port 8000 >> ```docker run -p 8000:7979 user-service-docker```


##  Database Configuration 

First, as we are going to launch our spring boot app through docker container it needs to communicate with the database. There can be cases like:
    
1. Spring boot app and DB are on the same container --> not a good approach. It's easy though as I have to write only one Dockerfile. But maintaining that is also difficulet. [Check the stackoverflow answer](https://stackoverflow.com/questions/72201256/is-it-a-good-practice-to-have-the-database-within-the-same-container-as-the-app)

2. Spring boot app and DB will be on seperate container and they will connect with each other. All the configurations will be written in a Docker-Compose file.

3. the app-container will directly communicate with the Host-Machine. 

### 3. Docker-Container with Host Machine DB
**Steps:**

1. Find Host Machine's IP address: Docker containers can communicate with host `host.docker.internal`.
    ```
    # Linux or macOS
    ifconfig

    # Windows
    ipconfig
    ```

2. Update the application.properties file 

    Change the application.properties file in the following line:
    
    ```
    spring.datasource.url=jdbc:sqlserver://192.168.168.159:1433;databaseName=payment_gateway;trustServerCertificate=true;sendTimeAsDateTime=false
    ```
    
    Now at my case, currently I am using ubuntu and mssql is running on another docker container. Its port is already exposed by the port mapping. `0.0.0.0:1433 -> tcp` So, first I need to find my container Ip address.
    I can do that using the following docker inspect commnand: 
    
    ```
    docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' 9c
    ```
    result >> 172.17.0.3

    So, the application.properties file will be changed to now(for may case as mssql is running on docker container)

    ```
    spring.datasource.url=jdbc:sqlserver://172.17.0.3:1433;databaseName=payment_gateway;trustServerCertificate=true;sendTimeAsDateTime=false
    ```

    ### when multiple properties
    Sometimes we can have different profiles like development, production, local etc. In that case we can have multiple configuration file. So the folder structure can be look something like this:
    ```
    ├── application-dev.properties (or .yml)
    ├── application.properties
    └──application-prod.properties
    ```

    In that case we need to change the active profile. 
    

3. Configure DB for Remote Connections

    We need to make sure that our DB instance in configured to allow remote connections. To do that, we need to configure our DB(SQL Server) to listen on a network port and enable TCP/IP connections.

    - Configure SQL Server and enable TCP/IP
    - restart db


4. Adjust the firewall settings
    
    - Check firewall status:
        ```
        sudo ufw status
        ```
    - allow the port
        ```
        sudo ufw allow 1433/tcp
        ```

5. RUN The Spring Boot app:

    #### Run with SPRING_PROFILES_ACTIVE 
    ```
    docker run -p 9999:9999 -e SPRING_PROFILES_ACTIVE=dev my-service-docker
    ```
    In that case spring will choose to run with the application-dev.properties
    

    