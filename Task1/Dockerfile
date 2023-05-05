## docker build -t hello-world .
FROM  maven:3-openjdk-17-slim as maven
COPY pom.xml  /dockerImage/pom.xml
COPY src      /dockerImage/src
RUN mvn -f   /dockerImage/pom.xml package

## docker run hello-world
FROM openjdk:17-jdk-alpine
COPY --from=maven /dockerImage/target/Task1-*.jar /Jar/Task1.jar
entrypoint ["java", "-jar", "/Jar/Task1.jar"]

##