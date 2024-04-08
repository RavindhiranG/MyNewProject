FROM eclipse-temurin:17
COPY target/mynewproject.jar mynewproject.jar
CMD [ "java","-jar","mynewproject.jar" ]