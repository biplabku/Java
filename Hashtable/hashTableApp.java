import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/8/17.
 */
class hashTableApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the hastable  ");
        int sz = in.nextInt();
        System.out.println("Enter the size of the array  ");
        int n = in.nextInt();
        hashTable ht = new hashTable(sz);
        for(int  i = 0; i < n; i++){
            int  ss = in.nextInt();
            dataItem dt = new dataItem(ss);
            ht.insert(dt);
        }
        ht.display();
        ht.delete(47);
        ht.display();

    }
}
