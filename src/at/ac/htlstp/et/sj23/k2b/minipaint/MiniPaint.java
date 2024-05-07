package at.ac.htlstp.et.sj23.k2b.minipaint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class MiniPaint extends MyFrameMT {
    private int startX, startY, endX, endY;

    public MiniPaint(String title, int width, int height) {
        super(title, width, height);
        // Setze das Fensterlogo
        setWindowIcon();
    }

    private void setWindowIcon() {
        ImageIcon icon = new ImageIcon("C:\\Users\\elias\\Documents\\lettobild.png"); // Passe den Dateipfad entsprechend an
        Image image = icon.getImage();
        setIconImage(image);
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        Graphics g = getGraphics();
        g.drawLine(startX, startY, endX, endY);
    }

    public static void main(String[] args) {
        MiniPaint paintProgram = new MiniPaint("Paint 2D", 600, 400);
        paintProgram.setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e) {

    }
}
