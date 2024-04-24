package at.ac.htlstp.et.sj23.k2b.dateien;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Einmaleins {
    public static final String OUT = "data/einmaleins.txt";
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        System.out.print("Zahl:");
        int x = sc.nextInt();
        for (int i=1;i<=10;i++)
            data.add(i+" * "+x+" = "+(i*x));
        Files.write((new File(OUT)).toPath(),data);
    }
}
