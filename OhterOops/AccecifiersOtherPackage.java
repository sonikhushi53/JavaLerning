package OhterOops;

import Oops.Accecifiers;
public class AccecifiersOtherPackage {
    public static void main(String[] args) {
        Accecifiers acc = new Accecifiers();
        acc.getData();
        // Only public members used in world, outSide package
        System.out.println("Value of all variable -: "+ acc.publicVal +" - ");
    }
    
}