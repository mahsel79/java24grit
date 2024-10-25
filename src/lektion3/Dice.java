package lektion3;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {

        // Värdet som returneras av amountThrow-metoden, sparar vi undan i variabel med datatype int, som vi väljer att kalla numOfThrows
        int numOfThrows = amountThrow();

        // Värder som returneras av performThrow-metoden, sparar vi undan i variabel med datatype int, som vi väljer att kalla för totalsumma
        int totalSumma = performThrow(numOfThrows);

        // Vi skriver ut till console
        System.out.println("Den totala summan av dina kast är: " + totalSumma);
    }


    // Metoden används för att fråga spelaren om hur många gånger den vill kasta tärningen
    // Då metoden har "int" - räknar vi med att metoden returnerar någon form av heltal tillbaka
    public static int amountThrow() {
        // Vi initierar ett object av klassen Scanner, som vi väljer att kalla scanner
        Scanner scanner = new Scanner(System.in);

        // Vi uppmanar användaren att beskriva hur många gånger tärningen skall kastas
        System.out.print("Hur många gånger vill du kasta tärningen? ");

        // Vi läser in användarens svar om hur många gånger användaren vill kasta
        String input = scanner.nextLine();

        //Vi returnerar värdet efter att ha gjort om strängen till en int
        return Integer.parseInt(input); // Konvertera strängen till ett heltal
    }


    // Denna metod använder vi för att utföra ett kast.
    // Vi tar emot ett heltal som i detta fallet är om hur många kast användaren valt att kasta
    // Då metoden har "int" - räknar vi med att metoden returnerar någon form av heltal tillbaka
    public static int performThrow(int antalKast) {
        //Vi skapar ett object av classen Random, som vi väljer kalla för random
        Random random = new Random();

        // Vi skapar en variabel för att ha någonstans att placera totalSumman på
        int totalSumma = 0;

        // Vi skriver ut i consolen
        System.out.println("Resultat av dina tärningskast:");

        // Vi skapar en forloop som loopar det antal gånger som användaren angett
        for (int i = 1; i <= antalKast; i++) {

            // För varje varv / iteration

            //Vi skapar en variabel som representerar en tärning. Här får vi ett random tal mellan 1-6
            int kastResultat = random.nextInt(6) + 1; // Genererar ett tal mellan 1 och 6

            //Vi skriver ut resultatet
            System.out.println("Kast " + i + ": " + kastResultat);

            // Vi använder tidigare skapad variabel för att addera summan och därmed hålla koll på totalen
            totalSumma += kastResultat;
        }

        //Vi returnerar totalen
        return totalSumma;
    }

}
