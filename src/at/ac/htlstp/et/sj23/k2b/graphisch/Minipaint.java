package at.ac.htlstp.et.sj23.k2b.graphisch;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Minipaint extends MyFrameMT {

    private Vector<paintable> objects = new Vector<paintable>();

    public static void main(String[] args) {
        new Minipaint();

    }

    public Minipaint() {
        super("Minipaint",800,600);

        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        for (paintable o : objects) {
            o.paint(g);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {


    }



}
