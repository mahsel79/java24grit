package lektio11;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
 * För att koden skall fungera så måste denna kod laddas ner
 * https://github.com/FasterXML/jackson
 *
 */


public class JsonExempel {

    public static void main(String[] args) {
        // Skapa en Map med data
        Map<String, String> map = new HashMap<>();
        map.put("name", "John Doe");
        map.put("age", "30");
        map.put("city", "Stockholm");

        // Skapa en ObjectMapper för att skriva till JSON
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Spara Map till JSON-fil
            objectMapper.writeValue(new File("data.json"), map);
            System.out.println("Map har sparats till data.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
