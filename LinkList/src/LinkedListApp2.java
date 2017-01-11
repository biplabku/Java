import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by biplabkumardas on 12/28/16.
 */

public class LinkedListApp2 {
    public static void main(String[] args){
        LinkedList1 ls1 = new LinkedList1();
        ls1.insertfrst(1);
        ls1.insertfrst(3);
        ls1.insertfrst(4);
        ls1.insertfrst(8);

        ls1.displayal();

        System.out.println("Enter the NODE you want to delete -- >  ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ls1.deleteNode(n);
        System.out.println("Deleted: ");
        ls1.displayal();




        // if you want to search any particular data in a linkedlist
        System.out.println("Enter the DATA you want to search and delete -- ?  \n");
        int Ldata = in.nextInt();
        Link d2 = ls1.deletePelement(Ldata);
        if(d2 != null){
            System.out.println("deleted : " + d2.data);
        }
        else{
            System.out.println("Cannot find the data : \n");
        }

        ls1.displayal();
    }
}
