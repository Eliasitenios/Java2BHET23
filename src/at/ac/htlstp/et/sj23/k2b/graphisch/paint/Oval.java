package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import java.awt.*;

public class Oval extends Zweipunkt implements Moveable, Selectable {

    public Oval(Point p1, Point p2, Color color, Color fillColor, int thickness) {
        super(p1, p2, color, fillColor, thickness);
    }

    @Override
    public void paint(Graphics g) {
        Point p1 = getP1();
        Point p2 = getP2();
        int x = Math.min(p1.x, p2.x);
        int y = Math.min(p1.y, p2.y);
        int size = Math.min(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y));

        g.setColor(getFillcolor());
        g.fillOval(x, y, size, size);
        g.setColor(getColor());
        g.drawOval(x, y, size, size);
    }

    @Override
    public double distanceTo(Point p) {
        Point p1 = getP1();
        Point p2 = getP2();
        int centerX = (p1.x + p2.x) / 2;
        int centerY = (p1.y + p2.y) / 2;
        int radius = Math.min(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y)) / 2;

        double dx = p.x - centerX;
        double dy = p.y - centerY;
        double distance = Math.sqrt(dx * dx + dy * dy);

        return Math.abs(distance - radius);
    }

    @Override
    public boolean inner(Point p) {
        Point p1 = getP1();
        Point p2 = getP2();
        int centerX = (p1.x + p2.x) / 2;
        int centerY = (p1.y + p2.y) / 2;
        int radius = Math.min(Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y)) / 2;

        double dx = p.x - centerX;
        double dy = p.y - centerY;
        double distance = Math.sqrt(dx * dx + dy * dy);

        return distance <= radius;
    }
}
