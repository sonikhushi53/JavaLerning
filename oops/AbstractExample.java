package oops;
// In Java, abstract class is declared with the abstract keyword. 
// It may have both abstract and non-abstract/Concrete methods(methods with bodies). 
// An abstract is a Java modifier applicable for classes and methods in Java but not for Variables.


// Abstract Class : Java abstract class is a class that can not be instantiated by itself, it needs to be subclassed by another class to use its properties.
// Can have constructor(Called by child object), final and static members, but final and static method can't be abstract.

/*
 * An instance of an abstract class can not be created.
 *Constructors are allowed.
*We can have an abstract class without any abstract method.
*There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
*We can define static methods in an abstract class
*We can use the abstract keyword for declaring top-level classes (Outer class) as well as inner classes as abstract
*If a class contains at least one abstract method then compulsory should declare a class as abstract 
*If the Child class is unable to provide implementation to all abstract methods of the Parent class then we should declare that Child class as abstract so that the next level Child class should provide implementation to the remaining abstract method.
 */

abstract class Vehicle {
    Vehicle() { // Constructor in abstract class
        System.out.println("Vehicle is created");
    }
    
    void msg(){

    }
    
    abstract void run(); // Abstract method

    // abstract static void run(); // Abstract method

}

class Car extends Vehicle {
    // When we extends a abstrct class with abstract menthod, than it must to implement 
    // all abstract methods in child or make child abstract, so that the next level Child class should provide implementation
    void run() {
        System.out.println("Car is running...");
    }
}
public class AbstractExample {

    // abstract void n(); 
    // If a class have a single abstract method than class need to be abstract 
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); // can't intiate
        Car myCar = new Car(); //  Calls Vehicle constructor first
        myCar.run();
    }
    
}
