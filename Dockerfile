FROM openjdk:11-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java"]
CMD ["-jar","/app.jar"]
HEALTHCHECK CMD wget --quite --tries=1 --spider http://localhost:9090/actuator/health || exit 1
EXPOSE 9090