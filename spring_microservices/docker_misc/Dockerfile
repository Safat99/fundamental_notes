FROM openjdk:17
EXPOSE 7979
ADD target/user-service-docker.jar user-service-docker.jar
# container er target folder e jar file include kora and er naam user-service-docker.jar naam deya
ENTRYPOINT ["java", "-jar", "/user-service-docker.jar"]