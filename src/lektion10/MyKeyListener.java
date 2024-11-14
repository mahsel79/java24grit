package lektion10;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 *  Exempel på tangentbordslyssnare för miniräknaren.
 */
public class MyKeyListener {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tangentskrivare");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Skapa en JTextArea för att visa resultatet
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // Gör textområdet icke-redigerbart
        frame.add(textArea);

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                char keyChar = e.getKeyChar();
                if (keyCode >= KeyEvent.VK_1 && keyCode <= KeyEvent.VK_9) {
                    System.out.println("Du tryckte på tangenten: " + e.getKeyChar());
                } else if (keyChar == '+' || keyChar == '-' || keyChar == '*' || keyChar == '/' || keyChar == '=') {
                    System.out.println("Wiiiii " + keyChar);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        frame.pack();
        frame.setVisible(true);
        textArea.requestFocus();

    }
}
