# Use a Java 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file into the container
COPY build/libs/Codecrumbs-1.0-SNAPSHOT.jar app.jar

# Expose the port your app runs on (change if needed)
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]