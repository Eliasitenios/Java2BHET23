package at.ac.htlstp.et.sj23.k2b.oop;

/**
 *
 */

public class Complex {

    public static final double TOLERANCE = 1e-6;

    /** Realteil der Zahl */
    private final double re;


    /** Imaginärteil der Zahl */
    private final double im;

    /**
     * Erzeugt eine komplexe Zahl aus Real und Imaginärteil
     * @param re
     * @param im
     */

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Erzeugt eine komplexe Zahl mit Imaginärteil 0
     * @param re Realteil
     */

    public Complex(double re) {
        this(re,0);
    }

    /**
     * Erzeugt eine komplexe Zahl aus Betrag und Winkel in Grad oder Radiant
     * @param abs Betrag
     * @param arg Winkel
     * @param radiant true für Rad und false für Grad
     */

    public Complex(double abs,double arg, boolean radiant) {
        this(abs*Math.cos(arg*(radiant?1.:Math.PI/100)), abs*Math.sin(arg*(radiant?1.:Math.PI/100)) );
    }


    /**
     * Statischer Konstrukter der eine komplexe Zahl aus Betrag und Winkel erzeugt
     * @param abs Betrag
     * @param arg Winkel in Radianten
     * @return  komplexe Zahl
     */



    public static Complex createVersor(double abs, double arg) {
        double re = abs*Math.cos(arg);
        double im = abs*Math.sin(arg);
        Complex result = new Complex(re,im);
        return result;
    }

    @Override
    public String toString() {
        return re+"+"+im+"j";
    }

    public double getRe() {
        return re;
    }

    public Complex setRe(double re) {
        return new Complex(re, im);
    }

    public double getIm() {
        return im;
    }

    public Complex setIm(double im) {
        return new Complex(re, im);
    }

    public double getAbs() {
        return Math.sqrt(re * re + im * im);
    }

    public double getArg() {
        return Math.atan2(im, re);
    }

    public Complex setAbs(double abs) {
        double v = abs/getAbs();
        return new Complex(re * v, im * v);
    }

    /********************************************************************************
     * Berechnungsmethoden
     ********************************************************************************/

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);

    }
    public Complex add(double r) {
        //return new Complex(re + r, im);
        return add(this,r);
    }

    public static Complex add(Complex c1, Complex c2) {
        //return new Complex(c1.re + c2.re, c1.im + c2.im);
        return c1.add(c2);
    }

    public static Complex add(Complex c1, double r) {
        return new Complex(c1.re + r, c1.im);
    }

    public Complex neg() {
        return new Complex(-re, -im);
    }

    public Complex sub(Complex c) {
        return add(c.neg());
    }

    /*public Complex mul(Complex c) {
        return createVersor(getAbs()*c.getAbs(), getArg() + c.getArg())
    }*/

    public Complex mul(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    public Complex inv() {
        double N = re * re + im * im;
        return new Complex(re / N, -im / N);
    }

    public Complex div(Complex c) {
        return mul(c.inv());
    }

    public boolean equals(Complex c) {
        double s = Math.max(getAbs(),c.getAbs())*TOLERANCE;
        return (Math.abs(re-c.re)<s && Math.abs(im-c.im)<s);
    }

}