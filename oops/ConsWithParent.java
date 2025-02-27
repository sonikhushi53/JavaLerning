package oops;

class Parent{
    String name = "Axixa";

    Parent(){
        System.out.println("Parent Class");
    }

    Parent(int a, int b){
        System.out.println("Parent Perameterized Class");
    }

}

class Child extends Parent{
    String name = "Khushi";

    Child(){
        // super();
        super(8,9);
        System.out.println("Child Class");
    }

    Child(int a, int b){
        // super(8,9);

        System.out.println("Child Perameterized Class");
    }

    void getName(){
        System.out.println(super.name);
    }

}
public class ConsWithParent {
    public static void main(String[] args) {

        /*
         * 
         * Child class ka object create hone pr parent class ka default constructo call krta hai
         * 
         * Child ka parametrized bhi parent ka default hi call krega kunki by default constructor me first line super() hoti hai
         * 
         * Pr ab agar humne parent me perametrized constroctor banaya hai or default nhi banaya to compiler ko super() se koi construtor nhi milne pr ye error dega or use case me parametrized constructor ko hume manually call krna padega super keyword ke through.
         * 
         * Lekin agar parent me constructor bana hua hi nhi h to error through nhi krega
         */
        Child c = new Child();
        Child c2 = new Child(10, 15);

        c.getName();

    }
}
