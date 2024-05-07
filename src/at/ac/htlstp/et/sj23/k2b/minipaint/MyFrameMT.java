package at.ac.htlstp.et.sj23.k2b.minipaint;

import at.ac.htlstp.et.sj23.k2b.graphisch.MyFrame;

import java.awt.event.*;

public abstract class MyFrameMT
    extends MyFrame
        implements KeyListener, MouseMotionListener, MouseWheelListener, MouseListener {
    public MyFrameMT(String title, int width, int height) {
        super(title, width, height);
        this.addKeyListener(this);
        this.addMouseMotionListener(this);
        this.addMouseWheelListener(this);
        this.addMouseListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

    }
}

