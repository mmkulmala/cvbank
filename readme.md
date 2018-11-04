# CV-bank 

This is my thesis work for Oulu University of Applied Sciences. This is also the first time I develop something with Kotlin and graphql.
CV-bank is Spring Boot app implementation of FRESH cv template with data repository being Mongodb. Data is queried and mutated (inserted, deleted and updated) by graphql. 
Technologies used: Kotlin, Graphql, Mongodb, FRESH json template.

Notice: WORK IN PROGRESS!

## Pre-installations

At the moment needs mongodb installed in the system as well as jdk 8 (jdk update to 9 is in the schedule when full support is available) and graphql.

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
Create polished résumés and CVs in multiple formats from your command line or shell. Author in clean Markdown and JSON, export to Word, HTML, PDF, LaTeX, plain text, and other arbitrary formats. Fight the power, save trees. Compatible with FRESH and JRS resumes.

Above is taken from here (there's more info on hackmyresume and examples): [Hackmyresume github](https://github.com/hacksalot/HackMyResume "Hackmyresume in github")

## Docker
WIP
