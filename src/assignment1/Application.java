package assignment1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //CirkelOmkrets();
        //CirkelArea();
        //VolymKlot();
        //VolymCylinder();
    }

    private static void CirkelOmkrets() {
        final double PI = 3.14; //Math.PI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange radien på cirkeln: ");
        double radie = scanner.nextDouble();
        double omkrets = 2 * PI * radie;
        System.out.printf("Omkretsen av cirkeln med radie %.2f är %.2f%n", radie, omkrets);
        scanner.close();
    }

    private static void CirkelArea() {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange radien på cirkeln: ");
        double radie = scanner.nextDouble();
        double omkrets = 2 * PI * radie;
        double area = PI * radie * radie;
        System.out.println("Omkretsen av cirkeln är: " + omkrets);
        System.out.println("Arean av cirkeln är: " + area);
    }

    private static void VolymKlot() {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange radien på cirkeln: ");
        double radie = scanner.nextDouble();
        double omkrets = 2 * PI * radie;
        double area = PI * radie * radie;
        System.out.println("Omkretsen av cirkeln är: " + omkrets);
        System.out.println("Arean av cirkeln är: " + area);
    }

    private static void VolymCylinder() {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        double radie = scanner.nextDouble();
        double omkrets = 2 * PI * radie;
        double area = PI * radie * radie;
        double volymKlot = (4.0 / 3.0) * PI * Math.pow(radie, 3);
        System.out.println("Omkretsen av cirkeln är: " + omkrets);
        System.out.println("Arean av cirkeln är: " + area);
        System.out.println("Volymen av klotet är: " + volymKlot);
        System.out.print("Vill du beräkna volymen av en cylinder? (ja/nej): ");
        String svar = scanner.nextLine();

        if (svar.equalsIgnoreCase("ja")) {
            System.out.print("Ange höjden på cylindern: ");
            double hojd = scanner.nextDouble();
            double volymCylinder = area * hojd;
            System.out.println("Volymen av cylindern är: " + volymCylinder);
        } else {
            System.out.println("Inga fler beräkningar görs.");
        }
        scanner.close();
    }
}
