package packages;

import oops.packages.*;
import oops.packages.abc.*;

import static oops.packages.abc.first.*; // Import all static member 
// import static oops.packages.abc.first.helloStatic; //to import perticular static member 
// The import static keyword in Java allows us to import static members (variables and methods) of a class so that we can use them without class name prefix.

// Why Use import static?
//  Reduces Code Length – No need to prefix the class name every time.
//  Improves Readability – Makes expressions shorter and cleaner.
//  Useful for Constants & Utility Methods – Ideal for Math, TimeUnit, Collections, etc.

// import oops.packages.abc.first.*; // not import any static or nan-static members


// We can't import same name of class in java also can't create alias for that unlike other programming language.

public class PackageExample {
    public static void main(String[] args) {
        
        // first f = new first(); //ambiguous error 

        oops.packages.abc.first f2 = new oops.packages.abc.first();
        // Need to use fully qualified class name

        helloStatic(); // 
    }
}

/*
 * Limitations of import static
* Can cause confusion – If multiple static members with the same name exist, it creates ambiguity.
* Reduces code clarity – Overuse can make code harder to read.
* Only for static members – Cannot be used for instance methods or variables.
 */

 /* Important points
  * Every class is part of some package.
  * If no package is specified, the classes in the file goes into a special unnamed package (the same unnamed package for all files).
  * All classes/interfaces in a file are part of the same package. Multiple files can specify the same package name.
  * If package name is specified, the file must be in a subdirectory called name (i.e., the directory name must match the package name).
  * We can access public classes in another (named) package using: package-name.class-name
  */