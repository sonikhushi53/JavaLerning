package oops.inheritance;

/*
 * In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass. 
 * In the below image, class A serves as a base class for the derived classes B, C, and D.
 */
// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class 1 (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child Class 2 (inherits Animal)
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main Class
public class HierarchicalExample {
    public static void main(String[] args) {
        // Creating Dog object
        Dog myDog = new Dog();
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Dog's own method

        System.out.println("----------------");

        // Creating Cat object
        Cat myCat = new Cat();
        myCat.eat(); // Inherited from Animal
        myCat.meow(); // Cat's own method
    }
}

