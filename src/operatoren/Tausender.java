package operatoren;

import java.util.Scanner;

/**
 * Bestimme die Tausender Ziffer einer Zahl
 */
public class Tausender {
    public static void main(String[] args) {
        int wert, tz;
        Scanner sc = new Scanner(System.in);

        System.out.print("Wert : ");
        wert = sc.nextInt();

        // Bestimme die Tausender Ziffer
        tz = (wert/1000) %10;

        System.out.printf("Die tausender Ziffer von %d ist %d ! \n",wert,tz);
        sc.close();

    }
}
