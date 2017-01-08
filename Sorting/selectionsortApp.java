import java.util.Scanner;

/**
 * Created by biplabkumardas on 12/31/16.
 */
class selectionsortApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Size of the array -- > ");
        int maxsize = in.nextInt();
        selectionSort ss = new selectionSort(maxsize);
        ss.insert(1);
        ss.insert(7);
        ss.insert(0);
        ss.insert(9);
        ss.insert(2);
        ss.insert(3);
        ss.display();
        System.out.println(" ");
        ss.selectsort();
        ss.display();
    }
}
