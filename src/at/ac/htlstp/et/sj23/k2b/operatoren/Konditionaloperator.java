package at.ac.htlstp.et.sj23.k2b.operatoren;

public class Konditionaloperator {
    public static void main(String[] args) {
        double x=3.6;
        int y=5;
        double z;

        z = 2*(x<y ? x :y);
        System.out.println("z= "+z);
        z = 2*(x>=y ? x :y);
        System.out.println("z= "+z);
    }

}
