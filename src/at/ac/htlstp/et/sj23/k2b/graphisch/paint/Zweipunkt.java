package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import java.awt.*;

public abstract class Zweipunkt implements Paintable, Moveable {

    /**
     * erster Punkt
     */
    private Point p1;

    /**
     * zweiter Punkt
     */
    private Point p2;

    /**
     * Zeichenfarbe
     */
    private Color color;

    /**
     * Füllfarbe
     */
    private Color fillcolor;

    /**
     * Linienstärke
     */
    private int thickness;

    public Zweipunkt(Point p1, Point p2, Color color, Color fillcolor, int thickness) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
        this.fillcolor = fillcolor;
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

    public Color getFillcolor() {
        return fillcolor;
    }

    public void setFillcolor(Color fillcolor) {
        this.fillcolor = fillcolor;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public void move(Point omc, Point mc) {
        p1 = new Point(p1.x + mc.x - omc.x, p1.y + mc.y - omc.y);
        p2 = new Point(p2.x + mc.x - omc.x, p2.y + mc.y - omc.y);
    }

    @Override
    public void paintSelection(Graphics g) {
        int xmin = Integer.min(p1.x, p2.x);
        int xmax = Integer.max(p1.x, p2.x);
        int ymin = Integer.min(p1.y, p2.y);
        int ymax = Integer.max(p1.y, p2.y);
        int s = 10;

        if (this instanceof Oval) {
            int diameter = Math.min(xmax - xmin, ymax - ymin);
            xmax = xmin + diameter;
        }

        g.setColor(Color.gray);
        g.drawRect(xmin, ymin, xmax - xmin, ymax - ymin);
        g.setColor(Color.black);
        g.fillRect(xmin - s, ymin - s, s, s);
        g.fillRect(xmin - s, ymax, s, s);
        g.fillRect(xmax, ymin - s, s, s);
        g.fillRect(xmax, ymax, s, s);
    }
}