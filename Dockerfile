FROM openjdk:8
ADD target/docker-techie.jar docker-techie.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-techie.jar"]