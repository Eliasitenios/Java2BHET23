package at.ac.htlstp.et.sj23.k2b.feldmethoden;

public class FelderTest1 {

    public static void main(String[] args) {
        double[] r = {5,3,2.5,7};
        System.out.println("r="+r);
        System.out.println("r[1]="+r[1]);
        //System.out.println("r[7]="+r[7]);
        System.out.println("Elemente:" + r.length);
        FeldMethoden.printArrayln("r=",r);
        System.out.println("summe="+FeldMethoden.sum(r));
        r = FeldMethoden.push(r,18);
        FeldMethoden.printArrayln("r=",r);
        //r = new double[7];
        System.out.println("r="+r);
        System.out.println("r[1]="+r[1]);
        System.out.println("Elemente:"+r.length);
    }
}
