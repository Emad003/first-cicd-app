FROM eclipse-temurin:21-jre

COPY target/first-cicd-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "first-cicd-app.jar"]