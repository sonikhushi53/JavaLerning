import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        int arr[][] = new int[5][4];
        // int arr[][] = {{1,3,5},{54,6},{78,26,9,44,2}}; can create aaray with differ column lenght in each row
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> table = new ArrayList<>();
        table.add(new ArrayList<>(Arrays.asList(1, 2, 3)));   // Row 1 with 3 columns
        table.add(new ArrayList<>(Arrays.asList(4, 5)));      // Row 2 with 2 columns
        table.add(new ArrayList<>(Arrays.asList(6, 7, 8, 9))); // Row 3 with 4 columns


        // Input array from user
        // System.out.println(arr[3].length);
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.println("Enter value for arr["+i+"]["+j+"] = ");
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // Output array from user
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) { // arr[i].lenght = find number of column in that row
        //         System.out.println("Enter value for arr["+i+"]["+j+"] = " + arr[i][j]);
        //         System.out.print("  ");
        //     }
        //     System.out.println("");
        // }

       // Traversing the list
        for (ArrayList<Integer> row : table) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }


        // Agar column value phle se nhi memory dena chahte to 
        // int[][] table = new int[3][]; // 3 rows, each row will have a different number of columns

        // // Initialize each row with different column sizes
        // table[0] = new int[] {1, 2, 3};   // Row 1 with 3 columns
        // table[1] = new int[] {4, 5};      // Row 2 with 2 columns
        // table[2] = new int[] {6, 7, 8, 9}; // Row 3 with 4 columns

        
    }
}
