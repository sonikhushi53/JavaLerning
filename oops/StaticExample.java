package oops;

//Static members
/*
 * 
 * The static keyword in Java is mainly used for memory management. 
 * The static keyword in Java is used to share the same variable or method of a given class. 
 * The users can apply static keywords with variables, methods, blocks, and nested classes. 
 * The static keyword belongs to the class rather than an instance of the class. 
 * The static keyword is used for a constant variable or a method that is the same for every instance of a class.
 * 
 *  super and this cannot be used in a static context
 * 
 * If a class have static block it is executed first no relate to object of class
 */
public class StaticExample {

    // When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.

    // We can create static variables at the class level only. See here

    // static block and static variables are executed in the order they are present in a program.
    /*
     * First m1() is called and after that static block will be exectuted
     *   static int a = m1();
    
        // static block
        static {
            System.out.println("Inside static block");
        }

        // static method
        static int m1() {
            System.out.println("from m1");
            return 20;
        }
     */

    static String name = "Axixa";
    String msg;
    StaticExample(){
        System.out.println("constructor called");
    }
    
    static {
        System.out.println("Static block initialized. ");
    }


    static void getValue(){
        // System.out.println(msg); // can't use non-static properties in static method
        System.out.println("Name is - "+ name);   
    }

    void setVal(String name, String msg){
        // StaticExample.name = name;
        // this.name = name; // it give warning when access static property with object and this keyword
        this.msg = msg;
    }
    void getVal(){
        System.out.println("name is -:" + name);
        System.out.println("msg is -:" + msg);

    }
    // Static methods
    /*
     * When a method is declared with the static keyword, it is known as the static method. The most common example of a static method is the main( ) method. As discussed above, Any static member can be accessed before any objects of its class are created, and without reference to any object. Methods declared as static have several restrictions:
     * 
     * They can only directly call other static methods.
     * 
     * They can only directly access static data.
     * 
     * They cannot refer to this or super in any way.
     */

    public static void main(String[] args)
    {
        StaticExample se = new StaticExample(); 
        StaticExample se2 = new StaticExample();
        
        StaticExample.getValue(); 

    //    System.out.println("from main");

    //    se.setVal("ABC", "Hello"); 
    // //    se2.setVal("ABC", "Hello");

    //     se.getVal();
    //     se2.getVal();

    //     StaticExample.name = "XYZ";
    //     se2.getVal();
       
    //    System.out.println("Value of a : "+a);
    //    System.out.println("Value of b : "+b);

    }
}


// Advantages 
/*
 * Memory efficiency: Static members are allocated memory only once during the execution of the program, which can result in significant memory savings for large programs.
 * Improved performance: Because static members are associated with the class rather than with individual instances, they can be accessed more quickly and efficiently than non-static members.
 * Global accessibility: Static members can be accessed from anywhere in the program, regardless of whether an instance of the class has been created.
 * Encapsulation of utility methods: Static methods can be used to encapsulate utility functions that don’t require any state information from an object. This can improve code organization and make it easier to reuse utility functions across multiple classes.
 * Constants: Static final variables can be used to define constants that are shared across the entire program.
Class-level functionality: Static methods can be used to define class-level functionality that doesn’t require any state information from an object, such as factory methods or helper functions.
 */
