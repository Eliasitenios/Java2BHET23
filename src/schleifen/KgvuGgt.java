package schleifen;

/**
 * Schreibe je eine Methode für das kleinste gemeinsame Vielfache und für den größten gemeinsamen Teiler zweier Integer Zahlen.

 * Bei negativen Zahlen soll das Ergebnis immer positiv sein!

 * Hilfe: ggT  kgV

 * Verwende dazu folgende Methodensignatur:

 * public static int ggT(int x, int y)
 * public static int kgV(int x, int y)
 */

public class KgvuGgt {

    /**
     * Berechnet den größten gemeinsamen Teiler (ggT) zweier ganzer Zahlen.
     * Der ggT ist die größte positive ganze Zahl, die beide Zahlen ohne Rest teilt.
     *
     * @param x Die erste ganze Zahl.
     * @param y Die zweite ganze Zahl.
     * @return Der größte gemeinsame Teiler von x und y.
     */

    public static int ggT(int x, int y) {
        // Stelle sicher, dass beide Zahlen positiv sind
        x = Math.abs(x);
        y = Math.abs(y);

        // Anwendung des Euklidischen Algorithmus
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        return x;
    }

    /**
     * Berechnet das kleinste gemeinsame Vielfache (kgV) zweier ganzer Zahlen.
     * Das kgV ist das kleinste positive Vielfache, das beide Zahlen teilt.
     *
     * @param x Die erste ganze Zahl.
     * @param y Die zweite ganze Zahl.
     * @return Das kleinste gemeinsame Vielfache von x und y.
     */

    public static int kgV(int x, int y) {
        // Stelle sicher, dass beide Zahlen positiv sind
        x = Math.abs(x);
        y = Math.abs(y);

        // Das kgV ist das Produkt der Zahlen geteilt durch den ggT
        return (x / ggT(x, y)) * y;
    }
}
