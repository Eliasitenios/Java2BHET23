package at.ac.htlstp.et.sj23.k2b.graphisch;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Fenster2 extends Fenster1  implements ComponentListener {

    public Fenster2(int width, int height) {
        super("Franzi",width, height);
        this.addComponentListener(this);
    }

    public static void main(String[] args) {
        new Fenster2(700,600);
    }

    @Override
    public void paint(Graphics g) {
        int b = this.getWidth();
        int h = this.getHeight();
        g.setColor(Color.green);
        g.drawRect(b/4,h/4,b/2,h/2);
        g.setColor(Color.red);
        g.drawLine(b/4,h/4, b/4 + b/2,h/4 + h/2);
    }

    /**
     * Invoked when the component's size changes.
     *
     * @param e the event to be processed
     */
    @Override
    public void componentResized(ComponentEvent e) {
        this.repaint();
    }

    /**
     * Invoked when the component's position changes.
     *
     * @param e the event to be processed
     */
    @Override
    public void componentMoved(ComponentEvent e) {

    }

    /**
     * Invoked when the component has been made visible.
     *
     * @param e the event to be processed
     */
    @Override
    public void componentShown(ComponentEvent e) {

    }

    /**
     * Invoked when the component has been made invisible.
     *
     * @param e the event to be processed
     */
    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
