# CV-bank 
This is my thesis work for Oulu University of Applied Sciences. This is also the first time I develop something with Kotlin and graphql.
CV-bank is Spring Boot app implementation of FRESH cv template with data repository being Mongodb. Data is queried and mutated (inserted, deleted and updated) by graphql. 
Technologies used: Kotlin, Graphql, Mongodb, FRESH json template.

I still add things to this repo sometimes, but development is slow. Next big thing is getting rip of Spring Boot and replacing that with Micronaut and finishing docker things.

## Pre-installations
At the moment needs mongodb installed in the system as well as jdk 8 (jdk update to 9 is in the schedule when full support is available) and graphql. You can also try the Dockerfile to use CV-bank with docker, but this might not work as some of the stuff is untested, but you'll see what you need to install from there (Dockerfile).

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
See output-folder for example.

## Hack-my-resume
Create polished résumés and CVs in multiple formats from your command line or shell. Author in clean Markdown and JSON, export to Word, HTML, PDF, LaTeX, plain text, and other arbitrary formats. Fight the power, save trees. Compatible with FRESH and JRS resumes.

Above is taken from here (there's more info on hackmyresume and examples): [Hackmyresume github](https://github.com/hacksalot/HackMyResume "Hackmyresume in github")

## Docker
You can run try the Dockerfile, but it's still work in progress (as well as docker compose)
