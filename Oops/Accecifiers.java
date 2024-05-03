// The following program shows the access to members permitted by each modifier.

package Oops;

public class Accecifiers {
    private String privateVal;
    protected String protectedVal;
    public String publicVal ;
    String defaultVal ;

    public Accecifiers()
    {
        privateVal = "privateVal";
        protectedVal = "protectedVal";
        publicVal = "publicVal";
        defaultVal = "defaultVal";
    }

    protected void getData(){
        // In that class all acecible
        System.out.println("Value of all variable in same class's method getData() -: "+ privateVal +" - "+ protectedVal +" - "+ publicVal +" - "+ defaultVal);
    }

    public static void main(String[] args) {
        Accecifiers acc = new Accecifiers();
        acc.getData();
        // Accecible all in same class main method
        System.out.println("Value of all variable -: "+ acc.privateVal +" - "+ acc.protectedVal +" - "+ acc.publicVal +" - "+ acc.defaultVal);
    }
}
