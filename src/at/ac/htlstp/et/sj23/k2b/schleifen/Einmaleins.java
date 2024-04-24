package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

public class Einmaleins {

    public static void printReihe(int reihe) {
        for (int i=1;i<=10;i++) {
            System.out.printf("%2d*%2d=%2d\n", i, reihe, i * reihe);
        }
    }

    public static void main(String[] args) {
        int reihe;
        Scanner sc = new Scanner(System.in);
        System.out.print("Welche Reihe soll gedruckt werden? ");
        reihe = sc.nextInt();
        do {
            printReihe(reihe);
            System.out.print("Soll noch eine Reihe gedruckt werden (0-Ende)? ");
            reihe = sc.nextInt();
        } while (reihe>0);
        sc.close();
    }
}
