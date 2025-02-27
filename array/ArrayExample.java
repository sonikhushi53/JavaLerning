package array;

// Arrays in Java - An array is a collection of multiple values of the same data type stored in a single variable.
// Arrays allow sequential storage of elements and provide indexed access (starting from index 0).

public class ArrayExample {
    public static void main(String[] args) {
        // 1️ Declaring and Initializing an Array

        /*
         * 
         * Method 1:
            type var-name[];



            Method 2:
            type[] var-name;

            // allocating memory to array 
            intArray = new int[20]; // 20*4 = 80   


            // combining both statements in one 
            int[] intArray = new int[20]; 
         */
        int[] numbers = {10, 20, 30, 40, 50};  // Array of integers

        int[] n = new int[5];

        // int i,arr[],n;
        // int[] arr3, arr2;

        // 2️ Accessing Array Elements using Index
        System.out.println("First element: " + numbers[0]);  // Accessing first element (index 0)
        System.out.println("Second element: " + numbers[1]); // Accessing second element (index 1)

        System.out.println(numbers);

        // numbers[6] = 89;

        // n[6] = 89;

        // 3️ Using a Loop to Print All Elements
        System.out.println("All elements in the array:");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number["+i+"] = " + numbers[i]);  // Printing each element
        }

        // 4 Using a foreach Loop to Print All Elements
        System.out.println("All elements in the array:");
        for (int ele:numbers) {
            System.out.println(ele);  // Printing each element
        }

        /*
         * 
         * The elements in the array allocated by new will automatically be initialized to zero (for numeric types),
         *  false (for boolean), or null (for reference types).
         * 
         * 
         * 
         * In Java, all arrays are dynamically allocated.
            Arrays may be stored in contiguous memory [consecutive memory locations].
            Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using size of.
            A Java array variable can also be declared like other variables with [] after the data type.
            The variables in the array are ordered, and each has an index beginning with 0.
            Java array can also be used as a static field, a local variable, or a method parameter.
         */

         /*
          * What happens if we try to access elements outside the array size?

          * JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index. 
            The index is either negative or greater than or equal to the size of an array.
          */
    }
}

