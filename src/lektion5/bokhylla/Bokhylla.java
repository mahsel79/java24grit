package lektion5.bokhylla;

import java.util.HashMap;

public class Bokhylla {

    /*
        Vi skapar en samlingstyp för att kunna spara undan böcker i bokhyllan-
        Vilken samlingstyp som väljs är upp till dig som utvecklare.

        I och med att vi skall ha en funktion som snabbt hämtar ut en specifik bok via
        ISBN - kan det vara en bra idé att använda någon form av Map. Detta för att vi
        enkelt kan definiera en nyckel - i detta fall ISBN.

        Så vi har en lista där vi använder ISBN, som i detta fall är en String och där värdet är ett objekt, i detta fall Bok
     */
    HashMap<String, Bok> list = new HashMap<>();

    // Vi skapar upp en metod som tar in Typen Bok, som vi kallar för bok (stor bokstav i typen, liten bokstav i namnet)
    // Metoden skall bara lägga till i listan och INTE returnera något - därmed använder vi void
    public void addBok(Bok bok) {
        //HashMapen tar emot en nyckel av typen String (ISBN) och värdet av typen Bok.
        //Nyckeln blir således ISBN som vi hämtar ut från objektet.
        list.put(bok.getISBN(), bok);
    }

    // Metod för att hämta ut ett värde i vår map, via en nyckel - ISBN
    // Vi tar in id, som i detta fallet är en String
    // Metoden returnerar ett objekt av typen Bok. Alltså den bok som förmodligen hittas i listan
    public Bok getBookById(String ISBN) {
        //Vi försöker hämta ut en bok från listan via nyckeln.
        return list.get(ISBN);
    }

    // Metod som skriver ut alla böcker i bokhyllan. Metoden är void eftersom att den bara genomför det vi ber den att göra - skriver ut.
    public void printBooks() {
        /*
            Vi använder en for-each-loop för att loopa igenom alla böcker i bokhyllan och skriver ut deras egenskaper.
            Vi börjar med att definiera vilket typ som vi vill jobba med varje varv/iteration. I detta fallet är det Bok.
            Vi namnger också detta till loopVariabel, vilket vi använder igenom loopen.
            Efter vi har berättat vilken typ och med vilket namn, separerar vi koden med ":" och därefter anger vi vilken lista vi vill loopa.
            Då vi är intresserad av alla VÄRDE och inte bryr oss om NYCKLARNA - använder vi .values()
         */
        for(Bok loopVariable : list.values()) {
            //För varje varv/iteration - skriver vi ut alla egenskaper som en bok innehar.
            //Detta fungerar pga att vi gjort en override på .toString() i Bok-klassen.
            //Om vi INTE hade gjort override på .toString - hade detta bara skrivet ut obegripliga saker.
            System.out.println(loopVariable);
        }
    }

}
