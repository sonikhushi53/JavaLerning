package Oops;

interface Sec{
    String Sname = "Nandu";
}
interface thr{
    String tname = "Mahi";
}
interface First extends Sec, thr{
    // All members implicity public + static + final 
    static String name = "Khushi";  //final also implecitly
    final String surname = "soni";
    String bahan = "Mahi, nandu";
    // Need to add body to default, static, private method
    // Protected accessifier not allowed in interface
    public static void staticMethod(){
        System.out.println("HIII this is static method");
        // greet(); can't call non-static in static
    }
    default void greet(){
        System.out.println("Hello guys!!");
        greet2();
    }

    private void greet2(){
        System.out.println("Hello guys greet2 here !!");
    }
    abstract void implementMe(); // can write abstract keyword and it is bydefault abstract 
    
}
public class FirstInterface implements First{
    public static void main(String[] args) {
        First.staticMethod();
        // surname = "Soni"; // Final field can't be reassigned
        // First.name = "Khushi Soni";
        System.out.println("ststic, final or public variable of interface = "+ First.name + " - " + First.surname+ " - "+ First.bahan);

        FirstInterface fi = new FirstInterface();
        // fi.surname = "Soni"; // Final field can't be reassigned
        // fi.name = "Khushi Soni"; //The static field First.name should be accessed in a static way
        // First.name = "Khushi Soni";  //The final field First.name cannot be assigned 
        System.out.println("ststic, final or public variable of interface = "+ fi.name + " - " + fi.surname+ " - "+ fi.bahan);

        System.out.println("Parent interface's value - "+ Sname +" - "+ tname);
        // First.greet2(); //private method can'be accessed
        // First.greet(); //Cannot make a static reference to the non-static method greet()
        fi.greet();
        fi.implementMe();
    }
    
    public void implementMe(){
        System.out.println("Implement in child");
    }
}
