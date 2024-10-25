# Lektion 3

## Sammanfattning
Vi har under dagen tittar närmare på loopar och metoder. Till detta har vi övar på att använda oss av olika
typer av loopar, diskuterat lite kring när varje loop kan användas. Mycket av dessa diskussioner kommer vara till
fördel sen när vi kommer in på arbetet med `array`, `list`, `set` och `map`. Troligen så kommer mycket av eventuell 
förvirring förvandlas till en "aha"! Detta då det visar sig mer logiska användningsområde för vad vi gått igenom idag.

Vi fortsatte kolla på klasser och objekt i form av att vi skapade en separat klass vilken vi kallade på metoder ifrån.
Detta är en mjukstart, förberedelse inför att vi kommer komma in på det objektorienterade.

Planen är att hela tiden titta på det som kommer längre fram och försöka väva in det så bra som möjligt. Detta för att 
saker och ting skall upprepas och till slut sätta sig i minnet.

## Metoder
Vi gick idag igenom om hur vi kan använda metoder. Vi jobbade både med metoder som enbart utförde instruktioner och med
metoder som returnerade värden. Tillhörande testade vi att skapa metoder som kallade på andra metoder, för att skapa en 
kedja.

I kontrast till loopar, tittade vi även på rekursiva metoder. Detta är metoder som kallar på sig själv. Genom detta går 
det att bygga villkor som får dessa metoder att agera liknande en loop. Exempel finns i koden. 

## Loopar
Vi gick igenom de olika looparna: `for-loop`, `while-loop`och `do-while-loop`. Tillhörande detta så jobbade vi vidare med 
if-satser för att förändra beteendet i lopparna eller dess resultat.

## Kluringar / praktik
Vi jobbade mycket praktiskt på eftermiddagen med olika kluringar. Vi praktiserade användandet av metoder tillsammans med 
loopar. Instruktioner som lämnades ut kommer här:

### Bonus

```
    - Skapa en metod som du använder för att skriva ut String.
        Metoden skall ta emot en String och skriva ut den i consolen.
        public void printMyText(String text) { System.out.println(text); }

        Denna metod skall användas för att skriva ut resultatet för ALLT som vi gör vidare.


    - Skapa en metod, med en loop som skriver ut vartannat tal. Udda eller jämt - spelar ingen roll. 
        >>Använt din utskriftsmetod (printMyText()) för att skriva ut<<
    

    - Skapa en metod som tar in en String och skriver ut den. 
        >>Använt din utskriftsmetod (printMyText()) för att skriva ut<<

    - Skapa en metod som tar emot en String och skriver ut den 10ggr. 
        >>Använt din utskriftsmetod (printMyText()) för att skriva ut<<

    - Skapa en metod som tar emot en int. Parameterna, int, skall skrivas ut med hjälp av utskrift-metoden. 
        Metoden skall kalla på sig själv och göra det fram till att talet du angett blir 0!.
        >>Använt din utskriftsmetod (printMyText()) för att skriva ut<<
    
        “Recursive method”. Den skall INTE innehålla loop.
    
        Det är tillåtet att googla om hur recursive metod fungerar! Använd INTE chatgpt

    - Skapa en metod som skriver ut varje bokstav av ett ord. Varje bokstav skall hamna på ny rad. 
        Metoden skall ta emot en String.
        >>Använt din utskriftsmetod (printMyText()) för att skriva ut<<
        
        Det är tillåtet att googla om hur recursive metod fungerar! Använd INTE chatgpt

```

### Tärningsspel

```
Mål

Ditt mål är att skapa ett enkelt tärningsspel i Java som låter användaren kasta en tärning ett antal gånger och beräkna 
den totala summan av kastade värden.

Specifikationer

    Programmet ska använda Scanner för att läsa indata från användaren.
    Programmet ska använda Random för att simulera tärningskast.
    Koden ska innehålla minst två metoder:
        En metod för att spela spelet.
        En metod för att kasta tärningen.
```

## "Jag är klar!"
I första hand:
Gå igenom instruktionerna för inlämningsuppgiften en gång till. Kontrollera att du fått med allt som efterfrågas!

Om du känner dig färdig med veckans lektioner och inlämningsuppgift - koncentrera dig på att plocka till dig mer information
kring det vi gått igenom i veckan. Be chatgpt att ta fram övningsuppgifter till dig för att ge dig själv möjlighet att praktiser
samt testa din kunskap!

Ta även hjälp av de videos som finns att tillgå på Youtube. Både de jag har länkat till men också genom fri sökning.

Saker som kan tittas vidare på kring ämnet:
- Minnesåtgång för varje typ av loop (hur skiljer sig looparna i bakgrunden)? Alla gör ju mer eller mindre samma sak - varför
finns det mer än en typ?
- Recursive metod, är det bra att använda? Eller är det bara något som uppstått som en konsekvens av införandet av metoder?
- Syntax i Java! Även om vi pratat mycket om syntaxen (hur vi skriver kod), så kan det vara värt att se något klipp om Javas
syntax för att hitta mer information
- Datatyper - ta dig tiden att studera datatyper lite mer. Hur de skiljer sig. Hur vi kan göra för att parse-a från det ena
till det andra
- `continue` och `break` titta gärna på dessa reserverade ord och skapa dig en uppfattning om hur de kan användas
- `static` och `final`- samma som ovan. Ta reda på lite mer information om dessa
- Hur används `public static main(String[] args)` och varför finns den.

## Lektionerna
Det har varit ett visst manfall på eftermiddagarna denna vecka. Om det är så att det inte finns anledning till att inte 
närvara (e.g tandläkartid eller dylikt), så uppmanar jag verkligen till att delta. All respekt för att det kan finnas en känsla
av att det vi går igenom redan är något en kan... Men det är viktigt för alla att vi är så många som möjligt närvarande. 
Inte minst för diskussionernas skull. Det kan låta klyschigt - men att hjälpa andra är en del av inlärningen! Två flugor 
i en smäll. Du har möjlighet att hjälpa en kursare och du upprepar kunskapen för dig själv. Win - Win.

Det är också viktigt att delta på lektionerna för att inte missa värdefull information. Även om dessa sammanfattningar tillsammans
med kod finns - så är det inte en full redogörelse på allt vi gör. 


## Slutligen
Riktigt bra jobbat! Det är så jäkla härligt att höra sorlet av diskussioner kring programmering i klassrummet! Magi!
Fortsätter vi såhär så kommer det bli riktigt bra! Det kan kännas som en total storm just nu - men vi kommer komma fram
och saker och ting kommer sätta sig. Det kommer uppstå många "aha" på vägen - det kan jag lova!

