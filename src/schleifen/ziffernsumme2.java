package schleifen;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ziffernsumme2 {

    /**
     * Diese Methode berechnet die Ziffernsumme einer Zahl und gibt das Ergebnis zurück.
     * Wenn die Zahl negativ ist, wird das Vorzeichen als -1 und die absolute Zahl zurückgegeben.
     * Andernfalls wird das Vorzeichen als +1 und die absolute Zahl zurückgegeben.
     *
     * @param x Die zu verarbeitende Zahl.
     * @return Die Ziffernsumme der Zahl mit entsprechendem Vorzeichen.
     */

    public static int ziffernsumme(int x) {

        int vz, zs;
        vz = 1;

        if(x < 0){
            vz= -1;
            x= -x;
        }
        zs = 0;
        do {
            zs +=x%10;
            x /= 10;
        }
        while(x > 0);
        zs *= vz;
        return zs;
    }

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ziffernsumme von : ");
        x = sc.nextInt();
        sc.close();
        System.out.println(ziffernsumme(x));
    }
}
