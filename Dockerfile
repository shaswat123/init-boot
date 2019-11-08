FROM openjdk:latest
MAINTAINER Shaswat
ADD target/init-boot-0.0.1-SNAPSHOT.jar init-boot.jar
ENTRYPOINT ["java","-jar","init-boot.jar"]
EXPOSE 8080