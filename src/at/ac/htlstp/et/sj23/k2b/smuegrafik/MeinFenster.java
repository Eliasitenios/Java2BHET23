package at.ac.htlstp.et.sj23.k2b.smuegrafik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MeinFenster {
    private static int loginAttempts = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
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
                openHausaufgabenFenster();
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

        // Erstelle das JLabel für das Logo mit Rand
        JLabel logoLabel = new JLabel();
        logoLabel.setIcon(logoIcon);
        logoLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 0, 0)); // Füge Rand hinzu


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

        textPanel.add(infoLabel, BorderLayout.CENTER);

        JPanel infoPanel = new JPanel(new BorderLayout());
        infoPanel.setBackground(Color.WHITE);
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        infoPanel.add(textPanel, BorderLayout.CENTER);

        topPanel.add(infoPanel, BorderLayout.CENTER);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(loginPanel, BorderLayout.CENTER);

        // Erstelle ein JLabel für das aktuelle Datum und die Uhrzeit
        JLabel dateTimeLabel = new JLabel();
        dateTimeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        dateTimeLabel.setForeground(Color.BLACK);
        mainPanel.add(dateTimeLabel, BorderLayout.SOUTH);

        // Aktualisiere das aktuelle Datum und die Uhrzeit alle Sekunde
        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            dateTimeLabel.setText(dateFormat.format(new Date()));
        });
        timer.start();

        frame.add(mainPanel);
        frame.pack();
        frame.setSize(900, 550); // Setzen Sie die Breite auf 800 Pixel und die Höhe auf 600 Pixel
        frame.setLocationRelativeTo(null); // Zentrieren Sie das Fenster auf dem Bildschirm
        frame.setVisible(true); // Machen Sie das Fenster sichtbar

        frame.setLocationRelativeTo(null);

        // Benutzerdefiniertes Fensterlogo setzen
        ImageIcon loginIcon = new ImageIcon("C:\\Users\\elias\\Documents\\LETTO_Logo.png");
        Image scaledLoginIcon = loginIcon.getImage().getScaledInstance(64, 37, Image.SCALE_SMOOTH); // Hier 64x64 Pixel
        frame.setIconImage(scaledLoginIcon);

        frame.setVisible(true);
    }

    // Hausaufgaben Fenster
    private static void openHausaufgabenFenster() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame hausafgabenFrame = new JFrame("Hausaufgaben");
        hausafgabenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Benutzerdefiniertes Fensterlogo setzen
        ImageIcon customIcon = new ImageIcon("C:\\Users\\elias\\Documents\\LETTO_Logo2.png");
        hausafgabenFrame.setIconImage(customIcon.getImage());

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // JPanel für die Hausaufgaben erstellen
        JPanel aufgabenPanel = new JPanel();
        aufgabenPanel.setLayout(new BoxLayout(aufgabenPanel, BoxLayout.Y_AXIS));
        aufgabenPanel.setBackground(Color.WHITE);

        // HashMap für die Hausaufgaben mit ihren Beispielen und Fortschritten
        Map<String, Map<String, Integer>> hausaufgaben = new HashMap<>();
        Map<String, Integer> mathBeispiele = new HashMap<>();
        mathBeispiele.put("Hausaufgabe 1", 30);
        mathBeispiele.put("Hausaufgabe 2", 50);
        hausaufgaben.put("Mathematik", mathBeispiele);

        Map<String, Integer> englischBeispiele = new HashMap<>();
        englischBeispiele.put("Hausaufgabe 3", 50);
        englischBeispiele.put("Hausaufgabe 4", 70);
        hausaufgaben.put("Englisch", englischBeispiele);

        for (String fach : hausaufgaben.keySet()) {
            addHausaufgabe(aufgabenPanel, fach, hausaufgaben.get(fach));
        }

        JScrollPane scrollPane = new JScrollPane(aufgabenPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        hausafgabenFrame.add(mainPanel);
        hausafgabenFrame.pack();
        hausafgabenFrame.setLocationRelativeTo(null);

        // Benutzerdefiniertes Fensterlogo setzen und die Größe anpassen
        ImageIcon loginIcon = new ImageIcon("C:\\Users\\elias\\Documents\\LETTO_Logo.png");
        Image scaledLoginIcon = loginIcon.getImage().getScaledInstance(64, 37, Image.SCALE_SMOOTH);
        hausafgabenFrame.setIconImage(scaledLoginIcon);

        hausafgabenFrame.setVisible(true);
    }

    // Methode zum Hinzufügen einer Hausaufgabe zum Panel
    private static void addHausaufgabe(JPanel panel, String fach, Map<String, Integer> beispiele) {
        JPanel fachPanel = new JPanel(new BorderLayout());
        fachPanel.setBackground(new Color(240, 240, 240)); // Hintergrundfarbe ändern

        JLabel fachLabel = new JLabel(fach);
        fachLabel.setFont(new Font("Arial", Font.BOLD, 14));
        fachLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        fachPanel.add(fachLabel, BorderLayout.NORTH);

        JPanel aufgabenPanel = new JPanel();
        aufgabenPanel.setLayout(new BoxLayout(aufgabenPanel, BoxLayout.Y_AXIS));
        aufgabenPanel.setBackground(Color.WHITE);

        for (String aufgabe : beispiele.keySet()) {
            addEinzelAufgabe(aufgabenPanel, aufgabe, beispiele.get(aufgabe));
        }

        fachPanel.add(aufgabenPanel, BorderLayout.CENTER);

        panel.add(fachPanel);
    }

    // Methode zum Hinzufügen einer einzelnen Hausaufgabe zum Panel
    private static void addEinzelAufgabe(JPanel panel, String aufgabe, int fortschritt) {
        JPanel aufgabePanel = new JPanel(new BorderLayout());
        aufgabePanel.setBackground(Color.WHITE);

        JLabel aufgabeLabel = new JLabel(aufgabe);
        aufgabePanel.add(aufgabeLabel, BorderLayout.CENTER);

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(fortschritt);
        progressBar.setStringPainted(true);
        aufgabePanel.add(progressBar, BorderLayout.SOUTH);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> showAufgabeVorschau(aufgabe)); // Hier wird die Vorschau aufgerufen
        aufgabePanel.add(startButton, BorderLayout.EAST);

        panel.add(aufgabePanel);
    }

    // Methode zum Anzeigen der Vorschau der ausgewählten Hausaufgabe
    private static void showAufgabeVorschau(String aufgabe) {
        JFrame vorschauFrame = new JFrame("Hausaufgabe: " + aufgabe);
        vorschauFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea vorschauTextArea = new JTextArea("Hier steht die Vorschau für die Hausaufgabe: " + aufgabe);
        vorschauTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(vorschauTextArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        vorschauFrame.add(scrollPane);
        vorschauFrame.pack();
        vorschauFrame.setLocationRelativeTo(null);
        vorschauFrame.setVisible(true);
    }
}
