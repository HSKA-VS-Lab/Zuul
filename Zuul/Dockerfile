FROM openjdk:8-jdk-alpine
ADD target/Zuul-*.jar zuul.jar
EXPOSE 8092
ENTRYPOINT ["java","-jar", "zuul.jar"]