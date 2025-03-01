package oops;

// Final keyword is used when we make things final in other word wants "No chage".
// We can create final variable, method, class
/*
    * Where Used?	        What Happens?
    1️⃣ final Variable	    🛑 Value can't be changed after assignment / constant variable
    2️⃣ final Method	    🛑 Can't be overridden in child classes
    3️⃣ final Class	        🛑 Can't be extended (no subclass allowed)
 */

 /*
  * Final variables: When a variable is declared as final, its value cannot be changed once it has been initialized. This is useful for declaring constants or other values that should not be modified.
  * Final methods: When a method is declared as final, it cannot be overridden by a subclass. This is useful for methods that are part of a class’s public API and should not be modified by subclasses.
  * Final classes: When a class is declared as final, it cannot be extended by a subclass. This is useful for classes that are intended to be used as is and should not be modified or extended.
  * Initialization: Final variables must be initialized either at the time of declaration or in the constructor of the class. This ensures that the value of the variable is set and cannot be changed.
  * Performance: The use of a final can sometimes improve performance, as the compiler can optimize the code more effectively when it knows that a variable or method cannot be changed.
  * Security: The final can help improve security by preventing malicious code from modifying sensitive data or behavior.
  */

public class finalExample {

    final String studentName; // It is must to initialize a final variable
    final String name = "Axixa"; // fixed for all obj
    final static String course = "BCA"; //

    finalExample(String studentName){
        this.studentName = studentName; 
        //Can also initialize final variable in constructor
        // Note the difference between C++ const variables and Java final variables. const variables in C++ must be assigned a value when declared. For final variables in Java, it is not necessary as we see in the above examples. A final variable can be assigned value later, but only once.
    }

    
    void changeName() {
        // name = "XYZ"; // ❌ Error! Can't change final variable
    }

    public static void main(String[] args) {
        finalExample f = new finalExample("Abc");
        finalExample f2 = new finalExample("xyz");
        System.out.println(f.studentName); //abc
        System.out.println(f.name); //Axixa

        System.out.println(f2.studentName); //xyz
        System.out.println(f2.name); // AXixa
        // f.name = "";

        // using final with a for-each loop is a legal statement.
        // Reason: In a for-each loop, the loop variable is redeclared in each iteration, so marking it final ensures its value cannot be changed inside the loop.

        // for (final int num : numbers) {
        //     System.out.println(num);
        //     // num = num + 5; //  Error: Cannot assign a value to final variable 'num'
        // }
    }
}

/*
 * Advantages of final Keyword in Java:
The final keyword in Java provides several advantages, including:

Ensuring immutability: When a variable or reference is marked as final, its value cannot be changed once it is assigned. This helps ensure that data is immutable and cannot be accidentally or maliciously modified.
Improving performance: The use of the final can sometimes help improve performance, as the Java Virtual Machine (JVM) can optimize code more effectively when it knows that certain values or references cannot be changed.
Making code easier to understand: By declaring variables, methods, or classes as final, developers can make their code easier to understand and reason about. When a value or reference is marked as final, it is clear that it will not change, which can simplify code analysis and debugging.
Promoting code reuse: By declaring methods as final, developers can prevent subclasses from overriding them. This can help promote code reuse and reduce duplication, as subclasses must use the parent class’s implementation of the method.
Enhancing security: The use of final can help enhance security by preventing malicious code from modifying sensitive data or behavior.
 */
