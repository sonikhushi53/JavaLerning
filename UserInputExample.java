// Importing Scanner class from java.util package

/*
 * In Java, we use the Scanner class from the java.util package to take input from the user.
It allows us to read integers, floating-point numbers, strings, and more from the keyboard.
 */
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Creating Scanner object to read input from System.in (keyboard)
        Scanner sc = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // Reads an integer

        // Taking double input
        System.out.print("Enter a decimal number: ");
        double decimal = sc.nextDouble();  // Reads a double

        // Taking string input (single word)
        System.out.print("Enter a single word: ");
        String word = sc.next();  // Reads a single word (without spaces)

        // Taking full-line string input
        sc.nextLine(); // Consumes the leftover newline character
        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine();  // Reads the entire line (including spaces)

        // Displaying the user inputs
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + num);
        System.out.println("Decimal Number: " + decimal);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);

        // Closing the Scanner to prevent memory leaks
        sc.close();
    }
}
