package at.ac.htlstp.et.sj23.k2b.verzweigungen;

public class TesteSortierung {

    public static void pruefe(double x, double y, double z) {
        Dreieck2.a = x;
        Dreieck2.b = y;
        Dreieck2.c = z;
        Dreieck2.sortiere();
        if (Dreieck2.a > Dreieck2.b || Dreieck2.b > Dreieck2.c)
            System.out.printf("Fehler!%f<=%f<=%f nicht erfüllt\n", Dreieck2.a, Dreieck2.b, Dreieck2.c);
    }

    public static void main(String[] args) {
        pruefe(2,1,6);
        pruefe(6,1,2);
        pruefe(1,6,2);
        pruefe(5,5,10);
        pruefe(1,4,2);
    }
}
