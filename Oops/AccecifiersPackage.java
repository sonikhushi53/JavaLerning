package Oops;

class demoClass
{
    private String privateVal;
    protected String protectedVal;
    public String publicVal ;
    String defaultVal ;

    public demoClass()
    {
        privateVal = "privateVal";
        protectedVal = "protectedVal";
        publicVal = "publicVal";
        defaultVal = "defaultVal";
    }

    public void getData(){
        // In that class all acecible
        System.out.println("Value of all variable -: "+ privateVal +" - "+ protectedVal +" - "+ publicVal +" - "+ defaultVal);
    }
}
public class AccecifiersPackage {
    public static void main(String[] args) {
        Accecifiers acc1 = new Accecifiers();
        System.out.println("Value of all variable  of Accecifiers class which is created in same package -: "+" - "+ acc1.protectedVal +" - "+ acc1.publicVal +" - "+ acc1.defaultVal);
        acc1.getData();

        System.out.println("____________________________________________________________________________________");

        demoClass acc = new demoClass();
        acc.getData();
        // Private not accesible in same package
        System.out.println("Value of all variable -: "+" - "+ acc.protectedVal +" - "+ acc.publicVal +" - "+ acc.defaultVal);
    }    
}
