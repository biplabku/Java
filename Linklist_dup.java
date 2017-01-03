import java.util.HashSet;

/**
 * Created by biplabkumardas on 12/29/16.
 */
public class Linklist_dup {
    private Link first;

    public Linklist_dup(){
        first = null;
    }

    public boolean isempty(){
        if(first == null){
            return true;
        }
        return false;
    }
    // inserting element at the first place
    public void insertel(int nd){
        Link nlink = new Link(nd);
        nlink.next = first;
        first = nlink;
    }

    // for displaying every element -
    // it will call the main link function for displaying individual links
    public void display1(){
        Link current  = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }
    //
    public void remDup(){
        //use of hashset is possible for removal of the duplicate elements but since we are using Linklist
        // we need to modify the code for appropriate value
        Link Prev = first;
        Link Curr = first;
    }

    // need to insert element at a particular position for the given key.
    public Link findEL(int key){
        // using the key as a position number to insert
        // for entering the node in between a particular position we need to save both previous and successor
        // values for inserting the particular element
        Link prev = first;
        int  i = 0;
        while(prev !=null && i < key){
            prev = prev.next;
            i = i + 1;
        }

        // displaying the element at the previous position.
        return prev;

    }

    public void insertelAtpos(int atdata, Link pr){
        Link newl = new Link(atdata);
        newl.next = pr.next;
        pr.next = newl;
    }

    public int getSize(){
        Link scur = first;
        int j = 0;
        while(scur != null){
            scur =scur.next;
            j = j  + 1;
        }
        return j;
    }
}
