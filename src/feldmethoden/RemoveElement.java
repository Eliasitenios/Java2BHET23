package feldmethoden;

/**
 * Schreibe ein Methode removeElement, welche aus einem gegebenen Feld ein Element herauslöscht und dann als neues Feld zurückgibt. Hierbei darf das ursprüngliche Feld nicht verändert werden.
 * Der Import vom Package "Arrays" ist nicht erlaubt!
 * verwende folgenden Methodenkopf:
 * public static double[] removeElement(double feld[], int pos)
 * Beispiel:
 * double x[] = { 4,5,6,7};
 * double y[] = removeElement(x,2);
 * // Im Feld y[] steht nun [4,5,7] da der Index 2 gelöscht wurde und x[] bleibt unverändert
 */

public class RemoveElement {

    /**
     *  zur Kontrolle
     * @param args args
     */
    public static void main(String[] args) {
        double[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        double[] y = removeElement(x, 5);

        // Ausgabe zum Testen
        System.out.print("x[]: ");
        printArray(x);
        System.out.print("y[]: ");
        printArray(y);
    }

    /**
     * löscht das Feld und erstellt ein kleineres
     * @param feld feld
     * @param pos 0
     * @return result
     */
    public static double[] removeElement(double[] feld, int pos) {
        if (pos < 0 || pos >= feld.length) {
            // Falls die Position ungültig ist, gib das ursprüngliche Feld zurück
            return feld;
        }

        // Erstelle ein neues Feld mit der Größe eins kleiner als das ursprüngliche Feld
        double[] result = new double[feld.length - 1];

        // Kopiere die Elemente bis zur Position ins neue Feld
        for (int i = 0, j = 0; i < feld.length; i++) {
            if (i != pos) {
                result[j++] = feld[i];
            }
        }

        return result;
    }

    // Hilfsmethode zum Ausgeben eines Arrays (nur für Testzwecke)

    /**
     *  Ergebnis
     * @param arr arr
     */
    public static void printArray(double[] arr) {
        for (double value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}