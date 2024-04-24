package at.ac.htlstp.et.sj23.k2b.feldmethoden;

import java.util.Vector;

public class Sieb {
    public static Vector<Integer> sieb(int x) {
        Vector<Integer> p = new Vector<>();
        boolean[] f = new boolean[x+1];
        f[0] = false;
        f[1] = false;
        for (int i=2;i<=x;i++) f[i] = true;
        // Sieb
        for (int i=2;i<=x;i++) {
            if (f[i]) {
                p.add(i);
                for (int j=i+i;j<=x;j+=i) f[j] = false;
            }
        }
        return p;
    }
    public static void main(String[] args){
        Vector<Integer> p;
        long t= System.currentTimeMillis();
        p = sieb(1000000000);
        t = System.currentTimeMillis()-t;
        System.out.println("\nDauer:"+t+"ms");
        //System.out.pritln("PZ:"+p);
    }
}