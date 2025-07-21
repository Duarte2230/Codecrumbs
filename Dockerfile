# Etapa 1: build
FROM gradle:7.6.1-jdk17 AS build

WORKDIR /home/gradle/project
COPY . .
RUN gradle clean build --no-daemon

# Etapa 2: runtime
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /home/gradle/project/build/libs/Codecrumbs-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]