package lektion4;

import java.util.LinkedList;

public class Linked {

    /*
    Snabb insättning och borttagning

    Effektivitet: Insättning och borttagning av element i en LinkedList är generellt snabbare än i en ArrayList,
    särskilt när man arbetar i början eller mitten av listan. Detta beror på att man bara behöver justera några pekare,
    medan en ArrayList kan behöva flytta runt element.
     */
    public static void main(String[] args) {
        LinkedList<String> myStrings = new LinkedList<String>();
        myStrings.add("Min Sträng");
        myStrings.add("Min Sträng");

        System.out.println(myStrings);
    }

}
