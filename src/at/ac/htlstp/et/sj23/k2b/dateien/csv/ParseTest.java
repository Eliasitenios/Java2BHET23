package at.ac.htlstp.et.sj23.k2b.dateien.csv;

public class ParseTest {

    public static void main(String[] args) {
        String s1 = "5";
        String s2 = "4.7";
        String s3 = "5.8";
        String s4 = "6A";
        int i;
        double d;


        try {
            i = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            i = 0;
        }

        //i = (int)Double.parseDobule(s2);
        d = Double.parseDouble(s2);
        System.out.printf("i=%d, d=%f\n", i, d);


        d = Double.parseDouble(s3.replaceAll(",", "."));
        i = (int) d;
        System.out.printf("i=%d, d=%f\n", i, d);

    try {
        d = Double.parseDouble(s4.replaceAll(",", "."));
    }   catch (NumberFormatException ex) {
        d = 0;
    }
        i = (int)d;
        System.out.printf("i=%d, d=%f\n", i, d);
    }
}

