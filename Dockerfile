# Base image with Java 17
FROM openjdk:17-jdk-alpine

# App directory
WORKDIR /app

# Copy jar file
COPY target/insurance-rest-api-0.0.1-SNAPSHOT.jar app.jar

# Expose Spring Boot port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java","-jar","app.jar"]
