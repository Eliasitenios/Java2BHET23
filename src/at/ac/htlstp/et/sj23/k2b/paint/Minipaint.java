package at.ac.htlstp.et.sj23.k2b.paint;


import at.ac.htlstp.et.sj23.k2b.graphisch.MyFrameMT;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Minipaint extends MyFrameMT {

    private Vector<paintable> objects = new Vector<paintable>();
    private PaintMode mode = PaintMode.LINIE;
    private paintable selected = null;

    public static void main(String[] args) {
        new Minipaint();

    }

    public Minipaint() {
        super("Minipaint",800,600);
        objects.add(new Linie(new Point(100, 100), new Point(200, 200), Color.blue, null, 1));
        objects.add(new Rechteck(new Point(200, 100), new Point(500, 200), Color.red, Color.green, 1));
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
        switch (mode) {
            case LINIE -> {
            }
            case RECHTECK -> {
            }
            case OVAL -> {
            }
            case CREATE -> {
            }
        }
    }
}
