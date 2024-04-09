package bspmethoden1;

/**
 * Schreibe eine Methode "zwischen" welche prüft ob eine Zahl in einem Zahlenbereich zwischen zwei Zahlen liegt.
 * Die Methode sollte folgenden Syntax haben:
 * public static boolean zwischen(double x, double a, double b)
 * Die Methode liefert true wenn x zwischen a und b oder genau a oder genau b ist. Alle Werte sind dabei beliebig wählbar.
 * (C) Elias Wurzer
 * 05.12.2023
 * Version 0.1
 */

public class BspMethoden1 {

    public static void main(String[] args) {
        zwischen(1,5,3);

    }

    /**
     * Es Prüft ob x zwischen a und b liegt
     * @param a kleine zahl
     * @param b große zahl
     * @param x prüfungszahl
     * @return ja wenn zahl zwischen a und b ist
     */

    public static boolean zwischen(double x, double a, double b) {
        boolean ist;

        if (x == a || x == b) {
            ist = true;
        }
        else if ((x > a && x < b) || (x < a && x > b)) {
            ist = true;
        }
        else {
            ist = false;
        }

        return ist;

    }
}