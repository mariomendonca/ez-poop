FROM openjdk:21-jdk-slim

WORKDIR /app
COPY target/ez-poop-backend-0.0.1-SNAPSHOT.jar /app/ez-poop.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/ez-poop.jar"]