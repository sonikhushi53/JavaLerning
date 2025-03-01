package oops;


// Overriding is part of polymorphism
/*
 * The word ‘polymorphism’ means ‘having many forms’. In Java, polymorphism refers to the ability of a message to be displayed in more than one form. 
 * This concept is a key feature of Object-Oriented Programming and it allows objects to behave differently based on their specific class type.
 * 
 * Real-life Illustration of Polymorphism in Java: A person can have different characteristics at the same time. Like a man at the same time is a father, a husband, and an employee. So the same person possesses different behaviors in different situations. This is called polymorphism.
 * 
 *
 * We can achive polymorphism by 2 types
 * 1. by overloading - Compile-Time / Static Polymorphism
 * 2. by overriding - Runtime / Dynamic Polymorphism
 * 
 */

//  Overriding
/*
 * Runtime Polymorphism in Java known as Dynamic Method Dispatch. 
 * It is a process in which a function call to the overridden method is resolved at Runtime. 
 * This type of polymorphism is achieved by Method Overriding. 
 * Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. 
 * That base function is said to be overridden.
 * 
 * An overriding method’s access modifier in a subclass can be more permissive (e.g., protected to the public) than the overridden method in the superclass. However, reducing the access level (e.g., making a protected method private) is not allowed and will result in a compile-time error.
 * 
 * 
 * Subtype of Run-Time Polymorphism
 * 
 * Static methods can not be overridden. final member can't be overriden.
 * 
 */

 /*
    * Advantages of Polymorphism
       * Increases code reusability by allowing objects of different classes to be treated as objects of a common class
        * Improves readability and maintainability of code by reducing the amount of code that needs to be written and maintained.
        * Supports dynamic binding, enabling the correct method to be called at runtime, based on the actual class of the object.
        * Enables objects to be treated as a single type, making it easier to write generic code that can handle objects of different types.     

   * Disadvantages of Polymorphism
        * Can make it more difficult to understand the behavior of an object, especially if the code is complex.
        * This may lead to performance issues, as polymorphic behavior may require additional computations at runtime.

  */


  // Parent class
class Student {
     void study() {
        System.out.println("A student studies by reading books.");
    }
    // Student study() {
    //     System.out.println("A student studies by reading books.");
    //     return this;
    // }
}

// Child class 1 - School Student
class SchoolStudent extends Student {
    @Override 
    // @Override is an annotation that tells the compiler that a method is overriding a method from its parent class.
    //  It is not mandatory, but it is highly recommended, If you make a mistake (like a wrong method signature), the compiler will give an error by reading this.
    // If you forget to match the exact method signature, Java won’t silently allow overloading.
    protected void study() {
        System.out.println("A school student studies with textbooks and notes.");
    }
    // SchoolStudent study() {
    //     System.out.println("A school student studies with textbooks and notes.");
    //     return this;
    // }
    // the return type does not have to be exactly the same, but it must be compatible. Java allows Covariant Return Types in method overriding.
    // Need to same in primitive and void but when return object parent return parents object and child return childs object is possible.

}


public class OverridingExample {
    public static void main(String[] args) {
        // Parent class reference

        SchoolStudent es = new SchoolStudent();

        es.study(); 
        

        Student s = new SchoolStudent(); // instance of parent
        // s  
        s.study(); 
        // Calls SchoolStudent's study method why?        
        /* 
            * In java by default every non-static methods in java are virtual functions,
                we not need to use virtual keyword.

            * Virtual Functions: It allows an object of a derived class to behave as if it were an object of the base class. 
            * The derived class can override the virtual function of the base class to provide its own implementation. The function call is resolved at runtime, depending on the actual type of the object.

            * But in c++ we need to use virtual keyword otherwise parent's obj that have memory of child will call method of parent.
         */


        // SchoolStudent s1 = new Student();
    }
}

