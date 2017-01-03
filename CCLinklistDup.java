import java.util.Scanner;

/**
 * Created by biplabkumardas on 12/29/16.
 */
public class CCLinklistDup {
    public static void main(String[] args){
        Linklist_dup ldp = new Linklist_dup();
        ldp.insertel(12);
        ldp.insertel(1);
        ldp.insertel(4);
        ldp.insertel(0);
        ldp.insertel(4);
        ldp.insertel(0);

        int sz = ldp.getSize();
        // call the display function
        //ldp.display1();

        try{
            System.out.println("Enter the position you want to enter the element ? ");
            Scanner in  = new Scanner(System.in);
            int pos = in.nextInt();
            ldp.insertelAtpos(5, ldp.findEL(pos));
        }
        catch (NullPointerException ix){
            System.out.println("Position does not exist ");
        }
        System.out.println("Main LinkList after the above operations is shown as -- > \n");
        ldp.display1();
    }
}
