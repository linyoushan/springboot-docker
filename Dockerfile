FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD target/spring-boot-docker-0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]