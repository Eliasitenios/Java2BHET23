package at.ac.htlstp.et.sj23.k2b.oop;

public class TestComplex {

    public static void main(String[] args) {
        Complex c = new Complex (2,5);
        Complex d;
        d=c;
        System.out.println("d="+d);
        System.out.println("c="+c);
        c.setAbs(3);
        System.out.println("c=" + c);
        System.out.println("abs:"+c.getAbs());
        System.out.println("d="+d);

        // Und jetzt addieren wir
        Complex a = new Complex(2, 4);
        Complex b = new Complex(1, 3);
        c = a.add(b);
        System.out.println(a+" + "+b+" = "+c);
        c = a.add(3);
        System.out.println(a + " + 3 = "+c);
        c=Complex.add(a,b);
        /*c=a.mul(b);
        d =a.mul(b);
        System.out.println(c+" = "+d);*/
        c = a.mul(b);
        d = c.mul(b);
        System.out.println(a + " = " + d);
        if(a.equals(d)) System.out.println("sind gleich!");
    }
}
