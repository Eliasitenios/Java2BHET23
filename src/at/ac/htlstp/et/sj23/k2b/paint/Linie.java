package at.ac.htlstp.et.sj23.k2b.paint;

import java.awt.*;

public class Linie extends Zweipunkt {

    public Linie(Point p1, Point p2, Color color, Color fillcolor, int thickness) {
        super(p1, p2, color, fillcolor, thickness);


    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getP1().x,getP1().y, getP2().x, getP2().y);

    }
}
