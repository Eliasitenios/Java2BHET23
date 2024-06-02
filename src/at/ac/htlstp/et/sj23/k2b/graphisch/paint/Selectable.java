package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import java.awt.*;

public interface Selectable {

    /**
     * Berechnet die Distanz des Punktes p zur Kante des Objekts
     * @param p Point
     * @return  Distanz zur Kante
     */
    double distanceTo(Point p);

    /**
     * Prüft ob der Punkt p innerhalb des Objekts liegt
     * @param p Punkt
     * @return  true wenn innerhalb
     */
    boolean inner(Point p);
}