package at.ac.htlstp.et.sj23.k2b.hues.hue4bsp2;

/**
 * Schreibe die Methoden "isPos","isNeg","isNull" welche prüfen ob eine double Zahl positiv, negativ oder null ist. Das Ergebnis soll true oder false sein!
 */

public class Hue4Bsp2 {

        /**
         * Prüft ob Positiv.
         *
         * @param number Die zu überprüfende Zahl.
         * @return true, wenn die Zahl positiv ist, sonst false.
         */
        public static boolean isPos(double number) {
            return number > 0;
        }

        /**
         * Prüft ob negativ.
         *
         * @param number Die zu überprüfende Zahl.
         * @return true, wenn die Zahl negativ ist, sonst false.
         */
        public static boolean isNeg(double number) {
            return number < 0;
        }

        /**
         * Prüft ob null.
         *
         * @param number Die zu überprüfende Zahl.
         * @return true, wenn die Zahl null ist, sonst false.
         */
        public static boolean isNull(double number) {
            return number == 0;
        }

        public static void main(String[] args) {
            // Beispielverwendung:
            double testNumber = 42.0;

            System.out.println(testNumber + " ist positiv: " + isPos(testNumber));
            System.out.println(testNumber + " ist negativ: " + isNeg(testNumber));
            System.out.println(testNumber + " ist null: " + isNull(testNumber));
        }
    }

