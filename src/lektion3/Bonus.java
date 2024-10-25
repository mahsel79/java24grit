package lektion3;

public class Bonus {

     public static void main(String[] args) {
          loopVartannatTal();
          taEmotText("Hej");
          text10("Tjena");
          recursive(10);
          printChar("Tjena hallå");
     }

     private static void printMyText(String text) {
          System.out.println(text);
     }

     private static void loopVartannatTal() {
          int nummer = 10;

          for(int i = 0; i < nummer; i++) {
               if(i % 2 == 1) {
                    printMyText(String.valueOf(i));
               }
          }
     }

     private static void taEmotText(String text) {
          printMyText(text);
     }

     private static void text10(String text) {
          for(int i = 0; i < 10; i++) {
               printMyText(text);
          }
     }

     private static void recursive(int tal) {
          if(tal >= 0) {
               printMyText(String.valueOf(tal));
               recursive(tal-1);
          }
     }

     private static void printChar(String text) {
          for(int i = 0; i < text.length(); i++) {
               printMyText(String.valueOf(text.charAt(i)));
          }
     }



}
