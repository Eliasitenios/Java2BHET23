package at.ac.htlstp.et.sj23.k2b.smü8;

import java.util.Scanner;

/**
 * Sternenmuster programmieren
 * (C) Elias Wurzer
 * 12.12.2023
 * Version 1.0a
 */

public class Smue8 {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Höhe
        System.out.print("Höhe eingeben: ");
        int h = scanner.nextInt();

        // Eingabe der Breite
        System.out.print("Breite eingeben: ");
        int b = scanner.nextInt();

        // Schleife
        for (int i = 0; i < h; i++) {
            // Schleife
            for (int j = 0; j < b; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        // Scanner schließen
        scanner.close();
    }
}
