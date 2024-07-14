package Oops;

public class FirstClass {
    public static void main(String[] args) {
        First f = new First();
        First f2;
        // f2 = f;
        f2 = new First();
        f.setName("Khuhsi");
        f.setAge(22);

        f2.setName("Khuhsi");
        f2.setAge(22);

        f.hello();

        System.out.println(f == f2);
        System.out.println(f.equals(f2));
    }
}
class  First {

    protected String name;
    public int age;
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    }
    public void hello()
    {
        System.out.println("Hello! my name is "+ this.name + ". \nI'm "+ age+ " years old.");
    }
}