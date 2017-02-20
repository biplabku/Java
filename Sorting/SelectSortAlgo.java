/**
 * Created by biplabkumardas on 2/20/17.
 */
public class SelectionSort {
    public static void main(String[] args){
        int[] ar = new int[]{9, 7, 4, 1, 8, 6, 3};
        selectionsort(ar);
    }

    // code for selectionsort algorithm
    public static void selectionsort(int[] arr){
        int temp;
        // important concept here is you need to modify the comparing element every loop so that it can find the mini
        // mum element from the remaining elements and store the index of the minimum element location
        for(int i = 0; i < arr.length -1; i++){
            int index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            if(index != i){
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("The sorted array is given by -- > ");
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int x, int y, int[] arr){
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
