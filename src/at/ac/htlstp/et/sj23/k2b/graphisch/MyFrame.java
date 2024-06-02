package at.ac.htlstp.et.sj23.k2b.graphisch;

import java.awt.*;
import java.awt.event.*;

public abstract class MyFrame
        extends Frame
        implements WindowListener, ComponentListener {

    public MyFrame(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width,height);
        this.addWindowListener(this);
        this.addComponentListener(this);
    }

    @Override
    public abstract void paint(Graphics g);

    @Override
    public void componentResized(ComponentEvent e) {
        this.repaint();
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}