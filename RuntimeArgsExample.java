/*
 * Runtime arguments (also called command-line arguments) are the inputs passed to a Java program when it is executed from the command line or terminal. 
 * These arguments are stored in the String[] args parameter of the main method.
 * 
 * Need to be converted (Integer.parseInt(), Double.parseDouble()) when using numbers.
 * 
 *
 *  Real-World Use Cases :- Running Batch Processing, Automating Scripts with different parameters etc.
 * 
 * 
 */

 /*
  * In Java, parseInt() and parseDouble() are used to convert String values to numbers.
  *  If you try to convert a non-numeric string, it will throw a NumberFormatException.
  * 
  */
public class RuntimeArgsExample {
    public static void main(String[] args) {
        // Integer.parseInt()
        System.out.println("You entered " + args.length + " arguments.");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
