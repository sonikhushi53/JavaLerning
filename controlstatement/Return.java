package controlstatement;

public class Return {

    public static void demo(){
        int i = 5;
        System.out.println("Value of i " + i);
        if (i == 5) {
        return ;
            
        }
        i++;
    }
    public static void main(String[] args) {
        demo();
    }
    
}
