import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/12/17.
 */
// main function for calling all the functions and classes
class LinkListApp {
    public static void main(String[] args){
        Linklist ls = new Linklist();
        ls.insert(3);
        ls.insert(1);
        ls.insert(5);
        ls.insert(5);
        ls.insert(9);
        ls.insert(2);

        ls.sum2Link();
        ls.displayAll();
    }
}
