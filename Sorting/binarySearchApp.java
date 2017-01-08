import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/3/17.
 */
class binarySearchApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        binarySearch bs = new binarySearch(n);
        for(int i = 0; i < n ; i++){
            bs.insert(in.nextInt());
        }// end of for loop
        bs.display();
        System.out.println(" ");
        System.out.println(bs.binarysearchalg(12));


    }
}
