package at.ac.htlstp.et.sj23.k2b.ue2bsp1;

import java.util.Scanner;

/**
 *Gegeben sind die zwei Geraden:
 *
 * y=1.7⋅x+1.3
 * y=−1.4⋅x+2.5
 *
 * Lies von der Tastatur die x- und y-Koordinate eines Punktes ein und bestimme ob der Punkt oberhalb,zwischen(oder direkt auf einer Geraden) oder unterhalb der beiden Geraden liegt.
 *
 * Verwende für die Angabe der Position die Wörter "über","zwischen" und "unter", die Ausgabe sollte dabei wie folgt aussehen:
 *
 * Punkt x: 4,5
 * Punkt y: 2,3
 * Der Punkt liegt zwischen den Geraden.
 */

public class Ue2Bsp1 {
    public static void main(String[] args) {
        double gerade1,gerade2;
        Scanner sc = new Scanner(System.in);

        // Werte einlesen
        System.out.print("X Koordinate:");
        double x = sc.nextDouble();
        System.out.print("Y Koordinate:");
        double y = sc.nextDouble();
        sc.close();

        // Berechnen
        gerade1  =1.7 * x + 1.3;
        gerade2  =-1.4 * x + 2.5;

        // Ausgabe
        if (y > Math.max(gerade1, gerade2)) {
            System.out.print("über");
        }
        else if (y < Math.min(gerade1, gerade2)) {
            System.out.println("unter");
        }
        else {
            System.out.println("zwischen");
        }



    }
}
