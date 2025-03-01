package oops;

// to prevent inheritance
final class Vehicle { 
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle { //  Error! Can't extend final class
}

public class finalClass {
    public static void main(String[] args) {
        
    }
}
