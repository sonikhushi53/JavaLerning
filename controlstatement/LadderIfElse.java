package controlstatement;

public class LadderIfElse {

    public static void main(String[] args) {
        int i  = 7;

        if(i==72){
            System.out.println("I is 72");
        } else if (i > 7) {
            System.out.println("I is grater then 7");
        }
        else if (i == 7) {
            System.out.println("I is equal to  7 (1st bloack)");
        }
        else if (i == 7) {
            System.out.println("I is equal to  7 (2nd bloack)");
        }
        else {
            System.out.println("I is unkown");
        }
    }
    
}
