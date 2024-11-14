package lektion10;

import lektion10.classer.Person;
import lektion10.classer.PersonRecord;

/**
 * Denna klass kommer inte att kommenteras mer ingående.
 * Klassen har använts för att visa upp debugg
 */
public class DebugCode {


    static Person person = new Person("R", 98, "cykel", "Kompanigatan");

    static String[] djur = new String[]{"Katt","Hund","Fågel"};

    static PersonRecord personRecord = new PersonRecord("R", "R");


    public static void main(String[] args) {
        int result = addNumbers(5, 7);
        System.out.println("Result: " + result);
        String message = generateMessage("debugging");
        System.out.println("Message: " + message);
        listDjur();
        printPerson();
        personRecord.firstName();
        personRecord.lastName();
    }

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static String generateMessage(String action) {
        String message = "We are " + action + " this program!";
        return message;
    }

    private static void listDjur() {
        for(int i = 0; i < djur.length; i++) {
            System.out.println(djur[i]);
        }
    }

    private static void printPerson() {
        System.out.println(person);
    }

}
