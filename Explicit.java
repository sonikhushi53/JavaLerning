// Java Program to demonstrate Narrow type casting 
import java.io.*; 
  
class Explicit { 
    public static void main(String[] args) 
    { 
        double i = 100.245; 
  
        // Narrowing Type Casting 
        short j = (short)i; 
        int k = (int)i; 
  
        System.out.println("Original Value before Casting"
                           + i); 
        System.out.println("After Type Casting to short "
                           + j); 
        System.out.println("After Type Casting to int "
                           + k); 

        System.out.println(Integer.SIZE);
    } 
}
