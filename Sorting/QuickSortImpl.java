/**
 * Created by biplabkumardas on 2/20/17.
 */
public class QuickSort {
    public static void main(String[] args){
        int[] ar = new int[]{9, 7, 4, 1, 8, 6, 3, 0};
        quicksort(ar, 0, ar.length -1);
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }

    public static void quicksort(int[] ar, int startleft, int endright){
        if(startleft >= endright){
            return;
        }
        int left = startleft;
        int right = endright;
        // important point where only the element is selected a pivot and based on this comparisons will be made
        int pivot = ar[(left + right)/2];
        // position of the pivot element so that the array can be divided and sorted accordingly
        int index = partition(ar, left, right, pivot);
        quicksort(ar, left, index -1);
        quicksort(ar, index, right);
    }

    public static int partition(int[] ar, int left, int right, int pivot){
        // program should run untill left <= to right pointer since after it crosses the right pointer element, remaining
        // elements are already sorted or swapped according to the pivot
        int temp;
        while (left <= right) {
            while(ar[left] < pivot){
                left++;
            }
            while(ar[right] > pivot){
                right--;
            }
            if(left <= right){
                temp = ar[right];
                ar[right] = ar[left];
                ar[left] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    // swap function for swapping the elements withtin the array that can be done using the indices that will be called from
    // the partition function that will decided which elements will be required to be swapped.
    public static void swap(int[] ar, int i, int j){
        int temp;
        temp = ar[j];
        ar[j] = ar[i];
        ar[i] = temp;
    }
}
