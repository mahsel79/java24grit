package lektion3;

public class Application {

    public static void main(String[] args) {

        for(int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n===================\n");

        int number = 1; //0;
        while(number < 11) { //10) {
            //++number;
            System.out.print(number + " ");
            number++;
        }

        System.out.println("\n===================\n");
        int num = 1; //1;

        do {
            System.out.print(num + " ");
            num++;
        } while (num < 11);
    }
}
