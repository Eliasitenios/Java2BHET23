package operatoren;

import java.util.Scanner;

/**
 * Bestimmt den Absolutbetrag einer Zahl
 */

public class betrag {

    public static void main(String[] args) {
        double x;
        double abs;
        Scanner sc = new Scanner(System.in);

        System.out.print("Zahl: ");
        x = sc.nextDouble();

        abs = x<0 ? -x : x;  // abs=/x<09?(-x):x;  abs=x<0?-x:x;  abs=(x<0) ? (-x) : x;

        System.out.printf("Absolutbetrag von %f = %f \n",x,abs);
        sc.close();
    }
}
