package controlstatement;

class ForEach {
  
    public static void main(String[] args) {
      
        // Array declaration
        int arr[] = { 1, 2, 3, 4, 5 };
        
        // Using for-each loop to 
        // print each element

            arr[0] = 9;
        for (int e : arr) {
            // arr[2] = 7; // can change value like this

            if (e == 2) {
                continue;
            }
            System.out.print(e + " ");
        }

        System.out.println("\n Arr[0] is :- "+arr[0]);
    }
}