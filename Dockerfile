FROM openjdk:17-jdk-alpine
LABEL authors="benna"
MAINTAINER KarimBenna
COPY out/artifacts/hopapplication_jar/hopapplication.jar ./
ENTRYPOINT ["java", "-jar","/hopapplication.jar"]