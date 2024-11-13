# Sammanfattning

Vi började dagen med papper och penna. Alla fick ta del av ett "krav" i form av en bild. Kravet presenterades muntligt och
upprepades bara en gång. Detta är en del av övningen. 

Bilden skildrade:

    - En ruta med svart bakgrund, innehållandes en knapp. Vi kallar den för ruta 1
    - Ruta1 innehåller i sin tur en ny ruta, ruta2, med annan bakgrund och en knapp
    - När knappen i ruta1 trycks på, skall bakgrunden ändras i ruta2
    - När knappen i ruta2 trycks på, skall en ny ruta, ruta3, skapas, med en annan bakgrund och med en knapp
    - När knappen i ruta3 trycks på, skall en label läggas till i ruta3 med valfri text

På pappret skulle lösning skrivas. Så nära kod som möjligt. Individuellt eller i par. Så nära full lösning som möjligt.
När övningen fortsatte, skulle koden på papper in i IntelliJ och programmet skapas. All kod som __INTE__ tänktes på när den 
skrevs på papper - skulle kommenteras.

### Syfte och förklaring

Syfte med övningen ovan, är att upprepa den kunskap som var och en har. Samtidigt är det en övning i teamwork och träning på
hur en kravställning _KAN_ se ut. Det är inte alltid att en kravställning är perfekt. 
Att en kravställning är abstrakt kan bero på flera saker. Här är det viktigt att som utvecklare samla frågor att "skjuta"
mot kravställningen. Det viktigaste är att alla inblandade har så gemensam bild av kraven som möjligt. Detta ansvar ligger
på dig som utvecklare, på ditt kommande team och alla inblandade.

En dålig kravställning __KAN__ bero på att kravställaren inte vet vad den egentligen är ute efter. Det __KAN__ också bero 
på att kravställaren inte vill styra utvecklaren för mycket. Men det __KAN__ också vara så att kravställaren har fått helt fel
för sig. Därav är det viktigt att iterera kravställningen. Ställa alla frågor som behöver ställas för att nå tydlighet.

För att gå igenom kraven på djupet, i arbetslivet, så är det en god idé att bjuda in så många kompetenser som möjligt. 
En högst personlig åsikt är att __ALLTID__ ha med ``testare`` om denna kompetens finns i din närhet/kontext. De gemensamma
frågeställningarna som utvecklare tillsammans med testare kan ta fram - brukar kunna tydliggöra kraven väldigt bra. Åtminstone
så blir det inte sämre. Samma sak gället givetvis om du i framtiden har `arkitekt` att samtala med. Arkitekten kan tidigt
så om en lösning kan fungera sett till existerande infrastruktur alternativt om den tilltänkta lösningen följer den väg
organisationen vill gå.

Kortfattat så handlar det om att våga ställa frågor. Ta reda på saker. Själv se till så att kraven uppfattas på samma sätt
över team och inblandade roller. Annars är risken att du sitter och utvecklar saker som ingen egentligen frågat efter. För
att du trodde att du förstått det korrekt.

Organisationer och team kommer över tid se väldigt olika ut. Därmed finns inget facit. Du kommer därför vara beredd på att 
våga ställa frågor. Öva på att ställa frågor. 


## Miniprojekt
Vi pratade också om miniprojektet under denna lektion. Vi gick igenom lite kring källhänvisning och var gränserna går för 
vad som kan användas. __Tänk på att använda källhänvisning i kommentarerna om ni lånar/inspireras av annans kod__. Det är 
tillåtet och du bör använda både Google och ChatGPT för att tillförskanska dig den information du behöver för att klara 
uppgiften. __MEN__! det är som sagt viktigt att du håller koll på din källhänvisning!

__OM__ du använder ChatGPT - använd den i inloggat läge, så du kan dela frågan och svaret via länk. Välj i ChatGPT att dela,
klistra in länken som kommentar vid den aktuella koden du tagit hjälp för.

Projektet har deadline i nästa vecka. Vi kommer dagarna i nästa vecka köra en redovisning - enskilt, med mig. Detta tar 
mellan 5-15 minuter per redovisning. Vi kommer samtala om din lösning och diskutera dess delar och varför du valt vissa 
vägar.

Presentationerna kommer att börja redan på måndag - alltså __INNAN__ deadline. Det kan vara en fördel i att vara först på
bollen och få feedback på sitt projekt innan själva koden behöver lämnas in.

## Try, catch & finally

### Syntax
```
try {
    // Kod som kan kasta ett undantag
} catch (ExceptionType e) {
    // Hantering av undantaget
}
```
#### try-block: 
Här skriver du den kod som kan ge upphov till ett undantag (fel). Om ett undantag inträffar, övergår kontrollen till det 
följande catch-blocket.

#### catch-block: 
Om ett undantag inträffar i try-blocket fångas det här. Du kan ange vilken typ av undantag du vill fånga 
(t.ex. IOException, NullPointerException etc.), och du kan även fånga undantaget som en variabel (t.ex. e), som du kan 
använda för att få mer information om felet.

### När används finally?
För att säkerställa städning: Oavsett om ett undantag inträffar eller inte i try-blocket, kommer koden i finally-blocket 
alltid att köras. Det är ett bra ställe att lägga kod för att stänga resurser som filer, nätverksanslutningar, databaskopplingar etc.

__Stänga resurser:__ Om du öppnar en resurs som en fil eller en databasanslutning i try-blocket, bör du stänga dessa resurser i finally-blocket för att säkerställa att de stängs även om ett undantag kastas.

__Säkerställa kodexekvering:__ Det är också användbart när du vill att viss kod alltid ska köras efter en try-catch-block, oavsett om ett undantag inträffade eller inte. Detta är vanligt när du vill utföra någon form av slutstädning eller rapportering.

### Syntax
```
try {
    // Kod som kan kasta ett undantag
} catch (ExceptionType e) {
    // Hantering av undantaget
} finally {
   // Oavsett vad som händer - skall denna kod köras
}
```

## Datum och tid
Vi pratade om och övade på att arbeta med datum och tid. Detta är något som historiskt varit väldigt bökigt i Java, men som 
blivit mycket bättre och mer städat efter version 8! Nu är det bättre uppdelat och följer en logik som är lättare att förstå
sig på. Likt som med andra objekt - jobbar vi mycket med getters/setters för att få ut så mycket som möjligt av funktionaliteten.


| **Egenskap** | **`LocalDate`** | **`LocalTime`** | **`Calendar`** | 
| --- | --- | --- | --- | 
| **Användning** | Hantera datum (utan tid) | Hantera tid (utan datum) | Hantera både datum och tid | 
| **Tidszoner** | Nej | Nej | Ja | 
| **Del av Java 8 API** | Ja | Ja | Nej | 
| **Metod för datum/tid hantering** | Enkel och tydlig | Enkel och tydlig | Mer komplex och flexibel | 
| **Äldre Java-versioner** | Nej | Nej | Ja | 
| **Exempel på användning** | `LocalDate.now()` | `LocalTime.now()` | `Calendar.getInstance()` | 
| **Fördelar** | Enkelt att använda, modern API | Enkelt att använda, modern API | Flexibel, kan hantera tidszoner | 
| **Begränsningar** | Ingen tid, ingen tidszon | Ingen datum, ingen tidszon | Föråldrad, mer komplex |

- __LocalDate__ är bäst för när du bara behöver hantera datum (t.ex. födelsedagar, händelser).
- __LocalTime__ är bäst för när du bara behöver hantera tid (t.ex. öppettider, klockslag).
- __Calendar__ är kraftfullare men föråldrad och bör i allmänhet undvikas till förmån för java.time-klasserna om du använder 
Java 8 eller senare. Använd den om du behöver hantera både datum och tid och inte kan använda de nyare klasserna för någon anledning.

## Lambda
Lambda-uttryck introducerades i Java 8 som en del av det nya funktionella programmeringsstödet, och ger ett kortare och 
mer läsbart sätt att skriva anonyma funktioner eller implementera funktionella gränssnitt. Det är en funktionell metod för 
att uttrycka beteende och funktionalitet som en parameter, vilket gör kod enklare och mer uttrycksfull. Lambda-uttryck gör 
det möjligt att skriva funktionell stil i Java, vilket underlättar hantering av kollektivdata (t.ex. strömmar, listor) 
med hjälp av funktioner som t.ex. map, filter, och reduce.

#### _Exempel på lamda finns i LambdaTest-classen_

### Syntax
```
(parameters) -> expression
```

### Fördelar med Lambda-uttryck:

- __Kortare och mer läsbar__ kod: Lambda-uttryck gör koden mer kompakt och läsbar, eftersom de undviker boilerplate-kod 
som krävs för att skapa anonyma klasser.
- __Stöd för funktionell__ programmering: Lambda gör det möjligt att använda funktionella metoder som map(), filter(), 
och reduce() på kollektioner i Java Streams API, vilket ger ett mer funktionellt och deklarativt sätt att bearbeta data.
- __Stöd för parallellism:__ Lambda-uttryck i kombination med Java Streams API gör det enklare att arbeta med parallella 
flöden av data. Till exempel kan du enkelt konvertera en sekventiell operation till en parallell operation med hjälp av .parallelStream().

## Bibliotek
I Java är bibliotek samlingar av återanvändbar kod som tillhandahåller funktioner och verktyg för att underlätta utveckling. 
Ett bibliotek kan bestå av en eller flera klasser, metoder och funktioner som implementerar specifika uppgifter och kan användas 
i olika program eller applikationer. Bibliotek i Java är i regel ett sätt att återanvända kod för att undvika att skriva samma 
funktioner om och om igen. Java-bibliotek kan vara inbyggda (standardbibliotek som ingår med Java SDK) eller externa 
(som du laddar ner och inkluderar i ditt projekt).


## Paket i Java
I Java är paket (på engelska packages) ett sätt att organisera och gruppera klasser och andra typer som gränssnitt (interfaces), 
enums, undertyper och subklasser. Paket fungerar som en behållare för dessa klasser, vilket gör det enklare att organisera 
stora kodbaser, förhindra namnkonflikter och ge kod ett logiskt struktur. Paket används även för att definiera åtkomstkontroll 
och för att göra det enklare att importera och använda klasser.

### Klassisk struktur
```
src/
  com/
    example/
      myapp/
        MyClass.java
```

### Java Standardbibliotek och paket

Java Standardbiblioteket (JDK) innehåller många inbyggda paket som du kan använda i dina program. Några av de mest använda är:

    java.util: För samlingar (List, Set, Map), datum och tid.
    java.io: För in- och utdata (t.ex. filer, strömmar).
    java.net: För nätverksprogrammering (t.ex. HTTP, sockets).
    java.math: För matematiska funktioner och precision (BigDecimal, BigInteger).
    java.time: För att hantera datum och tid i modern stil.