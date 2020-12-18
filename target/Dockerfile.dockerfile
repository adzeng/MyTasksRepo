FROM openjdk:11-jre
EXPOSE 8080
ARG JAR_FILE=darbootcamp_app.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]