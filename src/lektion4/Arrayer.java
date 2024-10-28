package lektion4;

import java.util.Arrays;

public class Arrayer {

    // För att skapa en array så lägger vi helt enkelt till hak-klammrar på vår typ.
    // Detta kan vi se exempel på när vi tittar på public static void main(String[] args)
    // Där args är en array med typ String

    static String[] strArr = new String[10]; // Detta är en array, med strängar. Arrayn har totalt 10 index. 0-9
    int[] intArr = new int[8]; // Detta är en array, med int. Arrayn har totalt 8 index. 0-7

    // Om vi redan känner till de värden vi vill lagra, kan vi lägga till dessa direkt. Då blir resultatet en array med 3 index. 0-2
    static String[] strArr2 = {"str1", "str2", "str3"};
    int[] intArr2 = {1, 2, 3};


    // Om vi är intresserade av att hämta ut ett värde, använder vi index.
    // Så om jag vill ha ut värdet "str2" i strArr2 ovan, och spara undan det. Då ser det ut som nedan.
    String strValue = strArr2[1];

    // Om vi vill göra samma sak fast för intArr2, där vi är intresserade av värdet 3
    int intValue = intArr2[2];

    /*
        Här är exempel där vi använder en vanlig forloop. Genom denna typen av loop kan vi stega igenom varje index och skriva ut
        värdet. i = blir därmed indexet. I exemplet nedan kommer vi således att skriva ut värdet som finns på index 0 vid första
        iterationen.
     */
    private void loopWithForLoop() {
        for (int i = 0; i < strArr2.length; i++) {
            System.out.println(strArr2[i]);
        }
    }


    /*
      Som nämndes när vi gick igenom loopar - så finns det ytterligare en loop som vi inte pratat om. Denna loop är väldigt
      användbar nu när vi skall jobba med arrayer och listor.

      Loopen skrivs med for() men har en annorlunda struktur därefter. for() tillsammans med nedan struktur ger loopen
      namnet "for-each".

      I en for-each-loop definierar vi typen vi vill loopa igenom, i detta fallet String. Vi vill att värdet vid varje
      iteration är s. Sen sätter vi ett ":" och därefter anger vi exempelvis arrayen eller listan.

      Denna loop kommer således skriva ut alla värden för varje index, fram till dess att loopen nått listans slut.
      Loopen används ofta när utvecklaren är ute efter att gå igenom en hel array eller lista. Om så är fallet så behöver
      vi inte bry oss om index... Vi vill bara ha ut värdena.

     */
    private void loopWithForEach() {

        // Loopa igenom alla String i arrayen
        for(String s : strArr2) {
            System.out.println(s);
        }

        // Loopa igenom alla int i arrayen
        for(int i : intArr2) {
            System.out.println(i);
        }
    }

    /*
        Då arrayer har en bestämd längd, så har de alltså alltid, från de att de skapats, allokerat minne.
        För att illustrera detta så kommer vi här nedan försöka få till en utskrift som påminner om den tabell som finns
        i presentationen
     */
    private static void printEmptyArray() {

        //strArr har INGA värde för sina index. Det enda vi gjort är att vi deklarerat att arrayen är 10 index lång!
        System.out.println("| index | värde |");
        for(int i = 0; i < strArr.length; i++) {

            System.out.println("_________________");
            System.out.println("|   "+i+"   |       |");
        }
    }

    private static void printStrArray() {
        System.out.println("| index | värde |");
        for(int i = 0; i < strArr2.length; i++) {

            System.out.println("_________________");
            System.out.println("|   "+i+"   | "+ strArr2[i] +"  |");
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr2[1]);
        //printEmptyArray();
        printStrArray();
    }
}
