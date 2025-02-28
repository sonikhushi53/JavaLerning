package oops.inheritance;

/*
 * It is a mix of two or more of the above types of inheritance. 
 * Since Java doesn’t support multiple inheritances with classes, hybrid inheritance involving multiple inheritance is also not possible with classes. 
 * In Java, we can achieve hybrid inheritance only through Interfaces if we want to involve multiple inheritance to implement Hybrid inheritance.
 * However, it is important to note that Hybrid inheritance does not necessarily require the use of Multiple Inheritance exclusively. 
 * It can be achieved through a combination of Multilevel Inheritance and Hierarchical Inheritance with classes, Hierarchical and Single Inheritance with classes. 
 * Therefore, it is indeed possible to implement Hybrid inheritance using classes alone, without relying on multiple inheritance type. 
 * 
 * 
 * 
 */

 // Base class
class Person {
    void showPerson() {
        System.out.println("I am a Person.");
    }
}

// First child class inheriting from Person (Single Inheritance)
class Teacher extends Person {
    void showTeacher() {
        System.out.println("I am a Teacher.");
    }
}

// Second child class inheriting from Person (Hierarchical Inheritance)
class Student extends Person {
    void showStudent() {
        System.out.println("I am a Student.");
    }
}

// A TeachingAssistant is a specialized Student who also teaches
// Instead of multiple inheritance, we extend Student and add Teacher-like behavior
class TeachingAssistant extends Student {
    void assistTeacher() {
        System.out.println("I am a Teaching Assistant, helping in teaching.");
    }
}

public class HybridExample {
    public static void main(String[] args) {
        TeachingAssistant ta = new TeachingAssistant();

        // Accessing inherited methods
        ta.showPerson();  // From Person
        ta.showStudent(); // From Student
        ta.assistTeacher(); // Own method

        //  Not possible: ta.showTeacher(); 
        // Because TeachingAssistant is not directly or indirectly inheriting Teacher
    }
}

