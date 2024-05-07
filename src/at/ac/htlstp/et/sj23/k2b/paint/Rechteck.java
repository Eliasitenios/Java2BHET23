package at.ac.htlstp.et.sj23.k2b.paint;

import java.awt.*;
public class Rechteck extends Zweipunkt {

    public Rechteck(Point p1, Point p2, Color color, Color fillcolor, int thickness) {
        super(p1, p2, color, fillcolor, thickness);
    }

    @Override
    public void paint(Graphics g) {
        if (getFillColor()!=null) {
            g.setColor(getFillColor());
            g.fillRect(getP1().x, getP1().y,
                    getP2().x - getP1().x, getP2().y - getP1().y);
        }
        g.setColor(getColor());
        g.drawRect(getP1().x, getP1().y,
                getP2().x - getP1().x, getP2().y - getP1().y);


    }
}
