package random_topics;
import java.util.Scanner;
public class ChangeVarType {
    public static void main(String[] args) {
        int a = 5;
        float b = 75.4f;
        System.err.println(a);
        // int a; // not possible to redeclare 
        // a = (float)7.5f; // type casting is not about change the actual type of a variable it's about cast a value and assign it to other type of variable s 
        System.err.println(a);

        int c ;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
    }
}
