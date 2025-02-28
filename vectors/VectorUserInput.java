package vectors;

import java.util.Scanner;  // Import Scanner for user input
import java.util.Vector;   // Import Vector class

public class VectorUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object
        Vector<Integer> numbers = new Vector<>(3);  // Create a Vector to store numbers

        // int num[] = {1,22,33}; 
        // int nums[] = Integer.valueOf(num);

        // int n = 8;
        // numbers.add(n); can add like this

        // numbers = n;  //Give error of mismatch type - can't convert int to vector<Integer>

        
        // System.out.println(numbers);
        System.out.print("Enter the number of elements you want to add: ");

        int count = scanner.nextInt();  // User defines how many numbers to input

        System.out.println("Capacity by default "+ numbers.capacity());
        // int count = 10;

        // Taking input from user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i ) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);  // Adding number to the vector
        }

        // Displaying the elements of the vector
        System.out.println("\nNumbers entered in Vector: " + numbers);

        // Calculating the sum of all elements
        // int sum = 0;
        // for (int num : numbers) {
        //     sum += num;
        // }
        // System.out.println("Sum of all numbers: " + sum);

        scanner.close();  // Close the scanner
    }
}

