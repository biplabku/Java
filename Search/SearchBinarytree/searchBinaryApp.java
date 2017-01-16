import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/7/17.
 */
class searchBinaryApp {
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        binary tree = new binary();
        tree.insert(50,1.5);
        tree.insert(25,1.2);
        tree.insert(75,1.7);
        tree.insert(12,1.5);
        tree.insert(43,1.2);
        tree.insert(30,1.7);
        tree.insert(33,1.5);
        tree.insert(87,1.7);
        tree.insert(93,1.5);
        tree.insert(97,1.5);
        System.out.println("Value -- " + tree.find(50));
        tree.deleteNode(30);
        System.out.println("value exists/not " +  tree.find(30));

    }
}
