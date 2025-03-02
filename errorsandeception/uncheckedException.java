package errorsandeception;

public class uncheckedException {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int a = 10,b = 0;
        int arr2[] = null;

        // IndexOutOfBoundsException, NullPointerException, ArithmeticException

        try {
            // In try block when compiler or jvm found a error it skip all statment in that block and search for related catch block
            arr[6] = 78;

            System.out.println(arr2.length);
    
            System.out.println("a/b is -: "+ a/b);
        } 
        catch (NullPointerException e) {
            // System.out.println(e.getCause());
            // System.out.println(e.getStackTrace());

        }
        // catch(Exception e){
        //     System.out.println("Null pointer error");
        // } catch(ArithmeticException e){
        //     System.out.println(e);
        // } catch (IndexOutOfBoundsException e){
        //     System.out.println(e);
            
        // }

        System.out.println("Out of try-catch block");

    }
}
