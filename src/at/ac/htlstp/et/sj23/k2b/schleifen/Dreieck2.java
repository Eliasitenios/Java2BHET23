package at.ac.htlstp.et.sj23.k2b.schleifen;

/**
 * Schreibe eine prozedurale Methode "dreieckR" welche ein Dreieck aus Sternen auf den Bildschirm zeichnet.
 *
 * Die Größe des Dreiecks soll dabei als Parameter übergeben werden.
 *
 * Methode:
 *
 * public static void dreieckR(int size)
 * Ausgabe für size=4:
 *
 *    *
 *   **
 *  ***
 * ****
 */

public class Dreieck2 {

    /**
     * Hauptmethode.
     *
     * @param args .
     */

    public static void main(String[] args) {
        // Beispiel mit Höhe 4
        dreieckR(4);
    }

    /**
     * Die Methode gibt aus.
     *
     * @param hoehe Die Höhe des Dreiecks.
     */
    public static void dreieckR(int hoehe) {
        for (int i = 1; i <= hoehe; i++) {
            // Leerzeichen vor den Sternen
            for (int j = 1; j <= hoehe - i; j++) {
                System.out.print(" ");
            }

            // Sterne ausgeben
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Neue Zeile für die nächste Ebene
            System.out.println();
        }
    }
}

