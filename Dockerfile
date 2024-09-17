# Step 1: Use Maven to build the application
FROM maven:3.9.9-eclipse-temurin-21 AS builder
WORKDIR /app

# Copy the entire project
COPY . .

# Build the project without running tests
RUN mvn clean package -DskipTests

# Step 2: Use a lightweight JRE image for running the app
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /app/target/*.jar /app/sentiment-sense.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/sentiment-sense.jar"]
