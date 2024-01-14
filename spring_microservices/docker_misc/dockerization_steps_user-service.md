# Steps of dockerization for the user-service 

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
