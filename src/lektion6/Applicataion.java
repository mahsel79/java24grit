package lektion6;

import lektion6.djur.Hund;
import lektion6.djur.Katt;
import lektion6.fordon.Bil;
import lektion6.fordon.Flygplan;

public class Applicataion {

    public static void main(String[] args) {
        Katt katt = new Katt("Kisse", 23, 45);
        katt.eat();
        katt.sleep();
        System.out.println("Antal svansar " + katt.getAntalSvansar());

        Hund hund = new Hund("Hund", 1, 21);
        hund.eat();
        hund.sleep();
        System.out.println(hund.getAntalTassar());

        Bil bilen = new Bil("ABC123");
        Flygplan flygplan = new Flygplan("123ABC", "SAS");

        bilen.drive();
        System.out.println(bilen.getRegNummer());

        flygplan.drive();
        System.out.println(flygplan.getRegNummer());
    }
}
