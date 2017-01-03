import java.util.Scanner;

/**
 * Created by biplabkumardas on 12/29/16.
 */
public class maxArray {
    public static void main(String[] args){

        // to find the maximum difference between the array
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        checkDiff(arr);
    }
    public static void checkDiff(int[] ar ){
        // to find the maximum difference
        // find the smallest element, then find the largest
        // element from the array
        int len = ar.length;
        // smallest
        int temp1= 0;
        for(int i = 0; i < len-1; i++){
            temp1 = ar[0];
            if(temp1 > ar[i + 1]){
                 temp1 = ar[i + 1];
            }
        }
        // largest
        int temp = 0;
        for(int i = 0; i < len-1; i++){
            if(ar[i] < ar[i + 1]){
                temp = ar[i];
                ar[i] = ar[i + 1];
                ar[i + 1] = temp;
            }
        }
        temp = ar[0];
        System.out.println(temp + " " + temp1);
        System.out.println("the maximum difference is --- > " + (temp - temp1));
    }
}
