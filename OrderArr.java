import java.util.Scanner;
/**
 * Created by biplabkumardas on 12/31/16.
 */
public class OrderArr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the Array Size --> ");
        int len = in.nextInt();
        int[] ar = new int[len];
        // it should be a sorted array since it is a binary search
        for(int  i = 0; i < len; i++){
            ar[i] = in.nextInt();
        }
        System.out.println("Enter the number you want to search --> ");
        int searchkey = in.nextInt();
        arrayclas as = new arrayclas();
        if(as.findel(ar,searchkey) != ar.length){

        }
        as.findel(ar, searchkey);
    }
}
