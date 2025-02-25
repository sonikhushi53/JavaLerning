package controlstatement;

public class Switch {

    public static void main(String[] args) {
        Character ch = '3', ch2 = null;

        int in = 7;


        switch ("hi") { // Extract primitive value for switch
            case 'a':
                System.out.println("You are a.");
                break;
            case 'c':
                System.out.println("You are c.");
                break;
            case 3.9:
                System.out.println("this is 3");
                break;

                // string Not compatible with character
            // case "hi": 
            //         System.out.println("this is 3");
            //         break;

            case null:
                System.out.println("hi");
                break;
            default:
                System.out.println("Character not matched.");
        }
    }
    
}
