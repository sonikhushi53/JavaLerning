package array;

public class ArrayClone {
    public static void main(String[] args) {
        int intArray[] = { 1, 2, 3 };

        int referenceArray[] = intArray; // create a refrence array
        int cloneArray[] = intArray.clone(); 

        // Syntax of cloning 2d array
        // int cloneArray[][] = intArray.clone(); //intArray bhi 2d array hona chahiye

        // will print false as shallow copy is created
        System.out.println("intArray == cloneArray = " +(intArray == cloneArray));


        System.out.println("intArray == referenceArray = " +(intArray == referenceArray)); // true

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }

        /*
         * 
         * Advantages of Java Arrays
            Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).
            Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.
            Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.
         */

         /*
          * Disadvantages of Java Arrays
            Fixed Size: Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
            Type Homogeneity: Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.
            Insertion and Deletion: Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.

          */
    }
    
}
