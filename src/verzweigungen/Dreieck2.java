package verzweigungen;

import java.util.Scanner;

/**
 *Entwickle ein Java-Programm, welches folgende Aufgabenstellung erfüllt:
 * Lies die 3 Seitenlängen eines Dreiecks ein und bestimme welches Dreieck sie bilden (keines, rechtwinkelig, gleichschenkelig, gleichseitig, allgemein, gleichschenkelig-rechtwinkelig)
 * Die Bestimmung soll auf etwa 0.1Prozent genau erfolgen!
 * Gib anschließend die Art des Dreiecks mit den folgenden Texten aus:
 * "kein Dreieck","rechtwinkeliges Dreieck","gleichschenkeliges Dreieck", "rechtwinkeliges gleichschenkeliges Dreieck","gleichseitiges Dreieck","allgemeines Dreieck"
 */

public class Dreieck2 {

    public static double a, b, c;

    public static void sortiere(){
        double h;
        if (a>b) {
            //tausche a und b
            h=a;
            a=b;
            b=h;
        }
        if(a>c) {
            h=a;
            a=c;
            c=h;
        }
        if (b>c) { h=b; b=c; c=h; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Einlesen a,b,c
        System.out.print("Seite 1:"); a = sc.nextDouble();
        System.out.print("Seite 2:"); b = sc.nextDouble();
        System.out.print("Seite 3:"); c = sc.nextDouble();
        // Sortiere a<=b<=c
        sortiere();
        //Sortierte Seiten ausgeben
        System.out.printf("%d<=%d<=%d\n",a,b,c);
        //BEstimme das Dreieck
        Dreiecksbestimmung.bestimme(a,b,c);
        //Finalisierung
        sc.close();
    }
}
