package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import java.awt.*;

public interface Moveable {

    /**
     * Verschiebt ein Objekt von einem Startpunkt zu einem Zielpunkt
     * @param oldCursor Startpunkt
     * @param cursor    Zielpunkt
     */
    void move(Point oldCursor, Point cursor);

}