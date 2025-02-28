// What is a Wrapper Class?
/*
 * A wrapper class in Java is used to convert primitive data types (int, char, double, etc.) into objects.
This is useful when Java requires objects instead of primitives, such as in collections (ArrayList, Vector, etc.).
 * 
 */


//  Why Do We Need Wrapper Classes?
 /*
  * 
Primitives Cannot Be Used in Collections

Java collections like ArrayList, Vector only store objects, not primitives.
Conversion Between Primitives and Objects

Sometimes, we need an object representation of primitive values.
Helpful in Utility Methods

Many utility methods work only with objects, so wrapper classes help.

An object is needed to support synchronization in multithreading.
  */

// Below wrapper class for primitive datatype
/*
 *  byte → Byte
  	short → Short
    int → Integer	
    long → Long
    float → Float	
    double → Double
    char → Character	
    boolean → Boolean
 */




public class wrapperClass {
    
    public static void main(String[] args) {
        int num = 10;  // Primitive type
        // Wrapperclass.valueOf(primitivedatatype value or variable)
        // Integer obj = Integer.valueOf(num);  // Boxing: Converting primitive to object 

        Integer obj = num; // Also done automatically, called autoboxing also
        
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapper Integer object: " + obj);


        // object_of_wrapper_Class.<primitive_datatype>Value();
        Integer obj2 = 20;  // Wrapper object
        int num2 = obj.intValue();  // Unboxing: Converting object to primitive

        Float fobj = 9.7f;
        float fnum = obj.floatValue();
        // int num2 = obj2; // Also done automatically, called autounboxing also
        
        System.out.println("Wrapper Integer object: " + obj2);
        System.out.println("Primitive int: " + num2);

        /*
         * Wrapper classes allow primitive types to be used as objects.
            // ✔ Boxing → Convert primitive → Wrapper class object (Integer.valueOf(10)).
            // ✔ Unboxing → Convert Wrapper class object → Primitive (obj.intValue()).
            // ✔ AutoBoxing & AutoUnboxing makes it easy (Java automatically converts).
            // ✔ Used in collections, utility functions, and object-oriented programming.
         */

        //  Some fields with wrapper class and not for privitive datatype

        System.out.println("float.type : " + Float.SIZE); // size in bits

        System.out.println("Wrapperobj.type : " + obj2.TYPE); // type of wrapper class
        System.out.println("Wrapperobj.MIN_VALUE : " + obj2.MIN_VALUE); //
        System.out.println("Wrapperobj.MAX_VALUE : " + obj2.MAX_VALUE);
        System.out.println("Wrapperobj.SIZE : " + obj2.SIZE);


        /*
         * Advantages of Wrapper Classes
          Collections allow only object data.
          On object data we can call multiple methods compareTo(), equals(), toString()
          The cloning process only works on objects
          Object data allows null values.
          Serialization allows only object data.
         */

    }
}
