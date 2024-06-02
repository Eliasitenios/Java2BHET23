package at.ac.htlstp.et.sj23.k2b.hues.hue1bsp2;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches vom Benutzer eine Temperatur in °C abfrägt und dann die Temperatur in Kelvin ausgibt.
 *
 * Verwende eine formatierte Ausgabe mit drei Nachkommastellen!
 *
 * (C) Elias Wurzer
 * Datum 19.09.2023
 * Version 0.1
 */
public class Hue1Bsp2 {
    public static void main(String[] args) {
        // Deklarationen
        double temperatur1;
        double temperatur2;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Temperatur in °C ="); // Dies ist ein einzeiliger Kommentar
        //TODO Temperatur einlesen.
        temperatur1 = scanner.nextDouble();
        scanner.close();

        //TODO Temperatur in Kelvin berechnen.
        temperatur2 = temperatur1 + 273.15;
        //Ausgabe des Ergebnisses
        System.out.printf("Temperatur in Kelvin = %7.3fK\n",temperatur2);
        System.out.printf("Angabe: = %5.2f °C\n",temperatur1);
    }
}
