package at.ac.htlstp.et.sj23.k2b.dateien.csv;

import java.util.Arrays;
import java.util.Vector;

public class Magnetisierungskennlinie {

    public static Vector<double[]> load(String filename, String material) {
        return null;
    }

    public static void main(String[] args) {
        Vector<double[]> kennlinie = load(Magnetisierungslinie.CSVFILE, "Dyn III");{
            for (double[] wertepaar : kennlinie)
                System.out.println(Arrays.toString(wertepaar));
        }
    }
}

