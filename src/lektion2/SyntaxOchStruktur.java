//När vi jobbar i flera mappar (packages), behöver vi i klassen definiera vilket paket vi befinner oss i
package lektion2;

/**
 * Detta är ett sätt att skriva javadoc. Detta skiljer sig inte mycket från att skriva en block-kommentar.
 * En javadoc-kommentar skrivs genom att ange en extra stjärna "/**" när kommentaren påbörjas.
 *
 * En javadoc används för att beskriva en class och dess funktion. Den KAN även innehålla fälten likt nedan
 * som börjar med ett @
 *
 *  @author Robin Jönsson
 *  @version 1.0
 *  @since 2024-10-23
 *  @see SyntaxOchStruktur
 *
 *  Denna klass beskriver den struktur som en klass bör/kan ha.
 *
 *
 * En klass har alltid ett namn som börjar med stor bokstav.
 * Klassens namn och filens namn bör alltid vara samma
 * Det är av god vana att alltid specificera public / private / protected
 *
 */
public class SyntaxOchStruktur {
/*
Detta är en block-kommentar och är bra att använda som vi behöver skriva något över flera rader.
Den skiljer sig från javadoc dels genom att den inte kommer/kan kompileras, vi använder oss enbart av en stjärna "/*"
när vi startar kommentaren och vi får inte samma snygga struktur med en "*" på varje rad.

Denna typ av kommentar kan även användas för att kommentera ut ett kodblock, istället för att sätta // på varje rad.


public class SyntaxOchStruktur
==============================
public: Accessmodifieraren anger att klassen är tillgänglig från andra paket.
class: Nyckelordet för att definiera en klass.
SyntaxOchStruktur: Namnet på klassen, som följer Java-namngivningskonventioner (CamelCase).
 */


    //========================================================= VARIABLER

    // Precis som för klassen, anger vi för denna variabel (name) access (private), typ(string) och namn(name) på det vi jobbar med.
    //Detta kallas för instansvariabel och kan ha access public, private och protected.
    public String name = "Robin"; //Detta är en private variabel och kan enbart nås INNANFÖR denna klass.

    /*
    Det går även att skapa variabel UTAN att tilldela något värde direkt.

    Varför?

    Många gånger kan vi ha en idé om vad vi skall göra. Exempelvis så vet vi att vi kommer ta emot ett namn och ålder.
    Då dessa värden är beroende av vad som matas in av en användare, så kan vi inte sätta värdet direkt. Däremot så kan
    vi från start skapa "placeholders" i minnet, för kommande värde.

    Läsbarhet: Det blir lättare att få en överblick över en klass genom att ha alla variabler först i klassen. Dessa
    variabler kan användas i hela klassen.


    Att tänka på!
    OM vi inte ger variabeln något värde, så finns det standardvärde på typerna. Detta är alltså ett värde som sätts av
    Java om vi själva inte anger något.

    String - null
    int - 0
    boolean - false

    String name; är samma sak som String name = null;
    int nummer; är samma sak som int nummer = 0;
    boolean isCorrect; är samma sak som boolean isCorrect = false;

     */
    private String name2; // I och med att vi inte tilldelar variabel något värde, kommer denna vara null



    //========================================================= METODER

    /*
    public - Precis som för en class, bör vi ange access (public/private/protected).
    void - Om vi enbart önskar att vår metod skall genomföra en instruktion, UTAN att returnera något, så använder vi void.
    setName - Metodens namn. Denna skrivs med camelCase. Börjar med liten bokstav och får en stor bokstav om det kommer efterföljande ord.
    Viktigt är att metodens namn beskriver vad metoden skall göra. Standard är att man använder "set..." när en metod används för att sätta
    ett värde på en variabel och "get..." när metoden skall returnera ett värde på en variabel.

    En metod har ALLTID (). Ibland använder vi paranteserna för att ha plats till att ta emot information. Ibland inte.
    När vi vill ta in ett värde, måste vi säga vilken typ av värde (String i detta fallet) och namnet på värdet (name)

    String name innanför paranteserna kallas för en parameter / in-parameter. Förkortat inparam/param.
     */
    public void setName2(String name) {
        this.name2 = name;
    }

    // Om vi är ute efter att hämta ett värde genom en metod, använder vi oss av return. Om vi skall returnera något
    // måste vi ange det när vi skapar metoden. Så i detta fall så tar vi bort ordet void och ersätter med String, då det
    // är en String vi vill returnera.
    public String getName2() {
        return name2;
    }

    private static void countToTenProgrammers() {

        /*
        De två variblerna (programmer och plural) ligger innanför metoden. Dessa två variablerna går INTE att nå någon
        annanstans. Dessa används i metoden och endast i metoden. Detta kallas för LOKAL variabel.
        Så de variabler vi skapade ovan, de kan användas i hela klassen, medan de nedanstående ENBART kan användas i metoden.
        Då vi enbart kan använda dessa i metoden - behöver vi INTE sätta access på dessa (public/private/protected)
         */

        String programmer = "programmer";
        String plural = "s";

        for(int i = 1; i < 11; i++) {
            if(i > 1) {
                System.out.println(i + " " + programmer + plural);
            } else {
                System.out.println(i + " " + programmer);
            }
        }

    }

    public static void main(String[] args) {
        countToTenProgrammers();
    }
}
