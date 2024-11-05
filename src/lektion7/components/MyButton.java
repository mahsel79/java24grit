package lektion7.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener {

    private final String name;

    // Constructor som tar emot en sträng, name
    public MyButton(String name) {
        this.setText(name); //vi använder name från constructorns parameter för att sätta text på knappen
        this.addActionListener(this); // efter som att vi har implements ActionListener, säger vi this
        this.name = name; // vi sparar undan name i en variabel för att kunna använda det senare

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*
            Genom att använda e, så kan vi hämta source. I detta fall så vet vi om att det är en knapp. För att nå
            knappens egenskaper, kan vi därmed "casta" e.getSource till en JButton enligt nedan. När vi gjort det så
            kan vi via eventet hämta ut exempelvis knappens text.
            Dock är det inte alltid vi kanske känner till vad som använder lyssnaren och detta försvårar såklart möjligheten
            till att "casta".
         */
        System.out.println(((JButton)e.getSource()).getText());
        System.out.println("My " + name + "-button clicked");
    }
}
