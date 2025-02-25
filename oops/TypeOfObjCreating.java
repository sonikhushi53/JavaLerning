package oops;

 class Car  implements Cloneable{
    String brand;
    String color;
    
    Car(String b, String c){
        brand = b;
        color = c;
    }

    public void getInfo(){
        System.out.println("Brand is-: "+ brand);
        System.out.println("color is-: "+ color);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Default shallow copy
    }
}

public class TypeOfObjCreating {
    public static void main(String[] args) {
        // By using new keyword
        // It is the most common and general way to create an object in Java.
        Car c = new Car("BMW", "White");


        /*
         * Using Class.forName(String className) Method
         * There is a pre-defined class in java.lang package with name Class. The forName(String className) method returns the Class object associated with the class with the given string name. We have to give a fully qualified name for a class. On calling the new Instance() method on this Class object returns a new instance of the class with the given string name.
         * 
         * Class must be public when use this method otherwise it throw class not found error. 
         */
        

        // try {
        //     // Car obj = (Car)Class.forName("oops.Car").newInstance();
        // }
        // catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

        /*
         *  Using clone() method
         *  The clone() method is present in the Object class. It creates and returns a copy of the object.
         *
         */

         try {
            Car c3 = (Car)c.clone();
            c.getInfo();
            c3.getInfo();

            c3.color = "black";

            System.out.println("After c3.color change-: ");
            c.getInfo();
            c3.getInfo();
            
         } catch (CloneNotSupportedException e) {
            // TODO: handle exception
            System.out.println("Clone not supported");
         }


        //  Create a refrence object, change on one reflect on other also
        //  Car c2 = c;

        //  c.getInfo();
        //  c2.getInfo();

        //  c2.color = "black";

        //  System.out.println("After c2.color change-: ");
        //  c.getInfo();
        //  c2.getInfo();

    }
    
}
