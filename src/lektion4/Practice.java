package lektion4;

import java.util.LinkedList;

public class Practice {


    /*
        Använd en hashmap för att skapa en telefonbok

        Genom att fråga användaren efter namn och telefonnummer, lagrar du i mapen
        Mappen skall innehålla 5 namn och telefonnummer

        Försök att skriva ut mappen som en tabell i consolen

        | namn | nummer           |
        __________________________
        |Robin | 070 000 00 00    |
        __________________________

        Använd entrySet för att skriva ut.

        ---------------------------------------------------------------------------

        Skapa en array med 100 rader

        Tilldela INGET värde för någon av raderna

        Skapa en metod som INTE returnerar något, men som tar emot en String[].
        Skriv ut arrayens värde i consolen

        | index | värde |
        _________________
        |   0   |       |
        _________________
        |   1   |       |
        _________________
        |   2   |      |



     */



    public static void main(String[] args ){
        LinkedList<Float> list = new LinkedList<>();
        list.add(23f);
        list.add(232111f);
        list.add(233f);
        list.add(2321f);
        list.add(232f);

        for(float num : list){
            System.out.println(num);
        }
    }
}
