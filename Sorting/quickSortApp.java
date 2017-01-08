import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/1/17.
 */
// this is the main program where different classes will be called
class quickSortApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        quicksort qs = new quicksort(max );
        qs.insert(1);
        qs.insert(2);
        qs.insert(0);
        qs.insert(5);
        qs.insert(9);
        qs.insert(3);
        int[] A = {23, 47, 81, 95};
        int[] B = {7, 14, 39, 55, 62, 75};
        int[] C = new int[10];
        qs.mergeSort(A,B,C);


    }
}
