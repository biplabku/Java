import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/9/17.
 */
// Implementtatio
    // 1. Merge Sort
    // 2. Selection Sort
    // 3. Insertion Sort
    // 4. Quick Sort  --
    // 5. Bubble Sort --  comparing the adjacent element
class sortingArrApp {
    public static void main(String[] args) {
        // it needs to call all the functions for sorting the same array that means we will get the same output after each function output
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array -- > ");
        int n = in.nextInt();
        bubbleSort bs = new bubbleSort(n);
        for (int i = 0; i < n; i++) {
            bs.insertEl(in.nextInt());
        }
        // call any of the function from here to implement any method
        bs.mergeSort();
        bs.display();


    }
}
