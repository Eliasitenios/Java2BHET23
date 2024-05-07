package at.ac.htlstp.et.sj23.k2b.projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class HausaufgabenFenster {
    HausaufgabenFenster() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Hausaufgaben");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon customIcon = new ImageIcon("C:\\Users\\elias\\Documents\\LETTO_Logo2.png");
        frame.setIconImage(customIcon.getImage());

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        JTextArea aufgabenTextArea = new JTextArea(20, 50);
        aufgabenTextArea.setEditable(false);
        aufgabenTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        aufgabenTextArea.setForeground(Color.BLACK);

        aufgabenTextArea.append("Hausaufgaben:\n");
        aufgabenTextArea.append("1. AM : 1. Hausübung \n");
        aufgabenTextArea.append("-----------------------------------------------\n");
        aufgabenTextArea.append("2. AT1 : 23. Hausübung \n");
        aufgabenTextArea.append("-----------------------------------------------\n");
        aufgabenTextArea.append("3. AT1 : 24. Hausübung \n");
        aufgabenTextArea.append("-----------------------------------------------\n");
        aufgabenTextArea.append("4. AT1 : 25. Hausübung \n");

        JScrollPane scrollPane = new JScrollPane(aufgabenTextArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);

        ImageIcon loginIcon = new ImageIcon("C:\\Users\\elias\\Documents\\LETTO_Logo.png");
        Image scaledLoginIcon = loginIcon.getImage().getScaledInstance(64, 37, Image.SCALE_SMOOTH);
        frame.setIconImage(scaledLoginIcon);

        frame.setVisible(true);
    }
}
