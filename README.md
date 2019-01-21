# Test API

This is my Java Microservice API.

It runs on port 8080 and you can start it by

> java -jar target/mvf-test-api-1.0-SNAPSHOT-swarm.jar

You can generate the docker image, it wont run by default.

> mvn docker:build

or

> docker load -i mnf-test-api.tar

> docker run -i --network host mnf-test-api


There are postman/newman collection in the root directory.

> newman run MNF.postman_collection.json


# Assumptions

I decided to use core Java Enterprise JAXRS JPA EJB libraries to solve this problem - there are stacks of frameworks e.g springboot, drop wizard however I decided to use minimal dependencies.

Customer/Account merge - not sure what to do with merge - maybe use dozer to overwrite properties
Login - security - would need a filter to check valid access token cookies.
