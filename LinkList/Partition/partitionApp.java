import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/7/17.
 */
class partitionApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long pivot = 99;
        System.out.println("Enter the size -- >> ");
        int sizeAr  = in.nextInt();
        System.out.println("Enter the numbers in a random order -- >  ");
        partition pr = new partition(sizeAr);
        for(int i = 0; i < sizeAr; i++){
            pr.insert(in.nextLong());
        }
        pr.display();
        //pr.partitionelems(pivot, 0, pr.size() - 1);
        pr.QuickSort();
        pr.display();

    }
}
