package vectors;

// What is a Vector in Java?

/*
 Vector is a dynamic array that can grow or shrink in size automatically.
 * 
 * 
 It is part of the java.util package and implements the List interface.
 * 
 * Can store null elements.
 Unlike arrays, vectors are synchronized, meaning they are thread-safe for concurrent access.
 * 
 * They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.
 * 
 * It also maintains an insertion order like an ArrayList. Still, it is rarely used in a non-thread environment as it is synchronized, and due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
 * 
 * The Iterators returned by the Vector class are fail-fast. In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
 */

import java.util.Vector;  // Importing Vector class

public class VectorExample {
    public static void main(String[] args) {
        // 1️ Creating a Vector (Dynamic Array)

        // Creating a Vector with Initial Capacity of 3
        // Vector<Integer> numbers = new Vector<>(3);
        // Printing Initial Size and Capacity
        // System.out.println("Initial Capacity: " + numbers.capacity());

        Vector<Integer> numbers = new Vector<>();  
        Vector<Integer> numbers2 = new Vector<>();  

        System.out.println("Initial Capacity: " + numbers.capacity());
        // 2️ Adding Elements to the Vector
        numbers.add(10);  // Adds 10 at index 0
        numbers.add(20);  // Adds 20 at index 1
        numbers.add(30);  // Adds 30 at index 2
// numbers.addAll(0, numbers);

        System.out.println("Vector after adding elements: " + numbers);

        // 3️ Accessing Elements Using Index
        System.out.println("Element at index 1: " + numbers.get(1));  // Retrieves element at index 1

        // 4️ Updating an Element
        numbers.set(1, 25);  // Updates element at index 1 to 25
        System.out.println("Vector after updating index 1: " + numbers);

        // 5️ Removing an Element
        numbers.remove(2);  // Removes the element at index 2
        System.out.println("Vector after removing index 2: " + numbers);

        // 6️ Checking Vector Size
        System.out.println("Current size of vector: " + numbers.size());

        // 7️ Iterating Over a Vector
        System.out.println("Iterating over Vector:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

