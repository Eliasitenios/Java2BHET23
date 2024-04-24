package at.ac.htlstp.et.sj23.k2b.ue1bsp1;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 *
 * Lies vom Benutzer 2 Widerstände ein und berechne danach den Parallel und den Serienersatzwiderstand.
 *
 * Die Ausgabe soll in wie folgt aussehen:
 *
 * Serie : 34,53 Ohm
 * Parallel : 13,42 Ohm
 *
 * 03.10.2023
 * (C) Elias Wurzer
 */
public class Ue1Bsp1 {
    public static void main(String[] args) {

        // Deklarationen
        double widerstand1,widerstand2;
        double serie1,parallel1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Widerstand 1 = "); // Dies ist ein einzeiliger Kommentar
        //Widerstand 1 einlesen
        widerstand1 = scanner.nextDouble();

        System.out.print("Widerstand 2 = "); // Dies ist ein einzeiliger Kommentar
        //Widerstand 2 einlesen
        widerstand2 = scanner.nextDouble();
        scanner.close();

        //Serienschaltung berechnen:
        serie1 = widerstand1 + widerstand2;

        //Parallelschaltung berechnen:
        parallel1 = (widerstand1 * widerstand2)/(widerstand1+widerstand2);

        //Ausgabe des Ergebnisses
        System.out.printf("Serie : %6.2fOhm\n",serie1);
        System.out.printf("Parallel : %6.2fOhm\n",parallel1);
    }
}
