package oops;

// Blueprint for a Smartphone
// every class in Java is the subclass of a class object even if you don’t say extends object in your class definition
class Smartphone {
    String brand;
    String model;
    int batteryLife;

    // Constructor to create a Smartphone object
    Smartphone(String brand, String model, int batteryLife) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
    }

    // Method to display smartphone details
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Life: " + batteryLife + " hours");
        System.out.println("--------------------------");
    }

    // If we not override toString method than printing a object is output in - 
    // packagename.ClassName@hascodeofclass
    
    @Override
    public String toString(){
        return "toString method is called";
    }
}

public class ToStringInClass {
    public static void main(String[] args) {
         // Creating Smartphone objects
         Smartphone phone1 = new Smartphone("Apple", "iPhone 14", 20);
         Smartphone phone2 = new Smartphone("Samsung", "Galaxy S23", 22);
         Smartphone phone3 = new Smartphone("OnePlus", "OnePlus 11", 24);
 
         // Displaying Smartphone details
         phone1.displayInfo();
         phone2.displayInfo();
         phone3.displayInfo();


         System.out.println("\n\n phone1 is-: "+ phone1);


    }
}
