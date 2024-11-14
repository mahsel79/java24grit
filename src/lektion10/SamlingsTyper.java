package lektion10;

import lektion10.classer.DayModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SamlingsTyper {

    public static void main(String[] args) {
        // Skapar en array med fördefinierade värden. Arrayen blir således lika stor som antal strängar - 3
        String[] dagar = new String[]{"Måndag", "Tisdag", "Onsdag"};

        //Skapar en tom array med storleken 10. 10 - index (0-9)
        String[] unknown = new String[10];

        // Skapar en ArrayList OCH sätter in värdena från arrayen dagar.
        // Lägg märke till hur Arrays används här.
        ArrayList<String> dagarArrAsList = new ArrayList<String>(Arrays.asList(dagar));

        // Skriver ut index0 för att visa att det är tidigare array som placerats in i ArrayList
        System.out.println("Array som lista : " + dagarArrAsList.get(0)); // Skriver ut måndag

        // En ArrayLista innehållande ett eget objekt. Detta för att visa att vi kan använda vilket objekt som helst
        // Kom ihåg att det krävs Wrappers om listan skall innehålla exempelvis int eller double
        ArrayList<DayModel> dagarList = new ArrayList<>();
        dagarList.add(new DayModel("2024-11-14", "Torsdag", true));
        dagarList.add(new DayModel("2024-11-15", "sdag", false));
        dagarList.add(new DayModel("2024-11-16", "Torg", false));
        dagarList.add(new DayModel("2024-11-17", "Tor", true));


        // For-each för att visa styrkan med att jobba med objekt.
        // Först definieras typen på det som listan innehåller - DayModel
        // Vi väljer att kalla värdet för day. Vi använder day i varje varv i loopen
        // dagarList -> definitionen på vilken lista vi vill loopa igenom
        for(DayModel day : dagarList) {
            System.out.println(day.getDate()); // För varje varv/iteration, vill vi skriva utt objektets datum.
        }

        // Denna kod visar hur samma loop kan skrivas - fast med lambda
        dagarList.forEach(dayModel -> {
            if(dayModel.getDate().equalsIgnoreCase("2024-11-14")) {
                System.out.println(dayModel);
            }
        });

        // Samma loop kan göras, på samma sätt, fast i kortare variant, om hela objektet skall skrivas ut
        dagarList.forEach(System.out::println); // Lägg märke till dubbel-kolon ::


        // Här används HashMap för att illustrera hur koden kan se ut
        // Nyckeln är av typen String och värdet är av typen DayModel (eget objekt)
        HashMap<String, DayModel> dagarMap = new HashMap<>();

        // Lägger till en rad i HashMap, nyckeln är 241114 och värdet är ett nytt objekt av DayModel
        dagarMap.put("241114", new DayModel("2024-11-14", "Torsdag", true));

        // För att visa hur nyckeln kan användas för att hämta ut objekt
        // Exemplet visar att objektet kan hämtas ut och sparas i en ny variabel
        DayModel minModell = dagarMap.get("241114");

        // For-each för att loopa igenom alla nycklar. I detta fall finns bara en nyckel - "241114".
        for(String key : dagarMap.keySet()) {
            System.out.println(key);
        }

        // For-each för att loopa igenom alla värden
        for(DayModel model : dagarMap.values()) {
            System.out.println(model);
        }

        // For-each för att loopa igenom alla par - alltså BÅDE nyckeln OCH värdet
        for (Map.Entry<String, DayModel> entry : dagarMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
