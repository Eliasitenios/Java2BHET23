package at.ac.htlstp.et.sj23.k2b.projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Projekt1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFenster::new);
    }
}
