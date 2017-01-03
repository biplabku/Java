import java.util.Scanner;

/**
 * Created by biplabkumardas on 12/31/16.
 */
class bubbleApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Size of the array -- > ");
        int maxsize = in.nextInt();
        arraybub ab = new arraybub(maxsize);
        ab.insert(1);
        ab.insert(7);
        ab.insert(0);
        ab.insert(9);
        ab.insert(2);
        ab.insert(3);
        ab.display();
        System.out.println(" ");
        ab.bubblesort();
        ab.display();
    }
}
