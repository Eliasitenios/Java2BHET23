package at.ac.htlstp.et.sj23.k2b;

import java.util.Scanner;

/**
 * Programm welches aus Strom und Spannung einen
 * Widerstand berechnet.
 * (C) Elias Wurzer
 * Datum: 19.9.2023
 * Version 0.1
 */
public class Widerstand {
    public static void main(String[] args) {
        // Deklarationen
        double spannung=5;
        double widerstand,strom;
        Scanner scanner = new Scanner(System.in);

        strom = 0.1;


        System.out.print("Spannung="); // Dies ist ein einzeiliger Kommentar
        //Spannung einlesen
        spannung = scanner.nextDouble();

        //TODO Strom einlesen
        System.out.print("Strom=");
        strom = scanner.nextDouble();
        scanner.close();

        //TODO Widerstand berechnen
        widerstand = spannung / strom;
        //Ausgabe des Ergebnisses
        System.out.printf("Widerstand = %8.3fOhm\n",widerstand);
        System.out.printf("Angabe: U=%8.3f I=%8.3fA\n",spannung,strom);
    }
}
