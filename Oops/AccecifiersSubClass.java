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

    protected void getData(){
        // In that class all acecible
        System.out.println("Value of all variable -: "+ privateVal +" - "+ protectedVal +" - "+ publicVal +" - "+ defaultVal);
    }
}

class demoChild extends demoClass
{
    public void getDataChild(){
        // In child class private not inheritate
        System.out.println("Value of all variable -: " +" - "+ protectedVal +" - "+ publicVal +" - "+ defaultVal);
    }
}

class demoSuperChild extends demoChild
{
    public void getDataSuperChild(){
        // In child class private not inheritate
        System.out.println("Value of all variable -: " +" - "+ protectedVal +" - "+ publicVal +" - "+ defaultVal);
    }
}
public class AccecifiersSubClass {
    public static void main(String[] args) {
        demoChild acc1 = new demoChild();
        System.out.println("Value of variables by subclass -: "+" - "+ acc1.protectedVal +" - "+ acc1.publicVal +" - "+ acc1.defaultVal);
        acc1.getData();
        acc1.getDataChild();
        System.out.println("____________________________________________________________________________________");


        demoSuperChild acc2 = new demoSuperChild();
        System.out.println("Value of variables by subclass -: "+" - "+ acc2.protectedVal +" - "+ acc2.publicVal +" - "+ acc2.defaultVal);
        acc2.getData();
        acc2.getDataChild();
        acc2.getDataSuperChild();
    }    
}
