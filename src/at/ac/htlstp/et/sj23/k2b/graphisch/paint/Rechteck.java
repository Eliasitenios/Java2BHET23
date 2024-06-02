package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import java.awt.*;

public class Rechteck extends Zweipunkt implements Selectable, Moveable {

    public Rechteck(Point p1, Point p2, Color color, Color fillcolor, int thickness) {
        super(p1, p2, color, fillcolor, thickness);
    }

    @Override
    public void paint(Graphics g) {
        if (getFillcolor() != null) {
            g.setColor(getFillcolor());
            g.fillRect(getP1().x, getP1().y,
                    getP2().x - getP1().x, getP2().y - getP1().y);
        }
        g.setColor(getColor());
        g.drawRect(getP1().x, getP1().y,
                getP2().x - getP1().x, getP2().y - getP1().y);
    }

    @Override
    public double distanceTo(Point p) {
        Point p1 = getP1();
        Point p2 = getP2();
        int x = Math.min(p1.x, p2.x);
        int y = Math.min(p1.y, p2.y);
        int width = Math.abs(p1.x - p2.x);
        int height = Math.abs(p1.y - p2.y);

        Rectangle rect = new Rectangle(x, y, width, height);
        if (rect.contains(p)) {
            return 0;
        } else {
            double dx = Math.max(x - p.x, p.x - (x + width));
            double dy = Math.max(y - p.y, p.y - (y + height));
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    @Override
    public boolean inner(Point p) {
        Point p1 = getP1();
        Point p2 = getP2();
        int x = Math.min(p1.x, p2.x);
        int y = Math.min(p1.y, p2.y);
        int width = Math.abs(p1.x - p2.x);
        int height = Math.abs(p1.y - p2.y);

        Rectangle rect = new Rectangle(x, y, width, height);
        return rect.contains(p);
    }

    @Override
    public void move(Point oldCursor, Point cursor) {
        int dx = cursor.x - oldCursor.x;
        int dy = cursor.y - oldCursor.y;

        setP1(new Point(getP1().x + dx, getP1().y + dy));
        setP2(new Point(getP2().x + dx, getP2().y + dy));
    }
}
