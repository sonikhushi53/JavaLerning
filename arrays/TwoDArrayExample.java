package array;

// 2D Array Example - Matrix Representation

public class TwoDArrayExample {
    public static void main(String[] args) {
        // 1️ Declaring and Initializing a 2D Array (Matrix)

        // int[][] matrix;

        // int[][] matrix = new int[5][3]; //5*3 =15

        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        // 2️ Printing the 2D Array
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {  // Rows
            for (int j = 0; j < matrix[i].length; j++) {  // Columns
                System.out.print(matrix[i][j] + " ");  // Print each element
            }
            System.out.println();  // Move to the next line
        }
    }
}

