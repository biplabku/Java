/**
 * Created by biplabkumardas on 2/20/17.
 */
public class LinearSort {

    public static void main(String[] args){
        int[] ar = new int[]{15, 2, 1, 6, 9 ,0, 7, 3, 2};
        //countingSort(ar);
        radixSort(ar);
    }

    public static int findmax(int[] ar){
        int max = ar[0];
        for(int i = 1; i < ar.length; i++){
            if(max < ar[i]){
                max = ar[i];
            }
        }
        return max;
    }

    public static void countingSort(int[] ar){
        int max = findmax(ar);
        int[] c = new int[max+1];
        int[] b = new int[ar.length];
        for(int i = 0 ; i <= max ; i++){
            c[i] = 0;
        }

        for(int i = 0; i < ar.length; i++){
            c[ar[i]] = c[ar[i]] + 1;
        }

        for(int i = 1; i <= max; i++){
            c[i] = c[i] + c[i - 1];
        }
        for(int i = ar.length - 1; i >= 0; i--){
            c[ar[i]] = c[ar[i]] - 1;
            b[c[ar[i]]] = ar[i];
        }

        for(int i = 0; i < ar.length; i++){
            System.out.println(b[i]);
        }
    }


    public static void radixSort(int[] arr){

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
                bucket[(arr[i] / exp) % 10] = bucket[(arr[i] / exp) % 10] - 1;
                b[bucket[(arr[i] / exp) % 10]] = arr[i];
            }
            // important step since after each sorting of each place we need to update the input sequence
            for (int i = 0; i < n; i++) {
                arr[i] = b[i];
            }
            exp *= 10;
        }

        for (int i = 0; i < n; i++){

            System.out.println(arr[i] + " ");
        }
    }
}
