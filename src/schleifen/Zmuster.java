package schleifen;


/**
 * Schreibe eine prozedurale Methode "paintZ" welche ein großes Z wie angegeben auf den Bildschirm zeichnet.

 * Die Größe des Buchstabens soll dabei als Parameter übergeben werden.

 * Methode:

 * public static void paintZ(int size)
 * Ausgabe für size=4:

 * ---->
 *    /
 *   /
 *  /
 * <----
 *
 */

public class Zmuster {
    public static void main(String[] args) {
        paintZ(4);

    }

    /**
     * gibt ein z in der größe size aus
     * @param size größe vom z
     */

    public static void paintZ(int size){
        for (int x =1;x<=size;x++){
            System.out.print("-");
        }
        System.out.println(">");
        for (int y=1;y<=size-1;y++){
            for (int w=1;w<=size-y;w++){
                System.out.print(" ");

            }
            System.out.println("/");
        }
        System.out.print("<");
        for (int x =1;x<=size;x++){
            System.out.print("-");
        }
        System.out.println(" ");


    }
}