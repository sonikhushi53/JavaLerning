package Oops;

class Parent{
    String position = "Software Engeneer";
    static String name = "Khushi";
    void greet(){
        System.out.println("Hello Guys! from parent - "+position );
    }
}
class Child extends Parent{
    String position = "Programmer";
    static String name = "Khushi ji";

    void greet(){
        System.out.println("Hello Guys! from Child - " + position);
    }

    void greetChild(){
        System.out.println("Hello Guys! from greetChild proper child method"  );
    }
}
public class Overriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.name = "Khushi Soni"; //Can access with object also3
        c.greet(); //calling  to child

        Parent p = new Parent();
        p.greet(); // calling to parent
        System.out.println("\n\nChild -: "+c +"\n Parent -:"+ p);

        Child c2;
        Parent p2;
        // if(c2 instanceof Child)  can't use this also
        // System.out.println("\n\nChild -: "+ c2 +"\n Parent -:"+ p2); // variable c2,p2 might not have been initialized can't use getClass() onthese

        // c2 = new Parent(); //parent not have all property of child so showing error Type mismatch: cannot convert from Parent to Child
        // c2 = (Child) new Parent(); // Generate error at run time - Exception in thread "main" java.lang.ClassCastException: class Oops.Parent cannot be cast to class Oops.Child (Oops.Parent and Oops.Child are in unnamed module of loader 'app')
        // at Oops.Overriding.main(Overriding.java:28)
        System.out.println("Ststic var by child = "+Child.name);
        
        p2 = new Child();

        System.out.println("\n\n Parent -:"+ p2);
        p2.greet();
        // c2.greet();

        // System.out.println(c instanceof Child); //true
        // System.out.println(c instanceof Parent);//true

        
        // System.out.println(p instanceof Child); // false
        // System.out.println(p instanceof Parent); // true

        
        // System.out.println(p2 instanceof Child); // true
        // System.out.println(p2 instanceof Parent); //true

        // System.out.println(p2.greetChild()); but can't use child's method that is not overrided
        System.out.println(p2.position);

    }

}
