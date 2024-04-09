package hue4bsp1;

import java.util.Scanner;

/**
 * Schreibe je eine Methode für die Berechnung der Fläche und des Umfanges eines Kreises.
 *
 * Verwende hierzu folgende Methodenköpfe:
 *
 * public static double kreisUmfang(double r)
 * public static double kreisFlaeche(double r)
 * Schreibe dazu ein Testprogramm, welches von der Tastatur den Radius einliest und dann Fläche und Umfang ausgibt.
 *
 * Die Ausgabe des Ergebnisses sollte wie folgt aussehen:
 *
 * A = 30,35
 * U = 14,80?
 *
 * (C) Elias Wurzer
 */

public class Hue4Bsp1 {

//Scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kreisradius: ");
        double radius = scanner.nextDouble();

        double flaeche = kreisFlaeche(radius);
        double umfang = kreisUmfang(radius);

        System.out.printf("A = %.2f%n", flaeche);
        System.out.printf("U = %.2f%n", umfang);

        scanner.close();
    }

        /**
         * Berechnung des Umfang eines Kreises.
         *
         * @param radius Der Radius des Kreises.
         * @return Der Umfang des Kreises.
         */
        public static double kreisUmfang(double radius) {
            // Umfang = 2 * π * r
            return 2 * Math.PI * radius;
        }

        /**
         * Berechnung der Fläche eines Kreises.
         *
         * @param radius Der Radius des Kreises.
         * @return Die Fläche des Kreises.
         */
        public static double kreisFlaeche(double radius) {
            // Fläche = π * r^2
            return Math.PI * Math.pow(radius, 2);
        }
    }

