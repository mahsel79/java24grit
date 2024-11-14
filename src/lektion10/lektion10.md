# Sammanfattning
Idag har vi jobbat mycket med repetition och handledning. Vi har gått igenom samlingstyper, object, gui. Vi har även fortsatt
med att bygga vidare på vår miniräknare. Vi utgick från skalet, vi skapade förra lektionen. Sen jobbade vi indiviuellt och 
i par, för att lösa funktionaliteten.

På eftermiddagen körce vi med praktiska exempel gällande samlingstyper, klasser, lambda och loopar.

## Miniräknaren
Resultatet av miniräknaren blev mångsidig. Vi körde en kort redovisning på de alternativ som skapats och upptäckte snabbt 
att alla löst det på sitt sätt. Ytterligare ett exempel på att det finns många lösningar för samma problem. Därav så är det
svårt att avgöra vad som är bäst. Funkar det så funkar det!
Emellertid så går det givetvis att vidare gå ner på djupet; kontrollera och refaktorera kod för att förfina, kontrollera
vad som kräver mest datorkraft för att exekvera och om koden är läsbar. Men det var inget vi gick igenom idag. Idag handlade
det enbart om att få grafiken att lira tillsammans med logiken.

## JAR-filer + Java-installation
Vi lyckades till slut få alla att ha en körbar java-applikation på sin maskin. Alltså en körbar fil, helt utanför IntelliJ.
Instruktioner för detta finns i Classroom under fliken IntelliJ

## Samlingstyper
Det fanns önskemål om att gå igenom samlingstyper igen. Så idag gick vi igenom `array`, `ArrayList` samt `HashMap`. Informationen
i sig var inte ny men den upprepade kunskapen är bra!

Kortfattad repetition:
- Array (index-baserad) är bra att använda om vi från början känner till hur lång listan skall vara... Exempelvis en top 10 lista
- ArrayList (index-baserad) är mer dynamisk och kan vara bra att använda om vi på förhand inte vet hur lång den kommer bli. Bra att komma ihåg är att 
det bakom ArrayList gömmer sig en Array. Varje gång vi lägger till något nytt i listan, som är en array, hjälper Java oss
med att kopiera befintlig data över till en ny array, med en plats mer. Detta innebär att ArrayList kan upplevas fint att 
jobba med... Men den kräver också mer minne. Något ni säkert får nys om i nästa kurs.
- HashMap (key, value) HashMap kan vara bra att använda om vi enkelt vill plocka ut värden från en lista. Detta då HashMap
består av par (en nyckel och ett värde). Genom en nyckel, som vi själv definierar, kan vi hämta ut ett värde.

## Debug
Vi gick igenom hur debuggern fungerar och vilka fördelar det finns med att alltid köra med debug. Vi pratade om koncept som
breakpoints, evalutate espressions och hur man kan ändra värde på variabler.

Praktisera gärna debug så mycket som möjligt. Ni kommer ha användning för det! Massor!

- Breakpoints: https://www.jetbrains.com/help/idea/using-breakpoints.html
- Evaluate: https://www.jetbrains.com/help/idea/examining-suspended-program.html#evaluate-arbitrary
- Set Value: https://www.jetbrains.com/help/idea/tutorial-set-value.html

## Upprepning klasser
Vi tittade lite närmare på klasser igen. Inget nytt; medlemmar/egenskaper/variabler, constructor och getters/settes.
Det vi däremot kom in på, är hur vi kan använda objekt för att lagra data! Detta kan med fördel göras om vi behöver flytta
data mellan klasser.

Vi kan exempelvis ha en konstruktor som vill ha in 5 parametrar. MyConstructor(String, String, String, int, int).
För att möta upp detta så skulle vi kunna ha en modell-klass, med just dessa egenskaper. Och vi exempelvis har MyObjekt med
egenskaperna String, String, String, int,int. Så kan vi i konstruktorn istället köra MyConstructor(myObject). Detta gör att 
koden på sikt kommer bli renare. Exempel finns i koden på Github.

Kortfattat så kan en klass en eller flera egenskaper. En eller flera metoder. Det är helt upp till dig. Det kan i princip
BARA blir för mycket. Att en klass har för mycket kod och bör splittas till flera. Men sällan att en klass har för lite 
kod, om den följer ett logiskt mönster.

## Record
Vi kom även in och pratade om records. Det finns exempel på detta på Github.
Record är bra att använda som vi har en klass som inte skall ha egenskaper i att förändras. Egenskaperna sätts en gång via
konstruktorn. Där efter får vi getters automagiskt av java. Vi behöver inte skriva massa kod för det.

#### Syntax
```
public record Dog(String name, int age, int amountOfLegs) {}
```

När vi skall skapa ett objekt av ett record, så gör vi som vanligt:

```
Dog myDog = new Dog("Viggo", 1, 4);
myDog.name(); //getter
```

I och med att vi inte får några setters - så innebär det att innehållet i en record är konstant. Detta kallas för `immutable`.
I detta fall, så är det mer eller mindre så, att alla egenskaper vi skapade i vårt record (name, age, amountOfLegs), är final.
De kommer inte kunna förändras efter att de är skapade.

Records är MYCKET bra om vi bara skall hålla information i objekt. Information som inte bör/skall kunna förändras.
Att tänka på är att records INTE kan använda extends. Så om du skall jobba med arv, så är det fortfarande klasser som gäller.
Det är INTE fel att blanda med records och klasser - det är fullt logiskt. Så klasser kan du använda där du behöver setters.
Om du har objekt som bara skall skapas med en viss information, aldrig förändras - använd records.

__Records fungerar enbart från och med Java 14__

- Records: https://www.baeldung.com/java-record-keyword
- Immutable: https://www.youtube.com/watch?v=Bj9Mx_Lx3q4
- Records: https://www.youtube.com/watch?v=gJ9DYC-jswo


