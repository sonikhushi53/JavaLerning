package ExceptionHandling;

public class FinallyRunAlways {
    public static void main(String[] args) {
        try{
            System.out.println("5/0 is - "+ 5/0);
        } catch(NullPointerException exception){
            System.out.println("Null pointer exception here");
        } finally{
            System.out.println("This is finaly bock run always even exception not handled jo aayi hi nhi h");
        }
    }
}
