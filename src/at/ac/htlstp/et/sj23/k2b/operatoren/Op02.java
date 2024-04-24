package at.ac.htlstp.et.sj23.k2b.operatoren;

public class Op02 {

    public static void main(String[] args) {
        int x,y,z;
        x = 5;
        y = x++;
        System.out.printf("x=%d y=%d\n",x,y);
        x = 5;
        y = x++ + x++;
        System.out.printf("x=%d y=%d\n",x,y);
        x = 5;
        y = (x++)*3 + x++;
        System.out.printf("x=%d y=%d\n",x,y);
        x = 5;
        y = x++*(--x) + x++*x--;
        System.out.printf("x=%d y=%d\n",x,y);
    }
}
