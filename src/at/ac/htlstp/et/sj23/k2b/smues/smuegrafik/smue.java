package at.ac.htlstp.et.sj23.k2b.smues.smuegrafik;

import at.ac.htlstp.et.sj23.k2b.graphisch.MyFrameMT;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;


public class smue extends MyFrameMT {

    private Point centerpoint;
    private Point tempPoint;
    private int size; // size of the rectangle
    private CONTROLMODE controlmode;
    private boolean fillRect;

    public smue() {
        super("Rechteck", 800, 600);
        centerpoint = new Point(0,0);
        tempPoint = new Point(0,0);
        size = 0;
        controlmode = CONTROLMODE.NEW;
        fillRect = false;
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new smue();
    }

    @Override
    public void paint(Graphics g) {
        int x = this.getWidth();
        int y = this.getHeight();

        g.setColor(Color.BLACK);
        g.drawLine(tempPoint.x, 0, tempPoint.x, y);
        g.drawLine(0, tempPoint.y, x, tempPoint.y);

        if(fillRect) {
            g.fillRect(centerpoint.x - size/2, centerpoint.y - size/2, size, size);
        }
        else {
            g.drawRect(centerpoint.x - size/2, centerpoint.y - size/2, size, size);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == 'F') {fillRect = !fillRect;}
        if(e.getKeyChar() == 'f') {fillRect = !fillRect;}
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1) {
            size = 50;
            controlmode = CONTROLMODE.DRAW;
            centerpoint = e.getPoint();
            repaint();
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        controlmode = CONTROLMODE.DRAW;
        size += (int) e.getPreciseWheelRotation() * 5;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        tempPoint = e.getPoint();
        repaint();
    }

}