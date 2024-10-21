package lektion1;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Random random = new Random();

        //Vi skapar ett random-tal. I detta fall något som
        // skall representera en radie, med decimal.
        // Vi anger 50.0 för att vi vill sätta en maxgräns på max 50
        // Vi lägger till +1 för att börja räkna från 1 istället för från 0
        // Vi använder "f" efter 1.0 för att berätta att det är ett flyttal/decimal
        double radie = random.nextDouble(50.0) + 1.0f;

        // Deklarerar och initierar PI, variable
        final double PI = 3.14;

        // Använder oss av javas Scanner för att ta emot user-input
        Scanner scanner = new Scanner(System.in);

        // Skapar variabler för att spara undan uträkningar
        double omkrets = 2 * PI * radie;
        double area = PI * radie * radie;

        // Math.pow kan användas när vi skall räkna ut "upphöjt till"
        // I nedan fall har vi alltså radien upphöjt till 3
        double volymKlot = (4.0 / 3.0) * PI * Math.pow(radie, 3);
        System.out.println("Omkretsen av cirkeln är: " + omkrets);
        System.out.println("Arean av cirkeln är: " + area);
        System.out.println("Volymen av klotet är: " + volymKlot);
        System.out.print("Vill du beräkna volymen av en cylinder? (ja/nej): ");

        //Vi fångar upp användaren inmatning och sparar undan i variabeln svar
        String svar = scanner.next();

        // Kontrollerar vad användaren vill göra
        // Om ja - körs första kodblock (innanför if)
        // annars körs kodblock innanför else
        if (svar.equalsIgnoreCase("ja")) {
            System.out.print("Ange höjden på cylindern: ");
            double hojd = scanner.nextDouble();
            double volymCylinder = area * hojd;
            System.out.println("Volymen av cylindern är: " + volymCylinder);
        } else {
            System.out.println("Inga fler beräkningar görs.");
        }
        /**
         * I Java används scanner.close() för att stänga en Scanner-instans när du är klar med att använda den. Det har flera syften:
         *
         * Resurshantering: När en Scanner skapas, t.ex. för att läsa från en fil eller systemets inmatning (som System.in), allokeras resurser som minne och filhandtag. Genom att stänga scannern frigörs dessa resurser.
         *
         * Undvika minnesläckor: Om du inte stänger scannern kan det leda till att programmet använder mer minne än nödvändigt, vilket kan påverka prestandan.
         *
         * Stängning av strömmar: Om Scanner är kopplad till en fil eller annan ström, stänger scanner.close() också den kopplade strömmen. Det är viktigt för att säkerställa att alla data skrivs och att filen inte är låst.
         *
         * Det är en god praxis att alltid stänga resurser när de inte längre behövs för att undvika potentiella problem.
         */
        scanner.close();
    }
}
