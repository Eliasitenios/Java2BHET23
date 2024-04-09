package schleifen;


/**
 * Schreibe eine prozedurale Methode "dreieckL" welche ein Dreieck aus Sternen auf den Bildschirm zeichnet.
 *
 * Die Größe des Dreiecks soll dabei als Parameter übergeben werden.
 *
 * Methode:
 *
 * public static void dreieckL(int size)
 * Ausgabe für size=4:
 */

public class dreieck1 {

    /**
     * Zeichnet eine Linie aus einem bestimmten Symbol auf den Bildschirm.
     *
     * @param size Die Länge der Linie, die Anzahl der Symbole.
     * @param symbol Das Symbol, das für die Linie verwendet wird.
     */

    public static void dLinie(int size, char symbol) {
        for (int i = 0; i < size; i++)
            System.out.print(symbol);
        System.out.println();
    }

    /**
     * Zeichnet ein Dreieck aus Sternen auf den Bildschirm.
     *
     * @param size Die Größe des Dreiecks. Die Anzahl der Zeilen im Dreieck.
     */

    public static void dreieckL(int size) {
        for (int i = 1; i <= size; i++)
            dLinie(i, '*');
    }

    public static void main(String[] args) {
        int size = 4;
        dreieckL(size);
    }
}
