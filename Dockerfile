FROM openjdk:8-jdk-alpine

VOLUME jerkins-docker-demo:/tmp

VOLUME jerkins-docker-demo-log:/log

ADD target/docker-jerkins-demo-0.0.1-SNAPSHOT.jar app.jar

ENV JAVA_OPTS=""

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar

