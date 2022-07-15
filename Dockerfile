FROM openjdk:8
EXPOSE 8088
ADD target/pipelinedemo1-0.0.1-SNAPSHOT.jar pipelinedemo1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/pipelinedemo1-0.0.1-SNAPSHOT.jar"]
