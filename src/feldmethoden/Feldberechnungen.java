package feldmethoden;

/**
 *
 * Schreibe je eine Methode min,max,mw innerhalb einer Klasse, welche den minimalen,maximalen Wert und den Mittelwert eines Feldes zurückgibt.
 *
 * Methode:
 */

public class Feldberechnungen {

    /**
     * Berechnet den kleinsten Wert des Feldes
     * @param feld Feld mit Feldelementen
     * @return     kleinster im Feld vorkommender Wert
     */
    public static double min(double[] feld) {
        double min = feld[0];
        for (int i = 1; i < feld.length; i++) {
            if (feld[i] < min) {
                min = feld[i];

            }
        }
        return min;
    }

    /**
     * Berechnet den größten Wert des Feldes
     * @param feld Feld mit Feldelementen
     * @return     größter im Feld vorkommender Wert
     */
    public static double max(double[] feld) {
        double max = feld[0];
        for (int i = 1; i < feld.length; i++) {
            if (feld[i] > max) {
                max = feld[i];

            }
        }
        return max;
    }

    /**
     * Berechnet den Mittelwert des Feldes
     * @param feld Feld mit Feldelementen
     * @return     Mittelwert aller Feldelemente
     */
    public static double mw(double[] feld) {
        double sum = 0;
        for (int i = 0; i < feld.length; i++) {
            sum += feld[i];

        }
        return sum / feld.length;
    }

    public static void main(String[] args) {
        double[] feld = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Minimum: " + min(feld));
        System.out.println("Maximum: " + max(feld));
        System.out.println("Mittelwert: " + mw(feld));
    }
}
