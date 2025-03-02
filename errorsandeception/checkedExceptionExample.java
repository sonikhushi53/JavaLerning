package errorsandeception;

import java.io.FileNotFoundException;


public class checkedExceptionExample {

    // Compiler force to handle checked exception
    public static void classLoad() throws ClassNotFoundException, NullPointerException
    {
        // Class.forName("errorsandeception.checkekhdExceptionExample");
        System.out.println("This is class loader.");
    }

    public static void fileLoad() throws NullPointerException{
        System.out.println("This is file loader.");
    }

    public static void throwError(){
        int a=10,b =0;

        if(b == 0){
            throw new ArithmeticException("Airthmatic error......"); //
        } else{
            System.out.println("a/b is -: "+ a/b);
        }
    }

    public static void main(String[] args) {
        
        try{
            fileLoad();
        classLoad();
        throwError();


        } catch(Exception e){ // Exception catch will handle all checked and unchecked exception bcoz it is parent of all
            System.out.println(e.getMessage());
        }


        System.out.println("====================");
        // try{

        //     Class.forName("errorsandeception.checkekhdExceptionExample");
        //     System.out.println("Hello from try");

        // } catch(ClassNotFoundException e){
        //     System.out.println("Class not found");
        // } 
        // // catch(FileNotFoundException fe){
        // //     System.out.println("File not found");
        // // }
        // catch(IndexOutOfBoundsException in){
        //     System.out.println("Index out of bound");
        // }



        // try{
        //     System.out.println("Hello from 2nd try");
        // }finally{
        //     System.out.println("This is finally block");
        // }

        
    }
}
