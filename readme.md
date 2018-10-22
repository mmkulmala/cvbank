# CV-bank 

This is my thesis work for Oulu University of Applied Sciences. This is also the first time I develop something with Kotlin and graphql.
CV-bank is Spring Boot app implementation of FRESH cv template with data repository being Mongodb. Data is queried and mutated (inserted, deleted and updated) by graphql. 
Technologies used: Kotlin, Graphql, Mongodb, FRESH json template.

Notice: WORK IN PROGRESS!

## Pre-installations

At the moment needs mongodb installed in the system as well as jdk 8 (jdk update to 9 is in the schedule) and graphql. Later I will include these in Docker container. 
Also at some point hack-my-resume node.js library is added for transformation support. 

## Compiling the app

Compile app
```
mvn clean install
```

Without tests
```
mvn clean install -DskipTests=true
```

Running app
```
mvn spring-boot:run
```

## Test Graphql material
WIP to be added!

## Hack-my-resume
WIP

## Docker
WIP
