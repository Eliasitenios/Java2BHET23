package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import javax.swing.*;
import java.awt.*;

public class LegendDialog extends JDialog {

    public LegendDialog(Frame owner) {
        super(owner, "Legende", true);
        setSize(300, 200);
        setLocationRelativeTo(owner);

        JPanel legendPanel = new JPanel();
        legendPanel.setLayout(new BoxLayout(legendPanel, BoxLayout.Y_AXIS));
        legendPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        legendPanel.add(createLegendLabel("C - Randfarbe ändern"));
        legendPanel.add(createLegendLabel("F - Füllfarbe ändern"));
        legendPanel.add(createLegendLabel("L - Linie zeichnen"));
        legendPanel.add(createLegendLabel("R - Rechteck zeichnen"));
        legendPanel.add(createLegendLabel("O - Oval zeichnen"));
        legendPanel.add(createLegendLabel("H - Legende anzeigen"));

        JScrollPane scrollPane = new JScrollPane(legendPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        add(scrollPane, BorderLayout.CENTER);
    }

    private JLabel createLegendLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        return label;
    }
}
