package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // User inputs array size

        int[] arr = new int[n]; // Array creation
        // Taking input for array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // arr[7] = 9; // lenght is 4
        // When assign value for arr[5], [7] it generate "java.lang.ArrayIndexOutOfBoundsException" run time

        

        // for (int i : arr) {
            System.out.println("\n\n"+Arrays.toString(arr));
        // }
    }
}