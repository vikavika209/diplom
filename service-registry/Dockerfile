FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /build

COPY ../ ./

RUN mvn clean package -pl service-registry -am -DskipTests

FROM bellsoft/liberica-openjdk-alpine:17
WORKDIR /app
COPY --from=build /build/service-registry/target/service-registry-1.0-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]