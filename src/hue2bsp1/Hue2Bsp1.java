package hue2bsp1;

import java.util.Scanner;

/**
 * Schreibe ein Java Programm, welches eine Ganzzahl welche maximal 5 Stellen haben darf einliest, die Ziffernsumme berechnet und anschließend die Ziffernsumme ausgibt.
 *
 * Die Ausgabe sollte dabei wie folgt aussehen:
 *
 * Gib eine Zahl ein : 34
 * Ziffernsumme : 7
 */

public class Hue2Bsp1 {

    public static void main(String[] args) {
        int ziffer, ziffernsumme;
        Scanner sc = new Scanner(System.in);

        //Ziffer eingeben
        System.out.print("Gib eine beliebige Zahl ein: ");
        ziffer = sc.nextInt();
        sc.close();

        //Ziffernsumme berechnen
        ziffernsumme = (ziffer / 10000) % 10
                + (ziffer / 1000) % 10
                + (ziffer / 100) % 10
                + (ziffer / 10) % 10
                + ziffer % 10;

        // Ziffernsumme Ausgabe
        System.out.printf("Ziffernsumme: %d\n", ziffernsumme);

    }
}
