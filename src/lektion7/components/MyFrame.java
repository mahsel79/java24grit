package lektion7.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Denna klass, MyFrame, ärver i från JFrame. Den kommer således få ALLA funktioner och egenskaper som om vi skrivet
    JFrame frame = JFrame(). När vi ärver - extends - på detta sätt, använder vi this för att nå dess setter och getters
    likt setTitle och setSize nedan.
 */
public class MyFrame extends JFrame {

    //Constructor
    public MyFrame(String nameOfFrame, int width, int height) {
        this.setTitle(nameOfFrame); //Sätter titel i fönstret
        this.setSize(width, height); //sätter storleken på fönster
        this.setLayout(new FlowLayout()); //sätter specifik layout
        JPanel panel = new JPanel(); //Instansierar en JPanel
        panel.setBackground(Color.WHITE); //sätter JPanel bakgrund till vit
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); //sätter en ram runt JPanel med svart färg

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.WHITE);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        MyButton button = new MyButton("Robin");
        button.addActionListener(new ActionListener() {
            /*
                Detta är en anonym klass.
                Anonyma klasser kommer ni komma i kontakt med mycket framöver. Egentligen så behöver vi inte lägga så
                stor vikt vid den anonyma klassen i detta fall. Dock är det av vikt att du känner till konceptet och hur
                det kan användas. För just vår lyssnare så är det ganska straight forward, vi är bara ute efter metoden
                actionPerformed för att kunna ge instruktioner om vad som skall hända när någon i detta fall klickar på knappen
             */

            String var = "Variabel i anonym klass"; //Helt meningslös i sammanhanget. Mest ett bevis på att vi kan skapa egna
                                                    // egenskaper i den anonyma klassen och använda i dess metod.

            //Vi använder denna metod för att bestämma vad som skall hända när knappen trycks på. I detta fall kommer den skriva ut text
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Anonym class");
                System.out.println(var);
            }
        });

        panel2.add(button); //.add() anvämnds för att lägga till knappen i panel2

        JTextArea textArea = new JTextArea(0,3);    // Med JTextArea anger vi antalet rader och kolumner. Detta påverkar hur texten
                                                                 // senare kommer att se ut.
        this.add(panel);
        this.add(panel2);
        this.setVisible(true);
        this.pack();
        this.show();

    }


    private void addLabelsToPanel(JPanel panel, String[] labelTexts) {
        for (String labelText : labelTexts) {
            panel.add(new JLabel(labelText));
        }
    }
}
