import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/17/17.
 */
class heapArrayApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        heap theheap = new heap(30);
        theheap.insert(70);
        theheap.insert(40);
        theheap.insert(50);
        theheap.insert(20);
        theheap.insert(60);
        theheap.insert(100);
        theheap.insert(80);
        theheap.insert(30);
        theheap.insert(10);
        theheap.insert(90);

        // for displaying the elements in a heap
        theheap.display();
    }
}
