package at.ac.htlstp.et.sj23.k2b.operatoren;

public class Op01 {

    public static void main(String[] args) {
        int x=7, y=9;
        double a=3.6, b=7.4;
        double c;
        int z;

        c = a*b;          System.out.printf("c=%f\n",c);
        c = a/b;          System.out.printf("c=%f\n",c);
        x = (int)(y*a);   System.out.printf("x=%d\n",x);
        x = y*(int)a;     System.out.printf("x=%d\n",x);
        x = 13;
        z = y/x;          System.out.printf("z=%d\n",z);
        a = x/y;          System.out.printf("a=%f\n",a);
        a = (double)x/y;  System.out.printf("a=%f\n",a);
    }
}
