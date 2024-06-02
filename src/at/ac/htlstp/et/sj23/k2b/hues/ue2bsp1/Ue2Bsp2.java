package at.ac.htlstp.et.sj23.k2b.hues.ue2bsp1;

import java.util.Scanner;


/**
 *
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 *
 * Es sollen 2 ganze Zahlen eingelesen werden. Wenn die hunderter-Ziffern beider Zahlen gleich sind soll die Summe der beiden Zahlen ausgegeben werden, ansonsten soll die Differenz der beiden Zahlen ausgegeben werden.
 *
 * Die Ausgabe sollte wie folgt aussehen:
 *
 * (C) Elias Wurzer
 * 07.11.2023
 */
public class Ue2Bsp2 {
    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Zahl eingeben
        System.out.print("1.Zahl eingeben: ");
        int zahl1 = sc.nextInt();
        System.out.print("2.Zahl eingeben: ");
        int zahl2 = sc.nextInt();
        int ergebnis;
        sc.close();

        // Berechnen
        if ((zahl1 / 100) % 10 == (zahl2 / 100) % 10) {
            ergebnis = zahl1 + zahl2;
        }
        else if (zahl1 > zahl2) {
            ergebnis = zahl1 - zahl2;
        }
        else {
            ergebnis = zahl2 - zahl1;
        }

        // Ausgabetext
        System.out.printf("Ergebnis : %d",ergebnis);
    }
}
