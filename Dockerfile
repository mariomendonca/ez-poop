FROM jelastic/maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn package

FROM openjdk:21-jdk-slim
WORKDIR /app
COPY --from=build target/ez-poop-backend-0.0.1-SNAPSHOT.jar /app/ez-poop.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/ez-poop.jar"]