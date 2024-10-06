FROM openjdk:17-jdk-alpine
COPY ./target/springdocker2-0.0.1-SNAPSHOT.jar springdocker2.jar
ENTRYPOINT ["java","-jar","springdocker2.jar"]
