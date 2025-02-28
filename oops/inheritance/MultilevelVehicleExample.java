package oops.inheritance;

/*
 * In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes. 
 * In the below image, class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. 
 * In Java, a class cannot directly access the grandparent’s members by super.
 */
// Parent class (Base class)
class Vehicle {
    Vehicle(){
        System.out.println("Vehicle constructor called");
    }
    protected void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class (Inherits from Vehicle)
class Car extends Vehicle {
    Car(){
        System.out.println("Car constructor called");
    }
    void drive() {
        System.out.println("Car is driving...");
    }
}

// Grandchild class (Inherits from Car)
class SportsCar extends Car {
    SportsCar(){
        System.out.println("SportsCar constructor called");
    }
    void turboBoost() {
        System.out.println("SportsCar activates turbo boost!");
    }
}

// Main class
public class MultilevelVehicleExample {
    public static void main(String[] args) {
        // Creating an object of SportsCar class
        SportsCar myCar = new SportsCar();

        // Calling methods from all three classes
        myCar.start();       // Inherited from Vehicle class
        myCar.drive();       // Inherited from Car class
        myCar.turboBoost();  // Defined in SportsCar class
    }
}

