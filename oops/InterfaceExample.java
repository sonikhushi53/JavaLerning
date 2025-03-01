package oops;

// An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behavior. A Java interface contains static constants and abstract methods.

// private method never used warning
// Only default method can have body in interface, by default methods are public abstract.
/*
 * The interface in Java is a mechanism to achieve abstraction.
 * By default, variables in an interface are public, static, and final.
 * It is used to achieve abstraction and multiple inheritances in Java.
 * It is also used to achieve loose coupling.
 * In other words, interfaces primarily define methods that other classes must implement.
 * An interface in Java defines a set of behaviors that a class can implement, usually representing an IS-A relationship, but not always in every scenario.
 */

//  In Java, the abstract keyword applies only to classes and methods, indicating that they cannot be instantiated directly and must be implemented. When we decide on a type of entity by its behaviour and not via attribute we should define it as an interface.

// A class can extend another class, and similarly, an interface can extend another interface. However, only a class can implement an interface, and the reverse (an interface implementing a class) is not allowed.

// Without bothering about the implementation part, we can achieve the security of the implementation by using interface.

interface Demo {
    // Demo(){} // Can't have constructor
    // String name2; // give error need to intialize 

    // only one of abstract, default, or static permitted at once
    default void show(){ 
        /*
         * Interfaces can define methods with default implementations.
         * Useful for adding new methods to interfaces without breaking existing implementations.
         * Added after jdk 8
         */
        System.out.println("Hello, this is show method in interface.");
    }

    static void hellostatic(){
        System.out.println("Static method");
    }

    String name = "Axixa";

    void ab();
}


class ABC implements Demo{
    void ABCShow(){
        show();
    }
    public void ab(){}
}

public class InterfaceExample {
    public static void main(String[] args) {
        // Demo.name = "";
        System.out.println("Name is -: "+ Demo.name);
        ABC obj = new ABC();
        obj.ABCShow();
        Demo.hellostatic();

    }
    
}


// real life senario of interface (can skip)
/*
 * Create interface for payment process and implement in differ class of payment like paypal, stripe and than use that for customer and admin and for other purpose directly without rewrite code sepratly.
 */
