package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

/**
 * Buchstabe programmieren
 */

public class buchstabe {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Breite
        System.out.print("Breite eingeben: ");
        int b = scanner.nextInt();

        // Eingabe der Breite
        int h = 2*b;

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
