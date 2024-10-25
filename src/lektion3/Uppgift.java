package lektion3;

import java.util.Random;

public class Uppgift {

    public static void main(String[] args) {
        // Anropa den nya funktionen
        step1();
        step2();
        step3();
        step4();

        // Skriv ut jämna tal mellan 1 och 10
        System.out.println("Jämna tal mellan 1 och 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Kontrollera om talet är jämnt
                System.out.println(i);
            }
        }

    }

    private static void step1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("räknar: " + i);
        }
        System.out.println(); // Skriver ut en ny rad efter loopen
    }

    private static void step2() {
        int i = 1; // Deklarera och initiera räknarvariabeln

        while (i <= 10) {
            System.out.println("räknar: " + i);
            i++; // Öka räknarvariabeln med 1
        }

        System.out.println(); // Skriver ut en ny rad efter loopen
    }

    private static void step3() {
        int i = 1; // Deklarera och initiera räknarvariabeln

        do {
            System.out.println("räknar: " + i);
            i++; // Öka räknarvariabeln med 1
        } while (i <= 10); // Villkor för att fortsätta loopen

        System.out.println(); // Skriver ut en ny rad efter loopen
    }

    private static void step4() {
        Random random = new Random();
        int slumpatTal = random.nextInt(11); // Slumpar ett tal mellan 0 och 10

        System.out.println("Slumpat tal: " + slumpatTal);
        System.out.println("Utskrift från 1 till " + slumpatTal + ":");

        for (int i = 1; i <= slumpatTal; i++) {
            System.out.println(i);
        }

        System.out.println(); // Skriver ut en ny rad efter loopen
    }
}
