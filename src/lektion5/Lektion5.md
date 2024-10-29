# Sammanfattning

Idag har vi jobbat med `OOP (ObjectOrientering)`. I detta har vi nuddat vid `Klasser`, `Metoder`, `Varibaler`, `Samlingstyper`
, `Loopar` m.m.

Vi har även idag praktiserat väldigt mycket för att få förståelse för hur klasserna är uppbyggda och hur vi får
klasserna att bli objekt. Genom detta så har vi använt objekten till att lösa uppgifter.

## Klass
En klass är en mall eller blueprint som definierar egenskaper (fält/attribut/egenskaper) och beteenden (metoder) för objekten. Den beskriver vad objekten av denna typ kommer att ha och kunna göra.

## Objekt
När du skapar ett objekt från en klass, allokeras minne för det objektet, och du kan använda det för att lagra värden och utföra operationer. Genom att skapa ett objekt av en klass, får du tillgång till
klassens alla metoder och annat som är `public`.

## Konstruktor
I Java är en konstruktor en speciell metod som används för att skapa och initialisera objekt av en klass. Konstruktorer har samma namn som klassen och har ingen returtyp, inte ens void. Konstruktorn skrivs, precis
som klassen, med __stor__ bokstav.

Konstruktorer används för att:
- Initiera objektets attribut/fält/egenskaper.
- Utföra eventuella nödvändiga inställningar när ett objekt skapas.

Konstruktorn är det som alltid körs först när vi skapar ett nytt objekt.

## Getters och setters
Getters och setters är metoder i Java som används för att få åtkomst till och modifiera privata attribut i en klass. Dessa metoder är en del av inkapsling, ett centralt koncept inom objektorienterad programmering, där klassens interna tillstånd skyddas från direkt åtkomst utanför klassen.

- Getters: Används för att hämta värdet på ett privat attribut. Dessa metoder bör börja med prefixet "get". Exempel `getBook()`
- Setters: Används för att ställa in eller uppdatera värdet på ett privat attribut. Dessa metoder bör börja med prefixet "set". Exempel `setBook(Book book)`

# Samlingstyper med object

Det kan ibland uppstå problem med samlingstyperna. Detta handlar om att de inte är oändliga i sin bredd av natur.
Om exempelvis tänker oss en array:

| Index | Value       |
|-------|-------------|
| 1     | Apple       |
| 2     | Banana      |
| 3     | Cherry      |
| 4     | Date        |

Denna kan vara så lång som vi bestämmer att den skall vara. Dock kan vi inte vid enkelt användande få den att bli bredare.
Detta går att komma runt genom att till exempel använda object. Index blir detsamma, men value hänvisar till ett object, där 
varje egenskap kan hämtas ut. Antalet egenskaper kan vi ha tills minnet tar slut och vi kan se det som att varje egenskap kan
bygga vidare kolumner på bredden i exemplet ovan.

Genom ett objekts getMetoder - kan vi få tag på den information vi väljer att exponera.

Så om varje frukt i, exemplet ovan, är ett objekt, kan vi nyttja dess egenskaper och se det som att vi skapar fler kolumner.
Om vi säger att objektet frukt har egenskaperna färg, beskrivning, smak - så kan vi illustrera/tänka oss en tabell likt nedan.


| Index | Value  | Färg     | Beskrivning | Smak       |
|-------|--------|----------|-------------|------------|
| 1     | Apple  | Röd      | Krispig     | Söt        |
| 2     | Banana | Gul      | Mjuk        | Söt        |
| 3     | Cherry | Röd      | Saftig      | Söt/syrlig |
| 4     | Date   | Brun     | Klibbig     | Söt        |

Att tänka på är att detta __ENBART___ är ett försök till förklaring på hur vi kan se det / illustrera! Det är alltså inte så att vi 
egentligen påverkar arrayens struktur! Om detta förvirrar mer än vad det ger klarhet - glöm det.


# Programparadigm
Programparadigm är ett sätt att kategorisera olika programmeringsstilar och metoder. Det definierar hur program logiskt struktureras och hur olika komponenter interagerar med varandra. Här är en översikt över de vanligaste programparadigmerna:
1. Imperativ Programmering

   Beskrivning: Fokus på hur programmet ska utföra sina uppgifter, steg för steg.
   Exempel: C, Pascal, Java.
   Karakteristika: Användning av variabler, loopar och kontrollstrukturer för att styra flödet av programmet.

2. Deklarativ Programmering

   Beskrivning: Fokus på vad programmet ska göra snarare än hur det ska göra det.
   Exempel: SQL, HTML.
   Karakteristika: Specifikation av resultat utan att definiera exakta steg för hur de ska uppnås.

3. Objektorienterad Programmering (OOP)

   Beskrivning: Bygger på konceptet av "objekt", som kan innehålla data och metoder.
   Exempel: Java, C++, Python.
   Karakteristika: Användning av klasser, arv, polymorfism och inkapsling för att strukturera program.

4. Funktionell Programmering

   Beskrivning: Behandlar computationer som utvärderingar av matematiska funktioner.
   Exempel: Haskell, Scala, Erlang.
   Karakteristika: Användning av rena funktioner, immutabilitet och högre ordningens funktioner.

5. Logisk Programmering

   Beskrivning: Baseras på formell logik för att uttrycka program och dess regler.
   Exempel: Prolog.
   Karakteristika: Användning av fakta och regler för att dra slutsatser.

6. Kombinatorisk Programmering

   Beskrivning: Kombination av olika paradigm för att dra nytta av deras styrkor.
   Exempel: Scala (som stödjer både OOP och funktionell programmering).
   Karakteristika: Flexibilitet att använda flera paradigmer i ett och samma program.

7. Asynkron Programmering

   Beskrivning: Fokuserar på att hantera operationer som kan utföras parallellt, ofta för att förbättra prestanda.
   Exempel: JavaScript (med callbacks och promises), Python (async/await).
   Karakteristika: Hantering av icke-blockerande operationer för att öka effektiviteten.

Programparadigm påverkar hur utvecklare tänker på och strukturerar sina program. Valet av paradigm kan påverka kodens läsbarhet, underhållbarhet och prestanda. 
Genom att förstå olika paradigmer kan programmerare välja den mest lämpliga metoden för sina specifika behov och projekt.


# OOP - ObjectOrientering

Objektorientering är en programmeringsparadigm som bygger på konceptet "objekt". I stället för att fokusera på funktioner och logik, betonar objektorientering användningen av objekt som kan representera verkliga entiteter. Här är några grundläggande begrepp:

- Objekt: En instans av en klass som kan innehålla data (attribut) och funktioner (metoder) som definierar dess beteende.

- Klass: En mall eller en blueprint för att skapa objekt. Den beskriver vilka attribut och metoder objekt av den klassen kommer att ha.

- Inkaplsulering: Principen att dölja interna tillstånd och endast exponera ett begränsat gränssnitt för omvärlden. Detta gör att objekt kan hantera sin egen data och skydda den från oönskade förändringar.

- Arv: Möjligheten för en klass att ärva egenskaper och metoder från en annan klass. Detta främjar återanvändning av kod och gör det enklare att skapa hierarkiska relationer.

- Polymorfism: Förmågan att använda ett gemensamt gränssnitt för olika typer av objekt. Detta innebär att metoder kan anropas på objekt av olika klasser som ärver från en gemensam superklass.

- Abstraktion: Processen att förenkla komplexa system genom att fokusera på de mest relevanta aspekterna och dölja mindre viktiga detaljer.

Objektorientering gör det lättare att hantera komplexitet i programvaruutveckling och bidrar till att skapa modulära, flexibla och underhållbara system.