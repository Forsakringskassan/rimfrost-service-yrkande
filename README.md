# Projekt för yrkande

Projektet tillhandahåller api för /yrkande och /handlaggning

## Minimum konfiguration

Projektet förväntar sig att jdk (java version 21 eller högre), 
docker och maven är installerat på systemet samt att 
miljövariablerna **GITHUB_ACTOR** och **GITHUB_TOKEN** är 
konfigurerade.

Notera att det GITHUB token som används förväntas ha repo access 
konfigurerad för att kunna hämta vissa projekt beroenden. 

## Bygg projektet

`./mvnw -s settings.xml clean verify`.

## Bygg docker image för lokal testning

`./mvnw -s settings.xml clean package`

## Github workflows

Två github workflows är inkluderade i projektet, maven-ci och maven-release.

maven-release skapar som del av sitt flöde en docker image.
Den publiseras till försäkringskassans [repository](https://github.com/Forsakringskassan/repository).

## Exempel implementation
Se [rimfrost-regel-rtf-maskinell](https://github.com/Forsakringskassan/rimfrost-regel-rtf-maskinell) för en färdig implementation av en maskinell regel.
