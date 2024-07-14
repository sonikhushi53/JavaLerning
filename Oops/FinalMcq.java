package Oops;
final class Complex {

    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // It is magic method like php, called when we print object
    public String toString() {
        return  (re + " + " + im + "i");
    }
}

class FinalMcq {
  public static void main(String args[])
  {
       Complex c = new Complex(10, 15);
       System.out.println("Complex number is " +c);
  }
}