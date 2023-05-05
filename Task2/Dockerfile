# docker build -t hello-docker-boot .
FROM  maven:3-openjdk-17-slim as maven
COPY pom.xml  /dockerImage/pom.xml
COPY src      /dockerImage/src
RUN mvn -f   /dockerImage/pom.xml package

# docker run -dp 8080:8088 hello-docker-boot
FROM openjdk:17-jdk-alpine
EXPOSE 8088
COPY --from=maven /dockerImage/target/Task2-*.jar /Jar/Task2.jar
entrypoint ["java", "-jar", "/Jar/Task2.jar"]