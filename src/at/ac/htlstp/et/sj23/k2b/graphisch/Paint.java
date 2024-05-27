package at.ac.htlstp.et.sj23.k2b.graphisch;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class Paint  extends MyFrameMT {

    private Point m;
    private int r;
    private Color c;

    private MANIPULATIONSMODE mode;
    /** alter Mauscursor bei Move und Resize */
    private Point oldMc;

    public static void main(String[] args) {
        new Paint();
    }

    public Paint() {
        super("Paint", 800, 600);
        m=new Point(300, 300);
        r = 100;
        c = Color.black;
        mode= MANIPULATIONSMODE.NORMAL;
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(c);
        g.drawOval(m.x-r, m.y-r, 2*r, 2*r);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'r' :
            case 'R' : c = Color.red; break;
            case 'g' :
            case 'G' : c = Color.green; break;
            case 'b' :
            case 'B' : c = Color.blue; break;
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            // Entscheide ob der Cursor innerhalb des Kreises liegt,
            Point mc = e.getPoint();
            double ca = mc.distance(m);
            double d = ca-r;
            if (d<-2) {
                //innerhalb des Kreises
                mode=MANIPULATIONSMODE.MOVE;
                oldMc = mc;
            } else if (d>2) {
                // außerhalb des Kreises
                m=e.getPoint();
            } else {
                // auf dem Kreis
                mode= MANIPULATIONSMODE.RESIZE;
            }
            repaint();
        }
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        r += e.getWheelRotation()*2;
        if (r < 0) r = 0;
        if (r > 500) r = 500;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mode= MANIPULATIONSMODE.NORMAL;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        switch(mode) {
            case RESIZE:
                r = (int)e.getPoint().distance(m);
                repaint();
                break;
            case MOVE:
                m = new Point(m.x+(e.getX()- oldMc.x),m.y+(e.getY() - oldMc.y));
                oldMc = e.getPoint();
                repaint();
                break;
            }
        }



    }

