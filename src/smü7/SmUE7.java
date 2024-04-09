package smü7;

import java.util.Scanner;

/**
 *Schreibe je eine Methode "ser" und "par" welche den Serien- und Parallelersatzwiderstand von zwei Widerständen (double!) berechnet!
 * (C) Elias Wurzer
 * Version 1.0
 * 21.11.2023
 */

public class SmUE7 {

    public static void main(String[] args) {

        double ser, par, r1, r2;
        r1 = 10;
        r2 = 20;

        ser = ser(r1, r2);
        par = par(r1, r2);

        System.out.printf("Serienwiderstand = %f\nParallelwiderstand = %f", ser, par);
    }

    /**
     *
     * @param r1
     * @param r2
     * @return
     */

    //Berechnung von Serienwiderstand
    public static double ser(double r1, double r2) {
        double ser;
        ser = r1 + r2;
        return ser;
    }

    /**
     *
     * @param r1
     * @param r2
     * @return
     */

    //Berechnung von Parallelwiderstand
    public static double par(double r1, double r2) {
        double par;
        par = (r1 * r2)/(r1 + r2);
        return par;
    }
}
