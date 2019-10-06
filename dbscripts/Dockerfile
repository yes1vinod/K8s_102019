FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
WORKDIR /home/model
COPY build/libs/DbDDLLoader.jar .
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","DbDDLLoader.jar"]