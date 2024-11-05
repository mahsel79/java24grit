package lektion7.components;

import javax.swing.*;

public class Section extends JPanel {

    JButton button;
    JTextField textField;

    public Section(String name) {
        button = new JButton(name);
        textField = new JTextField(15);

        this.add(button);
        this.add(textField);
    }
}
