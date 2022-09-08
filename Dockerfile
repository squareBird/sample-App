FROM openjdk:17
ARG JAR_FILE=sampleApp-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} myboot.jar
ENTRYPOINT ["java","-jar","/myboot.jar"]