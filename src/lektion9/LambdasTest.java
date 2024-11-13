package lektion9;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdasTest {

    public static void main(String[] args) {
        String[] ord = new String[]{"Hej", "Hallå", "Blå", "Apa", "Citron", "boll", "bas"};

        for(int i = 0; i < ord.length; i++) {
            System.out.println(ord[i]);
        }

        String myWord = Arrays.stream(ord)
                .filter(s -> s.equalsIgnoreCase("boll")) // Filtrera för att hitta ordet "boll"
                .findFirst()                  // Hämta det första (och enda) resultatet
                .orElse("Ord ej funnet");      // Om inget ord hittas, returnera "Ord ej funnet


        System.out.println("Det funna ordet : " + myWord);

        //Lamda för att skriva ut alla ord i listan
        Arrays.stream(ord).forEach(System.out::println);

        //Med hjälp av Arrays, skapar vi en lista av ord[]
        ArrayList<String> ordAsList = new ArrayList<String>(Arrays.asList(ord));

        //Lamda för att skriva ut alla ord i listan.
        ordAsList.forEach(System.out::println);

        //OM jag vill ha lite mer kontroll på vad som skrivs ut, så kan jag förlänga mitt argument i lamdan
        ordAsList.forEach((word) -> System.out.print(word + "\t"));

        //OM jag vill förlänga mitt argument över flera rader och lägga till logik, så kan jag göra det genom att
        // lägga in ett kodblock. Detta görs genom att jobba med { }
        ordAsList.forEach((word) -> {
            if(word.equalsIgnoreCase("Citron")) {
                System.out.println("Hittade Citronen");
            } else {
                System.out.println("Ett annat ord");
            }
        });



    }


}
