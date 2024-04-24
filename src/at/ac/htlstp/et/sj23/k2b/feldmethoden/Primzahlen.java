package at.ac.htlstp.et.sj23.k2b.feldmethoden;

import java.util.Vector;
public class Primzahlen {

    public static Vector<Integer> prims(int max) {
        Vector<Integer> p = new Vector<>();
        p.add(2);
        PRIMSCHLEIFE:
        for (int x = 3; x <= max; x+=2) {
            boolean isprim=true;
            for (int i=0; i<p.size(); i++) {
                if (x%p.get(i)==0) continue PRIMSCHLEIFE;

            }
            p.add(x);
        }

        p.insertElementAt(2, 0);

        return p;
    }

    public static void main (String[] args) {
        Vector<Integer> p;
        long t = System.currentTimeMillis();
        p = prims(1000);
        t = System.currentTimeMillis()-t;
        System.out.println("Dauer:"+t+"ms");
        System.out.println("PZ:"+p);
    }
}


