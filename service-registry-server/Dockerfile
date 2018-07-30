FROM openjdk:8-jdk-alpine
EXPOSE 8761:8761
ADD target/service-register-server-0.0.1-SNAPSHOT.jar service-register-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "service-register-server-0.0.1-SNAPSHOT.jar"]
