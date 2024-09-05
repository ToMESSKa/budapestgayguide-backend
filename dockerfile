FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/budapestgayguide-backend-0.0.1-SNAPSHOT.jar budapestgayguide-backend.jar
ENTRYPOINT ["java","-jar","/budapestgayguide-backend.jar"]