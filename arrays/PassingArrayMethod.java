package array;

public class PassingArrayMethod {
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }

    public static void sum(int arr[])
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }

    // If want to return array from method 
    /*
     * 
     * Return type is datatype[]
     * 
     * return arrayname;
     * 
     * 
     * public static int[] sum(int[] arr)
        {
            // getting sum of array values
            int sum = 0;

            for (int i = 0; i < arr.length; i++)
                sum += arr[i];

            System.out.println("sum of array values : " + sum);
            // return arr; // return a array
        }
     */

}
