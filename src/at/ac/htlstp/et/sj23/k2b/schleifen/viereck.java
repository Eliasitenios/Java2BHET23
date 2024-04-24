package at.ac.htlstp.et.sj23.k2b.schleifen;

import java.util.Scanner;

/**
 * Schreibe eine prozedurale Methode "paintQuadrat" welche ein Quadrat aus +-| auf den Bildschirm zeichnet.
 *
 * Die Größe des Quadrats soll dabei als Parameter übergeben werden.
 *
 * Methode:
 *
 * public static void paintQuadrat(int size)
 * Ausgabe für size=4:
 *
 * +----+
 * |    |
 * |    |
 * |    |
 * |    |
 * +----+
 */

public class viereck {

    /**
     * Zeichnet die Linien
     * @param size des Vierecks
     * @param rand außenzeichen
     * @param innen innenzeichen
     */

    public static void vLinie(int size,char rand,char innen) {
        System.out.print(rand);
        for (int i=0;i<size;i++)
            System.out.print(innen);
        System.out.println(rand);
    }

    /**
     *gibt zeichen dazu
     * @param size größe des vierecks
     */

    public static void paintQuadrat(int size) {
        vLinie(size,'+','-');
        for (int i=0;i<size;i++)
            vLinie(size,'|',' ');
        vLinie(size,'+','-');
    }

    public static void main(String[] args) {
        int size = 4;
        paintQuadrat(size);
    }
}

