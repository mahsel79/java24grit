package lektion4;

import java.util.ArrayList;

public class ArrayListor {

    /*
        Till skillnad från array, så är en ArrayList dynamisk. Det innebär att vi inte behöver beskriva från början
        om hur lång den behöver vara. Den växer varje gång vi tilledelar den ett värde. Men, det är också viktigt att
        känna till vad som händer i bakgrunden - vad sker? Vill kollar detta genom att hålla ner CTRL och klickar på
        .add()-metoden som finns i koden nedan.

        Men först, syntax, hur ser en ArrayList ut?

        Först måste vi beskriva typen på vår variabel som vi skapar, precis som för allt annat
        ArrayList

        Vidare behöver vi berätta vilken typ listan skall innehålla, detta gör vi innanför <>
        <String>

        Sen sätter vi namn på vår variabel - i detta fallet "bollar"

        För att skapa objektet och ha tillgång till alla metoder innanför ArrayList-klassen, behöver vi instansiera
        = new ArrayList<>();

     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        ArrayList<String> bollar = new ArrayList<String>();
        bollar.add("Handboll");
        bollar.add("Golfboll");
        bollar.add("Badboll");
        bollar.add("Fotboll");
        bollar.add("Pingisboll");


        //Till skillnad från arrayer, kan vi enkelt skriva ut listans innehåll på skärmen.
        System.out.println(bollar);

        /*
            Metoder att använda i ArrayList-objektet
         */

        //Genom .get()-metoden, kan vi hämta ut värdet från specifikt index
        System.out.println(bollar.get(2));

        // Genom .getFirst()-metoden kan vi hämta det första värdet i listan, index 0
        System.out.println(bollar.getFirst());

        // Genom .getLast()-metoden kan vi hämta sista värdet i listan
        System.out.println(bollar.getLast());

        // Genom .size()-metoden kan vi läsa ut hur lång/stor listan är
        System.out.println(bollar.size());

        // Genom .isEmpty()-metoden kan vi kolla om listan har några värden - tillbaka får vi antingen true/false
        System.out.println(bollar.isEmpty());

        // Genom .remove()-metoden kan vi plocka bort index. Men vad händer då? Existerar inte index 3 längre då?
        System.out.println(bollar.remove(3));

        System.out.println(bollar.get(3));

        bollar.clear();

        System.out.println(bollar.isEmpty());
        System.out.println(bollar);
    }




}
