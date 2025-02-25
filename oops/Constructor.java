package oops;

class ABC{
    // void add to make it method
    protected ABC(){
        System.out.println("ABC Constructor is created.");
    }

}

public class Constructor {

    public static void main(String[] args) {
        // All classes have at least  one  constructor. If a class does not explicitly declare any, the Java compiler automatically provides a no-argument constructor, also called the default constructor. This default constructor calls the class parent’s no-argument constructor (as it contains only one statement i.e super();), or the  Object  class constructor if the class has no other parent (as the Object class is the parent of all classes either directly or indirectly)

        /*
         * Called when object created using the new() keyword
         *  used to initialize objects
         * Constructors must have the same name as the class
         * Constructors do not return any type even we can't write void keyword also, if we do that consider as a normal method not constructor
         * 
         * Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
         * 
         * A constructor in Java can not be abstract, final, static, or Synchronized.
         * 
         * Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
         * 
         * The default constructor can be implicit or explicit.
         * 
         * Default constructor provides the default values to the object like 0, null, etc. depending on the type.
         * 
         *  There are no “return value” statements in the constructor, but the constructor returns the current class instance. We can write ‘return’ inside a constructor. 
         */

        //  ABC ab; 
         ABC ab = new ABC();
          
    }
}
