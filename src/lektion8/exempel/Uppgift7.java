package lektion8.exempel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Uppgift7 {
    JFrame frame = new JFrame();

    JButton button = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");

    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();

    public Uppgift7() {
        JPanel panel = new JPanel();
        JPanel buttonPanel1 = new JPanel();
        JPanel buttonPanel2 = new JPanel();
        JPanel buttonPanel3 = new JPanel();

        frame.setSize(new Dimension(500, 500));

        /*
            I tidigare uppgift, Uppgift6, implementerade vi ActionListener i klassen.
            Nedan följer istället alternativet att sätta en ActionListener på varje knapp.
            Det här kan vara en fördel då vi kan bestämma beteende direkt för den specifika klassen.
            En annan fördel KAN vara att vissa uppfattar att det är lättare att läsa och hänga med i koden.
         */
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter1++;
                label1.setText("Btn 1 Counter: " + counter1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter2++;
                label2.setText("Btn 2 Counter: " + counter2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter3++;
                label3.setText("Btn 3 Counter: " + counter3);
            }
        });
        buttonPanel1.add(button);
        buttonPanel1.add(label1);
        buttonPanel2.add(button2);
        buttonPanel2.add(label2);
        buttonPanel3.add(button3);
        buttonPanel3.add(label3);
        panel.add(buttonPanel1);
        panel.add(buttonPanel2);
        panel.add(buttonPanel3);
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();
    }


    public static void main(String[] args) {
        new Uppgift7();
    }

/*

    OM vi hade implementerat ActionListener i klassen - hade vi behövt att kontrollera vilken knapp det trycks på.

        public class Uppgift7 implements ActionListener

    Anledningen till att vi inte behövde det i den andra uppgiften är främst p.g.a att beteendet kan anses mer generellt.
    I detta exempel, så vill vi trigga olika counters och utskrifter. Därav behöver vi först ta reda på vilken knapp
    som tryckts på, för att avgöra beteendet. I detta fall har vi tillgång till knapparna som objekt. Därav blir vår
    kontroll ganska enkelt. Vi behöver helt enkelt bara kolla om e.getSource är lika med exempelvis button (objektet).
    Om så är fallet - gör vi vår grej.


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            counter1++;
            label1.setText("Btn 1 Counter: " + counter1);

        }else if(e.getSource() == button2) {
            counter2++;
            label2.setText("Btn 2 Counter: " + counter2);

        } else if (e.getSource() == button3) {
            counter3++;
            label3.setText("Btn 3 Counter: " + counter3);

        } else {
            System.out.println("Do nothing");
        }
    }*/
}


















