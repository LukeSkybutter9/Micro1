FROM eclipse-temurin:17.0.12_7-jdk
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} UsuarioService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/UsuarioService-0.0.1-SNAPSHOT.jar"]