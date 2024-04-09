package feldmethoden;


public class FeldMethoden {
    public static void printArrayln(String prefix, double[] feld) {
        printArrayln(prefix, feld, "");
    }

    public static void printArrayln(String prefix, double[] feld, String suffix) {
        System.out.print(prefix);
        for (int i = 0; i < feld.length; i++)
            System.out.print((i == 0 ? "" : ",") + feld[i]);
        System.out.println(suffix);
    }

    public static double sum(double[] f) {
        double sum = 0;
        for (int i = 0; i < f.length; i++)
            sum += f[i];
        return sum;
    }

    /**
     * Es soll an das Feld f ein Wert x angehängt werden
     * @param f altes Feld
     * @param x Wert
     * @return neues Feld mit f und x
     */

    public static double[] push(double[] f, double x){
        double[]result=new double[f.length+1];
        for (int i=0;i<f.length;i++)
            result[i]=f[i];
        result[result.length-1]=x;
        return result;
    }
}
