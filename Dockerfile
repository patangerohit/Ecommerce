# Build stage
FROM maven:3.8.4-openjdk-17 AS build

# Set working directory
WORKDIR /app

# Copy the JAR file (after you've built it with Maven)
COPY target/*.jar app.jar

# Run the app using -cp and specifying the main class
ENTRYPOINT ["java", "-jar", "app.jar"]