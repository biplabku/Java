/**
 * Created by biplabkumardas on 2/19/17.
 */
public class bucketSort {

    public static void main(String[] args){
        int[] arr = new int[] {10, 15, 1 , 60, 5, 100, 25, 50};
        bucketS(arr);
    }




    public static void bucketS(int[] arr) {

        int n = arr.length;
        int[] b = new int[10];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int exp = 1;
        while (max / exp > 0) {
            int[] bucket = new int[10];
            for (int i = 0; i < n; i++) {
                bucket[(arr[i] / exp) % 10] = bucket[(arr[i] / exp) % 10] + 1;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] = bucket[i ] + bucket[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                b[--bucket[(arr[i] / exp) % 10]] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                arr[i] = b[i];
            }
            exp *= 10;
        }

        for (int i = 0; i < n; i++){

            System.out.print(arr[i] + " ");
        }

    }

    // calling sorting algorithm
    public static void countingsort(int[] ar){
        int[] b = new int[10];
        int[] c = new int[ar.length];
        for(int i = 0; i <= 9; i++){
            b[i] = 0;
        }
        for(int i = 0 ; i < ar.length; i++){
            b[ar[i]] = b[ar[i]] + 1;
        }

        for(int i = 1 ; i <= 9; i++){
            b[i] = b[i] + b[i - 1];
        }

        for(int i = ar.length -1 ; i >= 0; i--){
            b[ar[i]] = b[ar[i]] - 1;
            c[b[ar[i]]] = ar[i];
        }

        for(int i = 0; i < ar.length; i++){
            System.out.println(c[i]);
        }
    }


    public static int maxnumber(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        String s = Integer.toString(max);
        max = s.length();

    return max;
    }
}
