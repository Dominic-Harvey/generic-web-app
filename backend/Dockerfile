FROM maven:3.9.6-eclipse-temurin-21-jammy as build
WORKDIR /workspace/app

# Copy only the files needed for dependency resolution first
COPY pom.xml .

# Download dependencies first (this layer will be cached)
RUN mvn dependency:go-offline

# Only then copy the source code
COPY src src

# Build the application
RUN mvn package -DskipTests

# Runtime image
FROM eclipse-temurin:21-jre-jammy
VOLUME /tmp
COPY --from=build /workspace/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
