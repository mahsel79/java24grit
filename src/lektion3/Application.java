package lektion3;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Loopar loop = new Loopar();
        loop.testForLoop();
        loop.testWhileLoop();
        Loopar.printName();
        printName();
    }

    private static int magicNumber() {
        Random rnd = new Random();
        return rnd.nextInt(100)+1;
    }
    private static void printName() {
        System.out.println(sayHello("Ar", magicNumber()));
    }

    private static String sayHello(String name, int number) {
        return "Hello " + name +" " + number;
    }
}
