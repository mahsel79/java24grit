package lektion7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lyssnare {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lyssnare");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Denna vill vi ofta ha default. Den stäger mer eller mindre
                                                                // att programmet skall stängas när vi stänger fönstret
        frame.setSize(new Dimension(500, 500));

        JButton button = new JButton("Hej hej hallå");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Knappen blev tryckt på");
                JFrame frame1 = new JFrame("POPUP");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(new Dimension(500, 500));
                frame1.setVisible(true);
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
