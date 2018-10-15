# CV-bank 

CV-bank is Spring Boot app implementation of FRESH cv template. Technologies used: Kotlin, Graphql, Mongodb, FRESH json template.

Notice: WORK IN PROGRESS!

## Pre-installs

At the moment needs mongodb installed in the system as well as jdk 8 (maven etc) and graphql. Later will include these in Docker container. 

## Compiling

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
