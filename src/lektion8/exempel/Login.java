package lektion8.exempel;

import javax.swing.*;
import java.awt.*;


/*
    Detta är INTE på något sätt ett facit. Detta är ett exempel på hur det går att lösa inloggnings-uppgiften.
    Exemplet är dock enbart grafiskt.

    De olika lauouterna har sina styrkor och uppgiften kan säkert lösas med mindre kod och med andra layouter.

    Mitt sätt att tänka:
    - En JFrame - root - huvudfönster
    - En JPanel för att omsluta själva formuläret
    - En JPanel för "avsnitt"/"sektion" i formuläret - e.g. username (input samt label)
    - Varje JPanel för "sektion" har en layout med 2 rader, en rad för label och en för input
    - Den JPanel som omsluter formuläret skall ha 3 rader; en rad för username, en för password och en för knappen.
    - Ett hack, fult/snyggt - upp till den som läser - är att använda


    En layout som kanske är helt perfekt för denna uppgift - är layouten SpringLayout. Denna layout kan vara den mest
    dynamiska men därmed också den mest komplexa.
 */
public class Login {

    public static void main(String[] args) {

        //Skapar mitt fönster - rooten
        JFrame root = new JFrame("Login");

        //Skapar JPanel för hela formuläret
        JPanel loginForm = new JPanel();

        //Skapar en JPanel för varje rad jag avser lägga i formuläret
        JPanel userNamePanel = new JPanel();
        JPanel passwordPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        // Skapar input för username
        JTextField usernameField = new JTextField();

        // Skapar input för password
        JPasswordField passwordField = new JPasswordField();

        // Skapar input för knapp för login
        JButton loginButton = new JButton("Login");

        //En layout för den JPanel som skall innehålla de andra. Vi skall placera in username, password och button. Därav 3 rader, 1 kolumn
        GridLayout panelGridLayout = new GridLayout(3, 1, 0, 0);

        //Layout för varje rad i den JPanel som omsluter label och input. En rad för labeln och en för inputfältet
        GridLayout rowGridLayout = new GridLayout(2, 1, 0, 0);

        //Label för username
        JLabel username = new JLabel("Username");
        //Label för password
        JLabel password = new JLabel("Password");

        //Sätter layout på userNamePanel
        userNamePanel.setLayout(rowGridLayout);

        //Lägger till username-label
        userNamePanel.add(username);

        //Lägger till inputen för username
        userNamePanel.add(usernameField);

        //För att få rätt på placering, använder jag border för att skapa "rätt" spacing mellan grejerna
        userNamePanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        //Sätter layout för passwordPanel
        passwordPanel.setLayout(rowGridLayout);

        //Lägger till password-label
        passwordPanel.add(password);

        //Lägger till inputen för password
        passwordPanel.add(passwordField);

        //För att få rätt på placering, använder jag border för att skapa "rätt" spacing mellan grejerna
        passwordPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        //För panelen där knappen skall ligga, använder jag en BorderLayout
        buttonPanel.setLayout(new BorderLayout());

        //Lägger till knappen i panelen
        buttonPanel.add(loginButton);

        //Samma princip för att få "rätt" spacing
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        //Sätter layouten för den panel som skall innehålla allt det vi precis skapade; user, password och button
        loginForm.setLayout(panelGridLayout);

        //Jag sätter vit bakgrund för att särskilja layouterna
        loginForm.setBackground(Color.WHITE);

        //Lägger till innehållet som skall visas
        loginForm.add(userNamePanel);
        loginForm.add(passwordPanel);
        loginForm.add(buttonPanel);

        //Sätter storleken på loginForm-pane
        loginForm.setSize(new Dimension(200, 100));

        //Samma lösning för att skapa space-ing
        loginForm.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        //Lägger till allt i fönstret - rooten
        root.add(loginForm);

        //Sätter prefferedSize på fönstret
        root.setPreferredSize(new Dimension(600, 500));

        //Fönstret skall synas
        root.setVisible(true);

        // Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.
        root.pack();

        //Makes the Window visible. If the Window and/ or its owner are not yet displayable, both are made displayable. The Window will be validated prior to being made visible.
        root.show();
    }
}
