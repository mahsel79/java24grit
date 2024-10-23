package lektion2;

public class Uppgift {

    public static void main(String[] args) {

        int myVar1 = 99;
        float myVar2 = 3.14f;
        char myVar3 = 'A';
        boolean myVar4 = true;
        String myVar5 = "Hello, World!";

        double y = 1 / 3;
        System.out.println("1 / 3 = " + y);
        double z = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.print("10 * 0.1 = " + z);

        String string1 = "2.23"; // till float
        String string2 = "false"; // till boolean
        String string3 = "1337"; // till integer

        float float1 = Float.parseFloat(string1);
        boolean bool1 = Boolean.parseBoolean(string2);
        int int1 = Integer.parseInt(string3);

        int myVarInt = 3;
        int myVarInt2 = 2;

        if( myVarInt > myVarInt2) {
            System.out.println("\nHeja java");
        }

        if(y > 0.0) {
            System.out.println("Vad konstigt");
        } else {
            System.out.println("Vilken tur");
        }

        if(z == 1.0) {
            System.out.println("Vad nu då?");
        }
    }
}
