FROM openjdk:17-jdk-alpine

ADD target/employee-application-mangodb.jar employee-application-mangodb.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","employee-application-mangodb.jar"]
