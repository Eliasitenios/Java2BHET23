package at.ac.htlstp.et.sj23.k2b.graphisch;

import java.awt.*;

public abstract class Zweipunkt implements paintable {

    /** erster Punkt */
    private Point p1;

    /** zweiter Punkt */
    private Point p2;

    /** Zeichenfarbe */
    private Color color;

    /** Füllfarbe */
    private Color fillColor;

    /** Linienstärke */
    private int thickness;

    public Zweipunkt(Point p1, Point p2, Color color, Color fillColor, int thickness) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
        this.fillColor = fillColor;
        this.thickness = thickness;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
}
