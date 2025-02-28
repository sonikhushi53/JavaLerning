package oops.inheritance;

/*
 * 
 * Java, Inheritance is an important pillar of OOP(Object-Oriented Programming). 
 * It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. 
 * In Java, Inheritance means creating new classes based on existing ones. 
 * A class that inherits from another class can reuse the methods and fields of that class.
 *  In addition, you can add new fields and methods to your current class as well.
 */

//  Why Do We Need Java Inheritance?
/*
 * Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.
 * Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves Run Time Polymorphism.
 * Abstraction: The concept of abstract where we do not have to provide all details, is achieved through inheritance. Abstraction only shows the functionality to the user.
 * 
 */

//  Terminologies
/*
 * Class: Class is a set of objects which shares common characteristics/ behavior and common properties/ attributes. Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
 * 
 * Super Class/Parent Class: The class whose features are inherited is known as a superclass(or a base class or a parent class).
 * 
 * Sub Class/Child Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
 * 
 * Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
 * 
 */



// What Can Be Done in a Subclass?
/*
 * In sub-classes we can inherit members as is, replace them, hide them, or supplement them with new members: 
 * 
 * The inherited fields can be used directly, just like any other fields.
 * 
 *  We can declare new fields in the subclass that are not in the superclass.
 * The inherited methods can be used directly as they are.
 * We can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it (as in the example above, toString() method is overridden).
 * We can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
 * We can declare new methods in the subclass that are not in the superclass.
 * We can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.
 */


 // Parent class (Super class)
class Animal {
    // Method in the parent class
    void makeSound() {
        System.out.println("Animals make different sounds!");
    }
}

// Child class (Sub class) inheriting from Animal
class Dog extends Animal {
    // Method in the child class
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

class Cat extends Animal{
    void meow(){

    }
}

// Single level
// Multi level 
/*
 * a
 * |
 * b
 * |
 * c
 */

//  Hirarchical inheritance
/*
 *      animal
 *    /         \
 * dog           cat
 *  /\            /\
 * puppy
 */


//  Hybrid inheritance

// multiple 
/*
 * In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes. 
 * Please note that Java does not support multiple inheritances with classes. 
 * In Java, we can achieve multiple inheritances only through Interfaces.
 */
public class SingleLevel {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog myDog = new Dog();

        // Calling methods of both parent and child class
        myDog.makeSound();  // Inherited from Animal class
        myDog.bark();       // Defined in Dog class
    }
}
