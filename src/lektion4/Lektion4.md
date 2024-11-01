# Lektion 4

## Sammanfattning

Idag har vi gått igenom samlingstyper. 
Vi har även praktiserat mycket för att få känna lite på dessa. Vi har lagt mycket energi på övningsuppgiften och har gemensamt gått
igenom steg för steg. Detta kan vara viktiga delar att ha med till Inlämningsuppgift 2.

På temat inlämningsuppgift 2, så kan det vara väldigt bra att ha koll på samlingstyperna. Med det sagt så ligger där ingen värdering
kring hur ni väljer att använda dessa eller när. Men för er egen skull och för att öva - ha gärna med någon av typerna.

## Samlingstyper
`Array`, `ArrayList`, `LinkedList`, `HashSet`, `HashMap` och `Iterator`.

## Wrappers
Som vi pratade om, så är det viktigt att tänka på att det är `"Wrappers"` vi använder när vi jobbar med listor, set och maps.
Detta innebär att vi ***INTE*** kan nyttja primitives. Nedan följer en lista på wrapper för varje primtiv som vi använder.

```
● int → Integer
● boolean → Boolean
● char → Character
● byte → Byte
● short → Short
● long → Long
● float → Float
● double → Double
```

## Mycket är på ytan väldigt likt

### ArrayList
```
Datastruktur: Interna arraybaserad lista.
Ordning: Bevarar ordningen av insatta element (insertion order).
Duplicerade element: Tillåter dubbletter.

Prestanda:
Tillgång: O(1) (snabb indexåtkomst).
Insättning/Borttagning: O(n) i genomsnitt (kan vara O(1) om man lägger till i slutet, men O(n) om det sker i början eller mitten, på grund av elementflytt).
Användningsfall: Bra val när du behöver snabb indexåtkomst och sällan lägger till eller tar bort element från mitten av listan.
```
  

### LinkedList
```
Datastruktur: Består av noder, där varje nod har pekare till nästa och (eventuellt) föregående nod.
Ordning: Bevarar ordningen av insatta element (insertion order).
Duplicerade element: Tillåter dubbletter.

Prestanda:
Tillgång: O(n) (måste traversera listan för att nå ett element).
Insättning/Borttagning: O(1) när man lägger till eller tar bort i början eller slutet, O(n) om det sker i mitten (för att nå noden).
Användningsfall: Bra val när du ofta lägger till och tar bort element, särskilt i början eller slutet av listan.

```
 
### HashSet
```
Datastruktur: Baseras på en hash-tabell.
Ordning: Ingen garanterad ordning av insatta element (ej insertion order).
Duplicerade element: Tillåter inte dubbletter (varje element måste vara unikt).

Prestanda:
Tillgång: O(1) i genomsnitt (snabbt att kontrollera om ett element finns).
Insättning/Borttagning: O(1) i genomsnitt (snabbt att lägga till och ta bort element).
Användningsfall: Bra val när du behöver lagra unika element och snabbt kontrollera om ett element finns.

```
   
#### Sammanfattning
```
 - ArrayList är bäst för snabb åtkomst och sällan ändringar.
 - LinkedList är bättre för frekventa insättningar och borttagningar.
 - HashSet är idealiskt för att lagra unika element utan behov av ordning och snabba uppslag.
```

Som ni ser så används exempel O(1) vid prestanda beskrivning. Detta är ett sätt att räkna och beskriva prestanda på.
Det är bra att känna till men inget som behöver stressar fram gällande inlärningen. Men The Big O är absolut något som
är nyttigt att ha med sig. Längst ner i denna fil ligger en sammansfattning om det.

Få INTE panik. Det är bra om ni förstår principen. Inget som kommer förhöras i. Men bra att ha läst och förstå som princip.
Detta är ett av verktygen som används för att avgöra exempelvis vilken loop som skall användas eller som i detta fall - vilket
typ av lista som är korrekt att använda. Det är också en del av förklaringen till varför det finns flera som upplevs ganska lika,
men som under huven trots allt är ganska olika. Djupdykning finns längre ner.
   

## Loopar
I och med arbetet med listor, så får vi en större användning av loopar. Dessa kan vi använda på många olika sätt och varje loop kan
ha sin fördel jämte en särskild samlingstyp. När vi jobbar med `arrayer` - kan det finnas fördelar med att köra med "vanlig" for-loop.
Detta då vi har räknaren som kan användas för att hämta ut specifikt index.
Om vi däremot vill skriva ut en hel samling, så finns det en kortare variant av for-loop som kan användas - _enhanced for loop_ . Denna 
loop kallas enklare och kanske mer beskrivande för for-each loop. Syntaxen ser ut som följer:

```
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }
```

### Beskriving av for-each-loop
I exemplet ovan har vi en `Array`. Denna `Array`har 5 index (0-4). Den innehåller värdena 1,2,3,4,5.

Där efter har vi en `for` som börjar med en datatype och följs med ett namn som vi vill använda för varje iteration.
När vi definierat detta så sätter vi ett ":" och därefter beskriver vilken lista vi vill loopa igenom - i detta fall "numbers".
För varje iteration / varv, kommer värdet skrivas ut i consolen.
1
2
3
4
5

Denna loop är väldigt behändig om vi enbart är ute efter att exempelvis skriva ut hela listan.

## Misc
En annan grej vi pratade om på lektionen handlade om hur vi jämför userinput - alltså när vi använder scanner.
Det är alltid av god vana spara undan usesInput om värdena skall användas för att jämföra. Exempelvis via en if-sats.

Det blir INTE bra att exempelvis göra `if(scanner.nextLine().equals("hej") || scanner.nextLine().equals("hej2")`.
När vi skriver på detta sätt, förväntar sig vårt program att få user input 2 gånger. Alltså varje gång vi kallar på nextLine().

Istället - spara värdet och jämför efter!

```
String userInput = scanner.nextLine();
if(scanner.nextLine().equals("hej") || scanner.nextLine().equals("hej2")
```
## Djupdykning

### The Big O

```
Big O är ett sätt att beskriva hur mycket tid eller minne en algoritm behöver i förhållande till storleken på ingången. Det ger en uppfattning om hur effektiv en algoritm är, särskilt när storleken på data ökar. Här är en enkel genomgång av de vanligaste Big O-beteckningarna:
1. O(1) – Konstant tid

    Beskrivning: Tiden för att köra algoritmen är konstant, oavsett hur stor ingången är.
    Exempel: Att hämta ett element från en array med ett specifikt index.

2. O(log n) – Logaritmisk tid

    Beskrivning: Tiden ökar logaritmiskt med ingångens storlek. Vanligt i algoritmer som delar problemet i mindre delar.
    Exempel: Binär sökning i en sorterad lista.

3. O(n) – Linjär tid

    Beskrivning: Tiden ökar linjärt med storleken på ingången. Om ingången dubbleras, dubbleras även tiden.
    Exempel: Att gå igenom varje element i en lista för att hitta ett specifikt värde.

4. O(n log n) – Linjär-logaritmisk tid

    Beskrivning: Tiden ökar som en kombination av linjär och logaritmisk tid. Vanligt i effektiva sorteringsalgoritmer.
    Exempel: Merge sort och quick sort.

5. O(n²) – Kvadratisk tid

    Beskrivning: Tiden ökar kvadratiskt med storleken på ingången. Vanligt i algoritmer som involverar dubbla loopar.
    Exempel: Bubblsortering eller insättningssortering.

6. O(2^n) – Exponentiell tid

    Beskrivning: Tiden ökar exponentiellt med storleken på ingången. Dessa algoritmer blir snabbt orealistiska för större ingångar.
    Exempel: Brute-force-lösningar för vissa problem, som att lösa ett schackproblem.

7. O(n!) – Faktoriell tid

    Beskrivning: Tiden ökar faktoriellt, vilket är extremt snabbt. Används sällan i praktiken på grund av sin ineffektivitet.
    Exempel: Att generera alla permutationer av en lista.

Sammanfattning

Big O är ett sätt att klassificera algoritmers effektivitet. Det hjälper oss att förstå hur algoritmer skalar med större datamängder och att välja rätt algoritm för rätt problem. Ju lägre Big O, desto mer effektiv är algoritmen i allmänhet.

```