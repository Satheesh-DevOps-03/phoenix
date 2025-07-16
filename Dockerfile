FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/phoenix-1.0.0.jar app.jar

CMD ["java", "-jar", "app.jar"]
