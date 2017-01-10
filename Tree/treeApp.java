import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/9/17.
 */
class treeApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Tree tr = new Tree();
        tr.insertFirst(12, 1.2);
        tr.displayall();
    }
}
