# Lektion 6

## Sammanfattning
Idag fortsatte vi med OOP (ObjektOrientering). Vi pratade fortsatt mycket om OOP-principer men lade därtill moment där vi 
tittade på arv och abstracta klasser. 

Vi använde oss av exempel med fordon och djur - för att skapa våra objekt.


Innan detta gjorde vi en kort övning med papper och penna där kod skulle utvärderas / kommenteras.
Alla fick ut papper med utskriven kod. Denna skulle kommenteras i alla steg. Riktigt bra jobbat!

Vi avslutade lektionen med att titta på uppgiften gällande Mini-projektet. Om ni inte var närvarande, kan det vara god idé 
att prata med mig kommande lektion!
Redovisning av mini-projektet är inte helt spikat. Men det lutar åt att jag kommer ha individuella samtal, där vi går igenom
projektet, dess funktion och diskuterar lösningen.


#### Lite regler att upprepa:
- En klass behöver INTE vara `abstract` för att ärvas
- En `abstract class` kan INTE instansieras (e.g. `new NameOfAbstractClass()`)
- En `abstract class` kan innehålla både vanliga och abstrakta metoder 
- Om en klass INTE innehåller minst EN abstrakt metod, skall INTE heller klassen vara abstrakt
- Vi använder konstruktor för att sätta värden till ett objekt direkt vid instansiering
- Ordningen och typerna MÅSTE stämma överens med hur konstruktorn ser ut
- Konstruktorn körs alltid FÖRST när vi instansierar
- För att ärva en klass använder vi ordet `extends` och syntaxen är e.g. `public class Class1 extends Class2`

Vi kollade även på `interface`. När vi jobbar med `interface` är principerna liknande `abstract`. Det är en form av utveckling
där vi beskriver en klass utseende. Där finns många fördelar med denna typ av utveckling. Vi skulle kunna likna både
`abstract` och `interface` vid ett kontrakt. Allt som ärver, implementerar, MÅSTE ha med de delar som den abstrakta klassen
eller interface-et har definierat. Emellertid så är det upp till oss som utvecklare om vilka grejer vi väljer att använda.
Dock måste ALLT implementeras / nämnas i klasserna som ärver.

När vi arbetar med abstrakta metoder eller interface-metoder, behöver vi i den klass som ärver/implementerar
använda `@Override` på de metoder som implementeras.

Även om vi INTE gjort någon djupdykning i just `interface` - kan väl värt att kolla vidare på. Det går att skapa mycket magi
med hjälp av detta koncept och är absolut något som används frekvent på arbetsmarknaden. Inte minst när ni jobbar med ramverk.
Exempel på ramverk kan vara Spring / Spring Boot.

## Polymorfism
Vi pratade lite om `polymorfism` - som enkelt förklaras med "många former". Vi tittade på exempel på metoder som kan "överlagras".
Här kommer exempel på detta:

```
    public void setValues(String value)
    public void setValues(String value1, String value2)
    public void setValues(String[] values)
```

I ovan exempel så ser vi att vi kan ha flera metoder, med samma namn. Huvudsaken är att inparametrarna skiljer sig åt.
Vi skapar alltså många former av samma metod.

- Metod 1 i exemplet, tar emot ett värde i form av en String
- Metod 2 i exemplet, tar emot två värde i form av två String
- Metod 3 i exemplet, tar emot en array med typen String

## Youtube
- Abstracta classer - https://www.youtube.com/watch?v=HvPlEJ3LHgE
- Polymorfism - https://www.youtube.com/watch?v=jhDUxynEQRI
- Constructor - https://www.youtube.com/watch?v=pgBk8HC7jbU
- Super - https://www.youtube.com/watch?v=Qb_NUn0TSAU
- This - https://www.youtube.com/watch?v=ETLHbHenW44
- Multiple Inheritance - https://www.youtube.com/watch?v=1-JBFJ8Xar0
- Java Garbage-collector - https://www.youtube.com/watch?v=Mlbyft_MFYM


## Exempel på kodtest
Det fanns från vissa önskemål på exempel av kodtester. Därmed lägger jag några här.
Där finns många fler att tillgå, så om det är uppskattat, så kan jag fortsättningsvis
bifoga likt nedan.


Att utvärdera:
- Syntax
- Körs programmet?
- Körs programmet, men innehåller fel?

Börja med att skriva ner på papper - vad tror du händer/är fel/resultat.
Därefter kan du ta in koden i IntelliJ för att testa köra koden.

### Ex1
```
public class InterviewExample {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Numret är: " + number);

        if (number > 5)
            System.out.println("Numret är större än 5");
        else 
            System.out.println("Numret är mindre eller lika med 5");

        // Logiskt fel: Detta ger alltid false
        if (number = 10) {
            System.out.println("Numret är exakt 10");
        }
    }
}
```

### Ex2

```
class Animal {
    void makeSound() {
        System.out.println("Djuret gör ett ljud");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Vov vov");
    }
}

class Cat extends Animal {}

public class InterviewExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound();
        myCat.makeSound();
    }
}

```

### Ex3
```
public class LoopExample {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.println("Count is: " + count);
        }
    }
}
```

### Ex4
```
public class TypeCastingExample {
    public static void main(String[] args) {
        double num = 10.5;
        int result = (int) num;
        System.out.println("Converted value: " + result);

        String str = "100a";
        int parsedValue = Integer.parseInt(str);
        System.out.println("Parsed value: " + parsedValue);
    }
}
```