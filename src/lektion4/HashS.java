package lektion4;

import java.util.HashSet;

public class HashS {

    public static void main(String[] args) {
        HashSet<String> myStrings = new HashSet<String>();
        myStrings.add("Min Sträng");
        myStrings.add("Min Sträng");
        myStrings.add("Min Sträng");
        myStrings.add("Min Sträng2");
        myStrings.add("Min Sträng3");
        myStrings.add("Min Sträng");
        myStrings.add("Min Sträng4");

        /*
        I ett HashSet är ordningen på elementen inte garanterad. Det betyder att även om du har lagt till "Min Sträng" först,
        kan den visas sist i utskriften. HashSet använder en hashfunktion för att bestämma var varje element ska lagras, och
        den faktiska ordningen kan variera beroende på hashkoden för varje objekt.

        Så, även om "Min Sträng" är den första som lagts till, kommer den att visas i den ordning som hashkoden bestämmer,
        vilket kan resultera i att den kommer sist i utskriften. Om du behöver en specifik ordning kan du överväga att använda
        en annan typ av samling, som LinkedHashSet, som behåller insättningsordningen.
         */
        System.out.println(myStrings);

        for(String robin : myStrings) {
            System.out.println(robin);
        }

    }
}
