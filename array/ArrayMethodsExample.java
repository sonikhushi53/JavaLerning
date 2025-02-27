package array;

import java.util.Arrays;  // Importing Arrays class for built-in methods
// Java provides some in-built methods for array operations, mainly through the Arrays class in java.util package.

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // 1️ Declaring and Initializing an Array
        int[] numbers = {50, 10, 40, 20, 30};

        // 2️ Printing the Original Array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // 3️ Sorting the Array
        Arrays.sort(numbers);  // Sorts the array in ascending order
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 100 n //worst case
        // n/2 // 100 ele - 50index 
        // 4️ Searching an Element in the Array (Binary Search)
        int searchKey = 20;
        int index = Arrays.binarySearch(numbers, searchKey);  // Binary search (works only on sorted arrays)
        if (index >= 0) {
            System.out.println(searchKey + " found at index " + index);
        } else {
            System.out.println(searchKey + " not found in the array.");
        }

        // 5️ Filling the Array with a Specific Value
        int[] filledArray = new int[5];  // New array with default values (0)
        Arrays.fill(filledArray, 100);  // Fills all elements with 100
        System.out.println("Array after fill(): " + Arrays.toString(filledArray));

        // 6️ Copying an Array (Using Arrays.copyOf())
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);  // Copies full array

        int[] copiedArray2 = Arrays.copyOf(numbers, 3);  // Copies full array


        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
        System.out.println("Copied Array2: " + Arrays.toString(copiedArray2));


        // 7️ Checking if Two Arrays are Equal
        boolean isEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are original and copied arrays equal? " + isEqual);


        // Arrays.toString(array) → Converts array to a readable string.
        // Arrays.sort(array) → Sorts the array in ascending order.
        // Arrays.binarySearch(array, key) → Searches for a key (only works on sorted arrays).
        // Arrays.fill(array, value) → Fills the entire array with a specified value.
        // Arrays.copyOf(original, length) → Creates a new array by copying elements.
        // Arrays.equals(array1, array2) → Compares two arrays for equality.
    }
}

