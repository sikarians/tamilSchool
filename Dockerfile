# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file of your StudentService into the container
COPY build/libs/tamilSchool-0.0.1-SNAPSHOT.jar /app/tamilschool.jar

# Expose the port your application runs on (this should match your Spring Boot configuration)
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/tamilschool.jar"]
