FROM openjdk:15-alpine
WORKDIR /app
COPY target/k8s-backend.jar /app/
ENTRYPOINT ["java","-jar","k8s-backend.jar"]