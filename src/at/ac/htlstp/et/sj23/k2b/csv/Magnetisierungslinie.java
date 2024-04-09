package at.ac.htlstp.et.sj23.k2b.csv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Magnetisierungslinie {

    public static final String CSVFILE = "data/Magnetisierungslinie.csv";

    public static void main(String[] args) {
        Vector<double[]> kennlinie = new Vector<>();
        try {
            // Dateien einlesen
            List<String> data = Files.readAllLines(new File(CSVFILE).toPath());
            // Daten in Spalten zerteilen
            for (String line : data) {
                String[] spalten = line.split(";");
                try {
                    String sH = spalten[0];
                    String sBdyn3 = spalten[3];
                    //System.out.println("H="+sH+" B="+sBdyn3);
                    //Parsen der Werte
                    double[] wertepaar = new double[2];
                    try {
                        wertepaar[0] = Double.parseDouble(sH.replaceAll(",","."));
                        wertepaar[1] = Double.parseDouble(sBdyn3.replaceAll(",","."));
                        kennlinie.add(wertepaar);
                    } catch(NumberFormatException ex) {}
                } catch (ArrayIndexOutOfBoundsException e1) { }
            }
        } catch (IOException e) {
            System.out.println("Datei "+CSVFILE+" kann nicht gelesen werden!"); 
        }
        System.out.println("Kennlinie:");
        for (double[] wertepaar : kennlinie)
            System.out.println(Arrays.toString(wertepaar));
    }
}
