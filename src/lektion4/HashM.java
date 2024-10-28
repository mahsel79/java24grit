package lektion4;

import java.util.HashMap;
import java.util.Map;

public class HashM {

    public static void main(String[] args) {

        /*
            Till skillnad från Array, ArrayList, HashSet och LinkedList - så jobbar HashMap med key - value.
            Detta innebär att vi inte hämtar ut värde via index. Vi använder istället nycklar.

            Exempel:
            Array = index -> value
            ArrayList = index -> value

            HashMap = - key -> value

            Fördelen med key är att vi kan använda i princip vilken key som helst. Vi definierar den själv.

            När vi skapar en HashMap följer vi:

            HashMap - som är typen vi vill jobba med
            Vi sätter String, String innanför <>.
            Key = String
            Value = String

            Om vi istället hade satt HashMap<Integer, String>
            Key = Integer
            Value = String

            Vi döper variabeln till myMap och skapar vårt object med "new ..."
         */


        HashMap<String, String> myMap = new HashMap<String, String>();

        // Här säger vi att nyckeln skall vara OPC123 och att värdet skall vara "Opel Astra"
        myMap.put("OPC123", "Opel Astra");

        // Här säger vi att nyckeln är "nummer" och arr värdet är "0700 00 00 00"
        myMap.put("nummer", "0700 00 00 00");

        // Vi kan med hjälp av nyckeln hämta ut värden
        System.out.println(myMap.get("nummer"));
        System.out.println(myMap.get("OPC123"));

        //Vi kan hämta ut alla nycklar genom .keySet()-metoden
        System.out.println(myMap.keySet());

        //Vi kan hämta ut alla värden genom .values()-metoden
        System.out.println(myMap.values());

        // Vi kan genom nyckeln ta bort från listan
        System.out.println(myMap.remove("nummer"));
        System.out.println(myMap.keySet());

        // Här säger vi att nyckeln skall vara OPC123 och att värdet skall vara "Opel Astra"
        myMap.put("OPC123", "Opel Astra");

        // Här säger vi att nyckeln är "nummer" och arr värdet är "0700 00 00 00"
        myMap.put("nummer", "0700 00 00 00");

        System.out.println("\nPRINT METHODS ===============\n");
        System.out.println("\nPrint by key\n");
        printByKey(myMap);
        System.out.println("\nPrint by entry\n");
        printByEntry(myMap);
        System.out.println("\nPrint by values\n");
        printByValue(myMap);

    }

    private static void printByKey(HashMap<String, String> myMap) {
        // Loop genom nycklar
        for (String key : myMap.keySet()) {
            System.out.println("Nyckel: " + key + ", Värde: " + myMap.get(key));
        }
    }
    private static void printByEntry(HashMap<String, String> myMap) {
        // Loop genom entry set
        for (Map.Entry<String, String> entry : myMap.entrySet()) {
            System.out.println("Nyckel: " + entry.getKey() + ", Värde: " + entry.getValue());
        }
    }
    private static void printByValue(HashMap<String, String> myMap) {
        for (String value : myMap.values()) {
            System.out.println("Värde: " + value);
        }
    }
}
