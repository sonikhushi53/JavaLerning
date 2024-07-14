package Oops;

abstract class InnerAbstractClass {
    // if a class have even single abstract method need to be abstract class also
    abstract void abstractMethod();
    protected void proMethod (){
        System.out.println("HI");
    }
    
}
public class AbstractClassextend extends InnerAbstractClass {
    public static void main(String[] args) {
        
    }

    void abstractMethod(){
        // Need to implement abstract method
    }
}
