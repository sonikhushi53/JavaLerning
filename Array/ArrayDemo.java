class ArrayDemo {
    public static void main(String[] arg) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        int[] amArray = { 
            1080, 200, 300,
            400, 500, 600, 
            700, 800, 900, 1000
        };
         System.out.println("Element at index 0 of amArray: "
                           + amArray[0]);
        System.out.println("________________________________________________________________________________________");
        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
        int[] secondArray = anArray; // It generate a clone of self and not give copy
        secondArray[2] = 11;
         System.out.println("update 2 element of second array");
        System.out.println(" secondArray[2] = "+secondArray[2]);
        System.out.println("anArray[2] = " + anArray[2]);

        anArray[3] = 21;
         System.out.println("update 3 element of anarray");

        System.out.println("secondArray[3] = "+secondArray[3]);
        System.out.println("anArray[3] = " + anArray[3]);

    }
}