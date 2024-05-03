class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        copyTo[0] = "Kyu batau";
            System.out.println(copyTo[0]);           
            System.out.println(copyFrom[0]);           

        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }
    }
}