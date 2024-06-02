package at.ac.htlstp.et.sj23.k2b.graphisch.paint;

import java.awt.*;

/**
 * Interface für Objekte die mit der AWT gezeichnet werden können
 */
public interface Paintable {

    /**
     * Zeichnet das Objekt in die Zeichenebene g
     * @param g Zeichenebene
     */
    void paint(Graphics g);

    /**
     * Zeichnet die Selektion eines Elements
     * @param g Zeichenebene
     */
    void paintSelection(Graphics g);

}