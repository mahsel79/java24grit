package lektion2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);
        int fiktivAge = 57;
        String userName;
        String userAge;
        String userEmail;
        String userEmail2;

        System.out.println("Vänligen mata in ditt namn: ");
        userName = sc.nextLine();
        System.out.println("Vänligen mata in din ålder: ");
        userAge = sc.nextLine();
        System.out.println("Vänligen mata in din mail: ");
        userEmail = sc.nextLine();
        System.out.println("Vänligen mata in din mail en gång till: ");
        userEmail2 = sc.nextLine();

        System.out.printf("Din inmatade data är som följer\n\t Namn: %s \n\t Ålder: %s\n\t Email %s\n\t Email2 %s\n", userName, userAge, userEmail, userEmail2);

        if(fiktivAge > Integer.parseInt(userAge)) {
            System.out.println("Du är yngre än mig");
        } else if(fiktivAge < Integer.parseInt(userAge)) {
            System.out.println("Du är äldre än mig");
        } else {
            System.out.println("Vi är lika gamla");
        }

        if(userEmail.equalsIgnoreCase(userEmail2)) {
            System.out.println("Eposten stämmer");
        } else {
            System.out.println("Du har angett olika epost-adresser");
        }
    }
}