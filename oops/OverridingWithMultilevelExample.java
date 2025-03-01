package oops;


// Base class
class Student {
    void study() {
        System.out.println("A student studies to gain knowledge.");
    }
}

// First level of inheritance
class SchoolStudent extends Student {
    @Override
    void study() {
        System.out.println("A school student studies with textbooks and notes.");
    }
}

// Second level of inheritance
class CollegeStudent extends SchoolStudent {
    @Override
    void study() {
        System.out.println("A college student studies with projects and assignments.");
    }
}

// Third level of inheritance
class EngineeringStudent extends CollegeStudent {
    @Override
    void study() {
        System.out.println("An engineering student studies with coding, labs, and practicals.");
    }
}

public class OverridingWithMultilevelExample {
    public static void main(String[] args) {
        // Creating objects of different levels
        Student s1 = new Student();
        Student s2 = new SchoolStudent();
        Student s3 = new CollegeStudent();
        Student s4 = new EngineeringStudent();

        // Calling overridden methods
        s1.study(); // Calls Student's study method
        s2.study(); // Calls SchoolStudent's study method
        s3.study(); // Calls CollegeStudent's study method
        s4.study(); // Calls EngineeringStudent's study method
    }
}

