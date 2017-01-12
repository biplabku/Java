import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/11/17.
 */
class middleNodeApp {
    public static void main(String[] args){
        LinkList ls = new LinkList();
        ls.inseertfirst(12, 1.2);
        ls.inseertfirst(13,1.3);
        ls.inseertfirst(14, 1.4);
        ls.inseertfirst(15,1.5);
        ls.inseertfirst(17, 1.6);
        ls.inseertfirst(18,1.7);
        ls.deleteMiddle(15, 1.5);
        ls.displayal();

    }
}