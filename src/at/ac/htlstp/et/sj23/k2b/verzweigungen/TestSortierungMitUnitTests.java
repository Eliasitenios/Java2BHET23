package at.ac.htlstp.et.sj23.k2b.verzweigungen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSortierungMitUnitTests {

    @Test
    public void testSortierung() {
        Dreieck2.a = 2;
        Dreieck2.b = 1;
        Dreieck2.c = 6;
        Dreieck2.sortiere();
        assertTrue(Dreieck2.a<=Dreieck2.b);
        assertTrue(Dreieck2.a<=Dreieck2.c);
        assertTrue(Dreieck2.b<=Dreieck2.c);
    }


    public static void pruefe(double x, double y, double z){
        Dreieck2.a = x;
        Dreieck2.b = y;
        Dreieck2.c = z;
        Dreieck2.sortiere();
        assertTrue(Dreieck2.a<=Dreieck2.b);
        assertTrue(Dreieck2.a<=Dreieck2.c);
        assertTrue(Dreieck2.b<=Dreieck2.c);
    }

    @Test
    public void testSortierungWeitere() {
        pruefe(2,1,6);
        pruefe(6,1,2);
        pruefe(1,6,2);

    }
}
