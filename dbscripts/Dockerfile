FROM gradle:4.7.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/vinod_amzon/K8s_102019/
WORKDIR /home/vinod_amzon/K8s_102019/
RUN gradle build --no-daemon

FROM openjdk:8-jre-slim

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/vinod_amzon/K8s_102019/build/libs/*.jar /app/DbDDLLoader.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/DbDDLLoader.jar"]