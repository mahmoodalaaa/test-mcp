# Use official Java 17 image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built jar into container
COPY target/*.jar app.jar

# Expose port (Render will inject PORT env var)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]