FROM maven:3.9-eclipse-temurin-17
COPY pom.xml /app/
COPY src /app/src
WORKDIR /app
RUN mvn clean package
EXPOSE 8080
CMD ["mvn", "exec:java"]