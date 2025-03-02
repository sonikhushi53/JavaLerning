package errorsandeception;

class Demo extends Exception{ // Demo is a userdefined exception class that extends exception class
    Demo(){
        System.out.println("This is user defined exception.");
        // this msg return in catch block by it's object
    }
}

public class UserDefinedException {
        public static void show() throws Demo{ 
            // bcoz we not handling error here throws it in calling mathod that is main.
            throw new Demo(); // manually throw error
        }
        public static void main(String[] args) {

            try {
                show();
            } catch (Demo e) {
                System.out.println(e);
            }

        }
}
