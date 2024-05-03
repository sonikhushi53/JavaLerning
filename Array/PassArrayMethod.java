public class PassArrayMethod {
    public static void main(String[] agrs)
    {
        int[] arr1 = {1,2,3,4};
        for (int i : arr1) {
            System.out.println(i);   
        }

        PassArrayMethod pm = new PassArrayMethod();
        pm.arrayPass(arr1);

        System.out.println("After function call");
        for (int i : arr1) {
            System.out.println(i);   
        }
    }

    public void arrayPass(int[] arr)
    {

        System.out.println("In function -: " + arr);
        // System.out.println("In function -: " + ++arr); // type mismatch error showing and c++ move to arr[1]
        for (int i = 0; i <arr.length; i++) {
            arr[i] *= 2;
            System.out.println(arr[i]);   
        }
    }
    
}
