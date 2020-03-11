# Ping-Pong API

I use this project as a test endpoint.

In order to run it, just type: ```mvn spring-boot:run```

##Building the image
1. `make build`
2. build with Jib plugin `mvn package spring-boot:repackage com.google.cloud.tools:jib-maven-plugin:2.1.0:dockerBuild`

##Running the image
to run the image `docker run -p 9090:9090 --name ping-pong adriano/ping-pong:1.0.0`

##Checking the running instance
to test the container `http :9090/actuator/health`

should see
````
HTTP/1.1 200
Connection: keep-alive
Content-Type: application/vnd.spring-boot.actuator.v3+json
Date: Wed, 11 Mar 2020 16:37:13 GMT
Keep-Alive: timeout=60
Transfer-Encoding: chunked

{
    "status": "UP"
}
````