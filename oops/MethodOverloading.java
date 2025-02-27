package oops;
public class MethodOverloading {

    public void hello(){
        System.out.println("Hello java");
    }

    // access mofier can be changed and return type also can change - it not effect overloading
    void hello(String name){
        System.out.println("Hello " + name);
    }


    // Differ type of parameters
    String sum(int a, int b){
        return a+" + "+b+" is -: "+(a+b);
    }

    double sum(float a, float b){
        return a+b;
    }
    
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.hello();
        m.hello("JAVA");

        System.out.println(m.sum(8,6));

        System.out.println(m.sum(8.7f,6.5f));


        /*
         * 
         * Method Overloading ek hi class me same naam wale multiple methods define karne ki technique hai,
            lekin different parameters hone chahiye.

            📌 Rules for Method Overloading:
            1️⃣ Method name same hoga.
            2️⃣ Parameters (number, type, or sequence) different honi chahiye.
         */
    }
    
}
