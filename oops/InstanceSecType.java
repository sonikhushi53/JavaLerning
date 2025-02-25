package oops;

public class InstanceSecType {

// Creation of Object
// Using new Instance

    // Declaring and initializing string
    String n = "Instance Create by second type";

    // Main driver method
    public static void main(String[] args) {
      
        // Try block to check for exceptions
        try {
            // Correcting the class name to match "InstanceSecType"
            Class<?> c = Class.forName("InstanceSecType");
          
            // Creating an object of the main class using reflection
            InstanceSecType o = (InstanceSecType) c.getDeclaredConstructor().newInstance();
          
            // Print and display
            System.out.println(o.n);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

