package at.ac.htlstp.et.sj23.k2b.graphisch;

import java.awt.*;

public class Fenster3 extends MyFrame {


    public static void main(String[] args) {
        new Fenster3("Fenster3",1000,800);
    }

    public Fenster3(String title, int width, int height) {
        super(title, width, height);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(300,300,100,100);
    }
}
