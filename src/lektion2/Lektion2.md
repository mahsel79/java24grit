# Lektion 2

## Sammanfattning
Idag har vi gått igenom `if-satser`, `datatyper`, `metoder`.
Vi har även pratat lite om programstruktur och därmed halkat in lite på det 
här med klasser. Det sistnämnda är lite tidigt, som sagt. Dock känns det viktig för att få en 
förklaring och kontext till hur kod används och delas upp. Samtidigt är det också viktigt att 
känna till då vi jobbar med jobbar med objekt - som exempel `String`.
Vi har idag, på det temat, kollat på vad som händer bakom `String` metod för att jämföra två strängar - `equalsIgnoreCase`.
Där kan vi se hur ett objekt är uppbyggt och vilka funktioner som finns att nyttja. Varje funktion i objektet är skrivna 
metoder. Vilket ni själva kommer göra i framtiden.

Jag är väl medveten om att det kan uppstå förvirring i konceptet klass/klasser. Och detta är helt ok! Vi är inte där än. Men vi kommer dit. Detta är som sagt en
del av planen. Vi skall tillsammans upprepa och återkomma till saker längst vägen, så att det till slut sitter. Jag har svårt att tro att andra saker kommer väcka samma
känslor och huvudbry som klasser gör i början. Men det kommer komma fler tillfällen då det känns tufft att få förståelsen. Men det kommet bli bra!

Utöver dagens ämne, så var det mycket repetition av föregående lektion. Vi skapade nytt program som skrev ut i konsolen och frågade efter värde, som användare uppmanades
att mata in. Häribland så kom vi tillbaka till diskussionen om `Scanner.nextLine()` och varför det fungerar så dåligt efter att vi använt `Scanner.nextInt()`. 

Såhär svarar chatgpt:

```
När du använder nextInt(), läser metoden bara det numeriska värdet från inmatningen och lämnar kvar den nya raden (newline-tecknet) som genereras när du trycker på Enter. 
Om du sedan försöker använda nextLine(), kommer det att läsa denna kvarvarande newline som en tom sträng och inte vänta på att användaren ska ange ny data.
```

Vi tittade även vidare på hur vi kan formatera strängar vi `System.out.printf()` för att bygga på vår kunskap.

### Vanliga Formatsträngar

    %d
        För att formatera heltal (decimal).
        Exempel: System.out.printf("Heltal: %d%n", 10);

    %f
        För att formatera flyttal (float eller double).
        Exempel: System.out.printf("Flyttal: %.2f%n", 3.14159); (2 decimaler)

    %s
        För att formatera strängar.
        Exempel: System.out.printf("Sträng: %s%n", "Hello");

    %c
        För att formatera en tecken (char).
        Exempel: System.out.printf("Tecken: %c%n", 'A');

    %b
        För att formatera boolean-värden (true/false).
        Exempel: System.out.printf("Boolean: %b%n", true);

    %n
        För att infoga en plattformsoberoende radbrytning.
        Används som %n i formatsträngar för att skapa nya rader.

### Specifika Format

    %.nf: Specifierar antal decimaler för flyttal.
        Exempel: %.3f för 3 decimaler.

    %0nd: Fyller med nollor till vänster för heltal.
        Exempel: %05d ger 00010 för talet 10.

    %-nd: Vänsterjusterar värdet inom ett fält av n tecken.
        Exempel: %-5d ger 10 (fyra mellanslag efter talet).

## Datatype
Vi har labbat lite med Övningsuppgift2 där vi praktiserat lite kring datatyper och hur dessa fungerar. Det är ett brett ämne och det finns mycket att grotta ner sig i.
Till en början så är huvudsaken att ha med sig det mest grundläggande. I detta finner vi att datatyperna kräver olika mycket minne. Därmed så kan de också spara olika mycket
information och med det sagt så har de olika användningsområden. Det är också viktigt att ha med sig att det inte alltid går att lita fullt ut på exempelvis avrundningar och
att det ibland skiljer sig mellan vår uppfattning om hur vi tycker att det borde vara, men hur det faktiskt är.

Exempel på detta är:
```
double z = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
System.out.print("10 * 0.1 = " + z); 
```

I ovan kod kan en lätt förvänta sig att svaret är 1. Men i själva verket är svaret `0.9999999999999999`.
Varför? Vi frågar chatgpt!

>I de flesta programmeringsspråk, inklusive Java, representeras flyttal med en binär format (IEEE 754). Många decimalvärden, som 0.1, kan inte representeras exakt i binärt format. När du adderar dessa värden, ackumulerar de små avrundningsfel.

Vi gick också igenom hur vi parse(-ar) en String till en int.
`int nyNumber = Integer.parseInt("123");`

I presentationen pratade vi också om två följande begrepp:

 - **Widening**: Automatisk konvertering till en större typ utan risk för dataloss. (Int -> Float -> Double)
 - **Narrowing**: Manuell konvertering till en mindre typ, vilket kan leda till dataloss, så det kräver explicit casting. (Double -> Float -> Int)


## If-satser
Vi körde tillsammans igenom exempel på if-satser och hade därtill praktisk övning. Vi pratade om if-satser generellt men också om "nestlade" if-satser.
I exemplen testade vi att "nestla" och bryta upp if-satserna.

Vi gick också igenom en del kring jämförelse-operatorerna samt i hur if-elseif-else fungerar. I detta så testade vi olika scenario för att få kläm på 
när kodblocken körs. Att ha med sig är att en if-elseif-else alltid kommer avslutad så fort ett villkor är sant. Så om ett villkor är sant redan i `if`
så kommer `else if` och `else` aldrig att köras.

## Operatorer
### Aritmetiska operatorer

    Addition (+)
        Används för att addera två tal.
        Exempel: int sum = a + b;

    Subtraktion (-)
        Används för att subtrahera ett tal från ett annat.
        Exempel: int difference = a - b;

    Multiplikation (*)
        Används för att multiplicera två tal.
        Exempel: int product = a * b;

    Division (/)
        Används för att dividera ett tal med ett annat.
        Exempel: int quotient = a / b;
        Observera: Vid division av heltal, om båda operandarna är heltal, trunceras (avskärs) decimalerna.

    Modulus (%)
        Används för att få resten av divisionen av två tal.
        Exempel: int remainder = a % b;

### Tilldelningsoperatorer

    Tilldelning (=)
        Tilldelar värdet av höger sida till vänster sida.
        Exempel: int a = 5;

    Addition och tilldelning (+=)
        Lägger till värdet på höger sida till värdet på vänster sida och tilldelar resultatet till vänster sida.
        Exempel: a += 3; // a = a + 3;

    Subtraktion och tilldelning (-=)
        Subtraherar värdet på höger sida från värdet på vänster sida och tilldelar resultatet till vänster sida.
        Exempel: a -= 2; // a = a - 2;

    Multiplikation och tilldelning (*=)
        Multiplicerar värdet på vänster sida med värdet på höger sida och tilldelar resultatet till vänster sida.
        Exempel: a *= 4; // a = a * 4;

    Division och tilldelning (/=)
        Dividerar värdet på vänster sida med värdet på höger sida och tilldelar resultatet till vänster sida.
        Exempel: a /= 2; // a = a / 2;

    Modulus och tilldelning (%=)
        Får resten av divisionen av värdet på vänster sida med värdet på höger sida och tilldelar resultatet till vänster sida.
        Exempel: a %= 3; // a = a % 3;

### Jämförelseoperatorer

    Lika med (==)
        Kontrollerar om två värden är lika.
        Exempel: if (a == b) { ... }

    Inte lika med (!=)
        Kontrollerar om två värden inte är lika.
        Exempel: if (a != b) { ... }

    Större än (>)
        Kontrollerar om vänster operand är större än höger operand.
        Exempel: if (a > b) { ... }

    Större än eller lika med (>=)
        Kontrollerar om vänster operand är större än eller lika med höger operand.
        Exempel: if (a >= b) { ... }

    Mindre än (<)
        Kontrollerar om vänster operand är mindre än höger operand.
        Exempel: if (a < b) { ... }

    Mindre än eller lika med (<=)
        Kontrollerar om vänster operand är mindre än eller lika med höger operand.
        Exempel: if (a <= b) { ... }

### Logiska operatorer

    Logiskt OCH (&&)
        Returnerar true om båda operanderna är sanna.
        Exempel: if (a > 0 && b > 0) { ... }

    Logiskt ELLER (||)
        Returnerar true om minst en av operanderna är sann.
        Exempel: if (a > 0 || b > 0) { ... }

    Logiskt INTE (!)
        Negerar värdet av en operand. Returnerar true om operandens värde är falskt och vice versa.
        Exempel: if (!(a > 0)) { ... }