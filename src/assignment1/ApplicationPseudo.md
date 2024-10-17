# Assignment 1

## Pseudo
    -Skapa en klass med ett namn, förslagsvis Application(.java)
    -Skapa en public static void main(String[] args) {}
    -Skapa en eller flera private-metoder som du använder för att
        slutföra uppgiften. Du kan välja att ha en metod för varje steg, eller
        dela upp varje steg i enskilda metoder. I slutändan är det främst uträkningen
        som är skillnaden mellan metoderna, så det kan komma att bli mycket upprepad kod
        om du väljer att separera varje uppgift.

    - Metoden / Metoderna skall ha följande
        - double för PI (3.14)
        - Scanner för att ta emot det användaren matar in
        - En utskrift till konsol för att kommunicera med användare
        - En variabel för att spara användaren inmatning (radie)
        - En variabel för att spara uträkningen som behöver göras
        - En utskrift som presenterar resultatet
        - Ett anrop till scannern om att avsluta (.close())

## Uträkningar
    - Omkrets - 2 x PI x radie
    - Area - PI x radie x radie

## Varför dela upp stegen i olika metoder?

En metod är enkelt förklarat ett kodblock med en instruktion om vad som skall
göras. Enligt teorin så är best practice att vaje metod bara skall göra EN sak,
one thing only. Metoden skall också döpas till något som är tydligt samt beskrivande
för vad metoden gör.

#### Exempel
    public String printHelloToUser(String name) {
        return "Hello " + name;
    }

Det är alltid av god praxis att dela upp koden så mycket som möjligt.
Att dela upp kod kan göras både genom att skapa nya klasser men också genom
att skapa flera metoder. Java som är ett objektorienterat språk bjuder på
många fördelar när koden delas upp. Härtill har vi både att koden kan bli
mer läsbar, lättare att följa och att den är konkret uppdelad efter funktionalitet.

Att skapa metoder är också ett bra sätt att undvika duplicerad kod. Det lämnar också
utrymme för utvecklaren att forma en snygg och kvalitativ lösning - med mindre kod.





