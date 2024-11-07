package lektion8.exempel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Detta är ett lösningsförslag på uppgift 6 bland övningsuppgifterna

    I detta exempel så väljer vi att implementera interface-et ActionListener.
    Detta gör att vi måste implementera och göra en @Override på interface-ets actionPerformed.
    Genom att göra på detta sätt, kan vi hänvisa till den egna klassen när vi sätter actionListener
    via addActionListener. Detta gör vi genom att peka på this
 */
public class Uppgift6 implements ActionListener {

    // Skapar fönster
    JFrame frame = new JFrame();
    // Skapar tre knappar och anger texten som skall stå på knapparna via JButtons constructor
    JButton button = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");

    // Vi skapar en constructor, som kickar i gång fönstret och dess innehåll samt funktion, när klassen instansieras som objekt
    public Uppgift6() {
        //Skapar en JPanel som vi senare placerar innehåll i
        JPanel panel = new JPanel();
        //Sätter storleken på fönster
        frame.setSize(new Dimension(500, 500));
        //Varje knapp får en ActionListener. I detta fall får alla samma - vilket är denna klass
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        // Lägger till varje knapp till panelen
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        //Lägger till panelen i fönstret
        frame.add(panel);

        //Fönstret skall synas
        frame.setVisible(true);

        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        frame.pack();

        //Makes the Window visible. If the Window and/ or its owner are not yet displayable, both are made displayable. The Window will be validated prior to being made visible.
        frame.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
            Det finns flera sätt att skriva ut namnet på knappen.
            Det enklaste är troligen att använda e.getActionCommand()
         */

        System.out.println(e.getActionCommand() + " clicked");

        /*
            Ett annat sätt är att använda source. Detta gör vi genom att kalla på ActionEvents getter - getSource.
            Tillbaka får vi ett generellt objekt. För att komma åt JButtons funktionalitet, exempelvis getText(), behöver vi casta
            objektet till en JButton. För att casta ett objekt så skriver vi ((JButton)e.getSource()).getText().
            Om vi istället hade haft en lyssnare på exempelvis JTextField, hade vi behövt skriva ((JTextField)e.getSource()).getText()
         */

        System.out.println(((JButton)e.getSource()).getText());

    }

    public static void main(String[] args) {
        new Uppgift6();
    }
}
