/**
 * Created by biplabkumardas on 12/28/16.
 */
public class LinkedList1 {
    private Link first;

    public LinkedList1(){
        first = null;
    }

    public boolean isempty(){
        if(first == null){
            return true;
        }
        return false;
    }

    public void insertfrst(int ndata){
        Link nlink = new Link(ndata);
        nlink.next = first;
        first = nlink;
    }

    public Link deletefrst(int ndat){
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayal(){
        System.out.println("About to display -- >  ");
        Link current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
        System.out.println("  Done  ");
    }

    // finding the location of a particular element
    public Link findElement(int fdata){
        Link currentd = first;
        while(currentd.data != fdata){
            if(currentd.next == null){
                return null;
            }
            else{
                currentd = currentd.next;
            }
        }
        return currentd;
    }

    //deleting the particular element from the linklist
    public Link deletePelement(int del){
        Link current1  = first;
        Link previous1 = first;
        while(current1.data != del){
            if(current1.next == null){
                return null;
            }
            else{
                previous1 = current1;
                current1 = current1.next;
            }
        }
        if(current1 == first) {
            first = first.next;
        }
        else{
            previous1.next = current1.next;
        }
        return current1;
    }


    // deleting particular Link from the linkedlist
    public Link deleteNode(int lda){
        Link delcurPrev = first;
        Link delcurCurr = first;
        int a = 0;
        while (delcurPrev != null && (a <= lda)) {
            a = a + 1;
            delcurPrev = delcurCurr;
            delcurCurr = delcurCurr.next;
        }
        // change is done here.
        delcurPrev.next = delcurCurr.next;

        return delcurPrev;
        // here we get the position where the link needs to be deleted

    }
}
