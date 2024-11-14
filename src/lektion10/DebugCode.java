package lektion10;

public class DebugCode {

    public static void main(String[] args) {
        int result = addNumbers(5, 7);
        System.out.println("Result: " + result);
        String message = generateMessage("debugging");
        System.out.println("Message: " + message);
    }

    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static String generateMessage(String action) {
        String message = "We are " + action + " this program!";
        return message;

    }

}
