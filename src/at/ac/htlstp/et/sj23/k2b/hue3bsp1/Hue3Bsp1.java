package at.ac.htlstp.et.sj23.k2b.hue3bsp1;

import java.util.Scanner;

/**
 * Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 * Lies die 3 Seitenlängen eines Dreiecks ein und bestimme welches Dreieck sie bilden (keines, rechtwinkelig, gleichschenkelig, gleichseitig, allgemein, gleichschenkelig-rechtwinkelig)
 * Die Bestimmung soll auf etwa 0.1Prozent genau erfolgen!
 * Gib anschließend die Art des Dreiecks mit den folgenden Texten aus:
 * "kein Dreieck","rechtwinkeliges Dreieck","gleichschenkeliges Dreieck", "rechtwinkeliges gleichschenkeliges Dreieck","gleichseitiges Dreieck","allgemeines Dreieck"
 */

public class Hue3Bsp1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //Einlesen der a Seite
        System.out.println("Bitte geben Sie die Seite a ein:");
        double a = myScanner.nextDouble();
        //Einlesen der b Seite
        System.out.println("Bitte geben Sie die Seite b ein:");
        double b = myScanner.nextDouble();
        //Einlesen der c Seite
        System.out.println("Bitte geben Sie die Seite c ein:");
        double c = myScanner.nextDouble();
        myScanner.close();


        //Sotieren der Werte
        double h;
        if (a > b) {
            h = a;
            a = b;
            b = h;
        }
        if (b > c) {
            h = b;
            b = c;
            c = h;
        }
        if (a > b) {
            h = a;
            a = b;
            b = h;
        }

        //Toleranz
        double tol = 1e-3;

        //Berechnung
        if (a + b <= c) {
            System.out.println("kein Dreieck");
        } else if (Math.abs(a-c)<tol) {
            System.out.println("gleichseitiges Dreieck");
        } else if (Math.abs(a*a+b*b-c*c)<tol && Math.abs(a-b)<tol){
            System.out.println("rechtwinkeliges gleichschenkeliges Dreieck");
        } else if (Math.abs(a-b)<tol || Math.abs(b-c)<tol){
            System.out.println("gleichschenkeliges Dreieck");
        } else if (Math.abs(a*a+b*b-c*c)<tol){
            System.out.println("rechtwinkeliges Dreieck");
        } else {
            System.out.println("allgemeines Dreieck");
        }
    }
}