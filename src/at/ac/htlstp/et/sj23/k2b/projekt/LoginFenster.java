package at.ac.htlstp.et.sj23.k2b.projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class LoginFenster {
    private static int loginAttempts = 0;

    LoginFenster() {
        JFrame frame = new JFrame("LETTO - Lernsoftware | Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel usernameLabel = new JLabel("Benutzername:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Passwort:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());
            if (username.equals("elias.wurzer") && password.equals("12345")) {
                new HausaufgabenFenster();
                JOptionPane.showMessageDialog(frame, "Erfolgreich eingeloggt als Benutzer: " + username, "Erfolgreich", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose();
            } else {
                loginAttempts++;
                if (loginAttempts == 3) {
                    JOptionPane.showMessageDialog(frame, "Drei fehlgeschlagene Login-Versuche. Programm wird geschlossen.", "Fehler", JOptionPane.ERROR_MESSAGE);
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Benutzername oder Passwort falsch! Noch " + (3 - loginAttempts) + " Versuche übrig.", "Fehler", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginPanel.add(usernameLabel, gbc);
        gbc.gridy++;
        loginPanel.add(usernameField, gbc);
        gbc.gridy++;
        loginPanel.add(passwordLabel, gbc);
        gbc.gridy++;
        loginPanel.add(passwordField, gbc);
        gbc.gridy++;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(loginButton, gbc);

        ImageIcon logoIcon = new ImageIcon("C:\\Users\\elias\\Documents\\lettobild.png");
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(logoIcon);
        logoLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 0, 0));

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.WHITE);
        topPanel.add(logoLabel, BorderLayout.WEST);

        JLabel welcomeLabel = new JLabel("Willkommen beim LeTTo-Server");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setForeground(Color.BLACK);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBackground(Color.WHITE);
        textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        textPanel.add(welcomeLabel, BorderLayout.NORTH);

        JLabel infoLabel = new JLabel("<html>Nähere Informationen zum LeTTo-Projekt finden Sie auf <a href=\"https://wiki.letto.at/wiki/index.php/Hauptseite\">unserer Homepage</a>.<br><br>Das Hilfesystem ist als Wiki aufgebaut und unter <a href=\"https://wiki.letto.at/wiki/index.php/Hauptseite\">Hilfe-Wiki</a> zu finden.</html>");
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        infoLabel.setForeground(Color.BLACK);
        infoLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        infoLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://wiki.letto.at/wiki/index.php/Hauptseite"));
                    } catch (IOException | URISyntaxException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        topPanel.add(textPanel, BorderLayout.CENTER);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(loginPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);

        ImageIcon loginIcon = new ImageIcon("C:\\Users\\elias\\Documents\\LETTO_Logo.png");
        Image scaledLoginIcon = loginIcon.getImage().getScaledInstance(64, 37, Image.SCALE_SMOOTH);
        frame.setIconImage(scaledLoginIcon);

        frame.setVisible(true);
    }
}
