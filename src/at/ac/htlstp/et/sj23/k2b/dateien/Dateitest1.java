package at.ac.htlstp.et.sj23.k2b.dateien;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Dateitest1 {

    public static final String TEST1 = "data/test1.txt";
    public static final String OUT   = "data/out.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(TEST1);
        List<String> data;
        if (file.exists()) {
            // Datei lesen
            data = Files.readAllLines(file.toPath());
            // Datei verarbeiten -> groß schreiben
            for (int i=0;i<data.size();i++) {
                String line = data.get(i);
                line = line.toUpperCase();
                data.set(i,line);
            }
            // Datei speichern
            File outfile = new File(OUT);
            Files.write(outfile.toPath(),data);
        } else {
            System.out.println("Datei existiert nicht!");
        }
    }
}
