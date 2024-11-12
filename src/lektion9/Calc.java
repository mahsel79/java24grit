package lektion9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {

    public static void main(String[] args) {
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        JFrame frame = new JFrame();
        frame.setTitle("Calc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));

        JPanel result = new JPanel();
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setFont(new Font("Arial", Font.PLAIN, 30));
        textField.setPreferredSize(new Dimension(570, 100));
        result.add(textField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(450, 400));
        buttonPanel.setLayout(new GridLayout(4, 4));
        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.setLayout(new BorderLayout());

        frame.add(result, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        for (String buttonText : buttons) {
            JButton button = new JButton(buttonText);
            button.setFont(new Font("Arial", Font.PLAIN, 27));
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    try {


                        if (e.getActionCommand().equalsIgnoreCase("+")) {

                        } else if (e.getActionCommand().equalsIgnoreCase("-")) {

                        } else if (e.getActionCommand().equalsIgnoreCase("/")) {

                        } else if (e.getActionCommand().equalsIgnoreCase("*")) {

                        } else if (e.getActionCommand().equalsIgnoreCase("=")) {

                            System.out.println(textField.getText());
                        } else {

                            textField.setText(textField.getText() + " " + button.getText());
                        }
                    }catch (NumberFormatException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            });
            buttonPanel.add(button);
        }
        //addNumberButtons(buttonPanel);

        frame.setVisible(true);
        frame.pack();
    }
}
