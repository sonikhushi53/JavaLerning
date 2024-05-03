package OhterOops;

import Oops.Accecifiers;

public class AccecifiersInOtherPackageSubClass extends Accecifiers{
 public static void main(String[] args) {
    AccecifiersInOtherPackageSubClass acc = new AccecifiersInOtherPackageSubClass();
    acc.getData(); // accessed if it public or protected
    // Accecible only protected and public, default and private not accessible in same class main method
    System.out.println("Value of all variable -: " +" - "+ acc.protectedVal +" - "+ acc.publicVal +" - ");

    // Print class object
    System.out.println(acc); //OhterOops.AccecifiersInOtherPackageSubClass@7229724f

    System.out.println(System.in); //java.io.BufferedInputStream@4c873330
}    
}

