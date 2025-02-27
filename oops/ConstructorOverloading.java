package oops;

public class ConstructorOverloading {
    int i;
    String msg;
    ConstructorOverloading(){
        this("Call from default constructor", 5);
        System.out.println("Default Constructor called");
    }

    ConstructorOverloading(int i, String msg){
        this.i = i;
        this.msg = msg;
    }

    // Change sequence of parameters for overloading
    ConstructorOverloading(String msg, int i){
        this.i = i;
        this.msg = msg;
    }

    void getVal(){
        System.out.println("Int val is - "+ i);
        System.out.println("String val is - "+ msg);

    }

    public static void main(String[] args) {
            // Call default construcotr
        ConstructorOverloading co = new ConstructorOverloading();
            co.getVal();

            System.out.println("\n\n-------Co2 object create----- \n");

            // Call parameterized construcotr
        ConstructorOverloading co2 = new ConstructorOverloading(9, "Hello!");
        co2.getVal();

        // Theory

        /*
         * Constructor Overloading is a technique in which multiple constructors are defined in the same class,
            but with different parameters (varying in number, type, or sequence).
         * 
         * 
         *  All constructors must have the same name (which is the class name).
         * 
         * The parameter list must be different (in number, data type, or order).
         * 
         * JVM determines which constructor to call based on the arguments passed.
         * 
         * 
         */


         
         /*
          * Why Use Constructor Overloading?

          *To initialize objects in different ways.
          *To increase flexibility and reusability.
          *To provide both default and custom initialization options.
          */

    }
}
