# CV-bank on json pohjaisen cv:n tallentamiseen tarkoitettu järjestelmä

CV-bank käyttää graphql:ää endpointtina mongodb dokumenttikantaan. Backend on toteutettu Kotlinilla
Spring Boot versio 2:n päälle. Kokonaisuus pyörii Docker-kontissa.

## Tiedosto rakenne projektissa
src-hakemiston alla on ohjelman lähdekoodit. Mainin alla tavallinen koodi ja testin alla testit. 
Molempien alla on resources-hakemisto, jossa on järjestelmän käyttämät resurssit, tässä tapauksessa
graphql skeema.
Main hakemisto on jaettu dao-luokkiin omassa hakemistossaan, data-luokkiin (omissa hakemistossaan)
, graphql-luokkiin (polussa src/main/fi/phz/cvbank/graphql) sijaitsee graphql:n käyttämiseen tarvittavat luokat: input (tiedon lisäämiseen tarvittavat luokat), mutation-hakemistossa on MutationResolver-luokat, joilla siis hoidetaan dokumenttien lisääminen (ja muuttaminen) ja lopuksi query-kansiossa QueryResolver-luokat. 

## Docker
Todo

## Graphql
Graphql:stä lisää täältä: [learn graphql](https://graphql.org/learn/)

### MutantionResolverit
Todo

### QueryResolverit
Todo

## Mongodb
Mongodb on dokumentteihin perustuva ja on no-sql tietokanta. Lisätietoja: [mongodb](https://www.tutorialspoint.com/mongodb/)

## Kotlin
[Lisätietoja Kotlinista](https://kotlinlang.org)

## Kääntäminen
Ohjelman voi kääntää shellistä seuraavilla maven-komennoilla.

Tyhjennä target-hakemisto, poista vanhat käännökset ja tee uusi käännös:
```
mvn clean install
```

Jollet halua ajaa testejä, voit käyttää -DskipTests=true flagin kanssa
```
mvn clean install -DskipTests=true
```

Käännös siis oletuksena ajaa testit. Ja kun se on mennyt läpi voit ajaa cv-bank:ia seuraavalla
komennolla:
```
mvn spring-boot:run
```

Ohjelmaa voi myös ajaa kehittimestä jos haluaa

## Grarphiql esimerkkejä

Graphql:n kanssa voi tehdä kahdenlaisia kyselyjä: queryjä (eli kyselyitä) ja muutoksia (mutations).

Mutation esimerkki (eli lisätään uusi työhistoria dokumentti):
```
mutation {
  createWork(input: {
    company: "phz",
    position: "consultant",
    website: "http://www.phz.fi",
    startDate: "10/10/2017",
    endDate: "",
    summary: "JS consultant",
    highlights: ["Created company website", "Scrummaster course"]
  }) {
    id
    company
  }
}
```

## Projektin tila

### Done:
* graphiql toimii [testaa](localhost:8080/graphiql)
* Koodattu Kotlinilla
* mongo dokumenttikanta (testaa alla olevilla ohjeilla. Huom! Local install)
  * mongo (käynnistää mongodb:n)
  * use cvbank (siirry cv-bank dokumenttikantaan)
  * db.work.find() (näyttää kaikki työhistoriat, jotka eivät ole cv:eiden sisällä)
* Json-resume pohjainen skeema toimii. Uusia dokumentteja voi luoda ja niitä voi kysellä joko graphiql-ui:sta tai REST-rajapintaa käyttäen curlaamalla.
 
### TODO:
* implementoitava delete
* implementoitava update
* Projekti ei vielä toimi docker-kontin päällä
* tarkastettava olisiko FRESH-skeema parempi [fresh skeema githubissa](https://github.com/fresh-standard/fresh-resume-schema)