class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
            int[] tobeSort = {
                73, 3,22,44,1000,32, 4, 7
            };
        // start copy from 2 index and till 8, not contain 9th
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        } 

        // Sort array
        System.out.println();
        System.out.println("Array befor sort");
        for (int ele : tobeSort) {
            System.out.print(ele + " ");           
        } 

        java.util.Arrays.sort(tobeSort);

        System.out.println();
        System.out.println("Array after sort");
        for (int ele : tobeSort) {
            System.out.print(ele + " ");           
        } 

        
    }
}
// As you can see, the output from this program is the same, although it requires fewer lines of code. Note that the second parameter of the copyOfRange method is the initial index of the range to be copied, inclusively, while the third parameter is the final index of the range to be copied, exclusively. In this example, the range to be copied does not include the array element at index 9 (which contains the string Lungo).