# Ping-Pong service

This is a small spring boot app, developed just for personal education purpose.

##Running
1. `mvn spring-boot:run`
2. testing the endpoint `http :9090/ping`. Using HTTPie https://httpie.org/
- Should return
```
HTTP/1.1 200
Connection: keep-alive
Content-Type: application/json
Date: Thu, 12 Mar 2020 08:29:52 GMT
Keep-Alive: timeout=60
Transfer-Encoding: chunked

{
    "data": "pong",
    "failure": 0,
    "status": "200 OK",
    "success": 1
}`
```

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