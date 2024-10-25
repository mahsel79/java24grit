package lektion3;

public class Loopar {

    public void testForLoop() {
        for (int i = 1; i < 11; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " = udda");
            } else {
                System.out.println(i + " = jämt");
                // Varje gång vi skriver ut ett jämt tal, så har vi därefter continue. Detta innebär att loopen
                // kommer hoppa tillbaka och köra nästa varv. Därmed kommer texten "Kör denna kod" INTE att skrivas
                // om talet är jämt.
                continue;
            }
            System.out.println("Kör denna kod");
        }
    }

    public void testWhileLoop() {
        boolean loop = true;
        int i = 2;
        while (true) {
            System.out.println(i+i * i);

            if(i == 2) {
                // Dessa två gör att loopen stannar
                loop = false; // För att denna skall fungera, kräver det att "loop" är condition till loopen
                break; //Stoppar alltid loopen oberoende av annat - bra att läsa in sig på.
            } else {
                // Denna kommer kännas mer logisk först när vi itererar över exempelvis listor
                // Det är bra att läsa på kring det reserverade ordet continue
                continue; // Hoppar över varv / iteration
            }
        }
    }

    public void testDoWhileLoop() {
        /*
        När vi kör while / do-while, vill vi använda condition som under programmets körning kan förändras.
        Att skriva while(true) - det kommer inte kunna påverkas under programmets körning. Visst, vi hade kunnat
        använda en break; när vi vill stanna loopen - men vi bör träna på att INTE använda fasta värden.

          do {
            System.out.print("Hej");
        } while(true); // Gör inte såhär!!!! Det är viktigt att alltid kunna ändra villkoret under programmets körning!


        För att lösa detta så kan vi exempelvis skapa en variabel, säg boolean run = true; I och med att vi sätter
        värdet i en variabel, som kan förändras, så har vi skapat oss förutsättningar att på enkelt sätt stanna loopen.

        boolean run = true;
        while(run) {
            if(1==1) {
                run = false;
            }
        }
         */
    }

    public static void printName() {
        System.out.println("Hej name");
    }
}
