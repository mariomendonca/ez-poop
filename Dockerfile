FROM ubuntu:latest as build

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install


FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build target/ez-poop-backend-0.0.1-SNAPSHOT.jar /app/ez-poop.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/ez-poop.jar"]