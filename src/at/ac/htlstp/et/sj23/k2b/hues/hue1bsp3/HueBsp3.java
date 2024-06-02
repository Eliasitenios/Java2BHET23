package at.ac.htlstp.et.sj23.k2b.hues.hue1bsp3;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 *
 * Lies vom Benutzer den Radius eines Kreises ein und gib Umfang und Fläche aus.
 *
 * Die Ausgabe des Ergebnisses sollte wie folgt aussehen:
 *
 * A = 30,35
 * U = 14,80
 *
 * (C) Elias Wurzer
 * Datum 19.09.2023
 * Version 0.1
 */
public class HueBsp3 {

    public static void main(String[] args) {
        // Deklarationen
        double radius;
        double umfang,flaeche;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius = "); // Dies ist ein einzeiliger Kommentar
        radius = scanner.nextDouble();
        scanner.close();

        flaeche = radius * radius * Math.PI;
        umfang =  2 * radius * Math.PI;
        //Ausgabe des Ergebnisses
        System.out.printf("A = %7.3f\n",flaeche);
        System.out.printf("U = %7.3f\n",umfang);
        System.out.printf("Angabe: = %5.2f\n",radius);
    }
}
