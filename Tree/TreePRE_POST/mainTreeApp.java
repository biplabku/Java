import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/16/17.
 */
class mainTreeApp {
    // main calling function
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree tr = new Tree();
        tr.insert(50,1.5);
        tr.insert(25,1.2);
        tr.insert(75,1.7);
        tr.insert(12,1.5);
        tr.insert(37,1.2);
        tr.insert(43,1.7);
        tr.insert(30,1.5);
        tr.insert(33,1.2);
        tr.insert(87,1.7);
        tr.insert(93,1.5);
        tr.insert(97,1.5);

        System.out.println("Enter your choice -- >");
        int choice = in.nextInt();
        tr.traverse(choice);


    }
}
