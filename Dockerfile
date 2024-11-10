# Use an official OpenJDK image as the base image
FROM openjdk:24-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source file from the host to the container
COPY src/Main.java /app/Main.java

# Compile the Java source file
RUN javac Main.java

# Specify the command to run the compiled Java program
CMD ["java", "Main"]