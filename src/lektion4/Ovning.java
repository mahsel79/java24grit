package lektion4;

import java.util.*;

public class Ovning {

    public static void main(String[] args ) {
        //array();
        //arrayList();
        //currency();
    }


    private static void array() {
        // Skapa ett scanner-objekt
        Scanner scanner = new Scanner(System.in);

        // Skapa en array för att lagra sju heltal
        int[] tal = new int[7];

        // Läs in sju heltal från användaren
        for (int i = 0; i < tal.length; i++) {
            System.out.print("Ange heltal " + (i + 1) + ": ");
            tal[i] = scanner.nextInt();
        }

        // Beräkna summan av talen
        int summa = 0;
        for (int t : tal) {
            summa += t;
        }

        // Beräkna medeltalet
        double medelvarde = (double) summa / tal.length;

        // Skriv ut resultatet
        System.out.println("Summan av talen är: " + summa);
        System.out.println("Medeltalet av talen är: " + medelvarde);

        // Stäng scanner
        scanner.close();
    }


    private static void arrayList() {
        // Skapa ett Scanner-objekt
        Scanner scanner = new Scanner(System.in);

        // Skapa en lista för att lagra flyttal
        ArrayList<Double> tal = new ArrayList<Double>();

        // Läs in sju flyttal från användaren
        while (tal.size() < 7) {
            System.out.print("Ange ett flyttal mellan 0 och 100: ");

                double inmatatTal = scanner.nextDouble();

                // Kontrollera att talet ligger mellan 0 och 100
                if (inmatatTal >= 0 && inmatatTal <= 100) {
                    tal.add(inmatatTal);
                } else {
                    System.out.println("Talet måste vara mellan 0 och 100. Försök igen.");
                }

        }

        // Hitta det högsta och lägsta talet
        double hogstaTal = Collections.max(tal);
        double lagstaTal = Collections.min(tal);

        // Ta bort högsta och lägsta talet
        tal.remove(hogstaTal);
        tal.remove(lagstaTal);

        // Beräkna medeltalet på de återstående 5 talen
        double summa = 0;
        for (double t : tal) {
            summa += t;
        }

        double medelvarde = summa / tal.size();

        // Skriv ut resultatet
        System.out.println("Medeltalet av de återstående talen är: " + medelvarde);

        // Stäng scanner
        scanner.close();
    }

    private static void currency() {
        // Skapa en HashMap för valutakurser (från SEK till andra valutor)
        HashMap<String, Double> valutakurser = new HashMap<>();
        valutakurser.put("USD", 0.093); // 1 SEK till USD
        valutakurser.put("EUR", 0.086); // 1 SEK till EUR
        valutakurser.put("GBP", 0.075); // 1 SEK till GBP

        String usd = "usd";
        usd = usd.toUpperCase();

        // Initiera kontosaldo
        double saldoSEK = 1000.00; // Exempel: 1000 SEK

        // Skriv ut valutor och fråga användaren
        System.out.println("Tillgängliga valutor:");
        for (String valuta : valutakurser.keySet()) {
            System.out.println(valuta);
        }

        // Skapa ett scanner-objekt för användarinmatning
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vilken valuta vill du se ditt saldo i? ");
        String valdValuta = scanner.nextLine().toUpperCase();

        // Kontrollera att den önskade valutan finns i HashMap
        if (valutakurser.containsKey(valdValuta)) {
            // Beräkna saldot i den önskade valutan
            double kurs = valutakurser.get(valdValuta);
            double saldoIValuta = saldoSEK * kurs;

            // Skriv ut saldot i den valda valutan
            System.out.printf("Ditt saldo i %s är: %.2f%n", valdValuta, saldoIValuta);
        } else {
            System.out.println("Den valda valutan finns inte i systemet.");
        }

        // Stäng scanner
        scanner.close();
    }
}
