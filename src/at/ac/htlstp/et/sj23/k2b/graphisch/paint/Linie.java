package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import java.awt.*;

public class Linie extends Zweipunkt implements Selectable {

    public Linie(Point p1, Point p2, Color color, Color fillcolor, int thickness) {
        super(p1, p2, color, fillcolor, thickness);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.drawLine(getP1().x,getP1().y,getP2().x,getP2().y);
    }

    /**
     * Berechnet die Distanz des Punktes p zur Kante des Objekts
     *
     * @param p Point
     * @return Distanz zur Kante
     */
    @Override
    public double distanceTo(Point p) {
        return Vector2D.distancePointToLine(p,getP1(),getP2());
    }

    /**
     * Prüft ob der Punkt p innerhalb des Objekts liegt
     *
     * @param p Punkt
     * @return true wenn innerhalb
     */
    @Override
    public boolean inner(Point p) {
        return false;
    }
}