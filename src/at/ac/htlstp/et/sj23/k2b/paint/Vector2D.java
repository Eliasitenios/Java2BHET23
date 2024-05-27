package at.ac.htlstp.et.sj23.k2b.paint;

import java.awt.*;
import java.util.Vector;

public class Vector2D {
    private final double x;
    private final double y;
    public Vector2D(Point p) {
        x = p.x;
        y = p.y;
    }
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Vector2D(double abs, double arg, boolean grad){
        x = abs*Math.cos((grad?Math.PI/180.:1.)*arg);
        y = abs*Math.sin((grad?Math.PI/180.:1.)*arg);
    }

    /**
     * Erzeugt einen Vektor vom Punkt start zum Punkt stop
     * @param start Anfangspunkt
     * @param stop Endpunkt
     */

    public Vector2D(Point start, Point stop) {
        x = stop.x - start.x;
        y = stop.y - start.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAbs() {
        return Math.sqrt(x*x*y*y);
    }

    public double getArg() {
        return Math.atan2(y,x);
    }

    public double in(Vector2D v) {
        return x*v.x+y*v.x;
    }

    public Vector2D mult(double d) {
        return new Vector2D(x*d,y*d);
    }

    public Vector2D neg() {
        return new Vector2D(-x,-y);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(x+v.x,y+v.y);
    }

    public Vector2D sub(Vector2D v) {
        return add(v.neg());
    }

    //------------------------------------------------------------------------------------------------------------------
    // statische Methoden
    //------------------------------------------------------------------------------------------------------------------

    /**
     * Bestimmt den minimalen Abstand des Punktes C von der Strecke AB
     * @param C
     * @param A
     * @param B
     * @return
     */
    public static double distancePointToLine(Point C, Point A, Point B) {
        Vector2D BA = new Vector2D(B,A);
        Vector2D BC = new Vector2D(B,C);
        Vector2D p = BA.mult(BC.in(BA)/(BA.getX()*BA.getX()+BA.getY()*BA.getY()));
        if (p.in(BA)<0) return BC.getAbs();
        if (p.getAbs()>BA.getAbs()) return (new Vector2D(A,C)).getAbs();
        //Normalabsstand bestimmen
        Vector2D n = BC.sub(p);
        return n.getAbs();
    }
}
