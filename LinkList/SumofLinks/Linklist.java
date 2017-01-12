/**
 * Created by biplabkumardas on 1/12/17.
 */
class Linklist {
    private Link first;
    private int nelms;

    // constructor for initialising the Linklist
    public Linklist(){
        first = null;
        nelms = 0;
    }

    // for inserting the elements into the linklist
    public void insert(int k){
        Link cur = new Link(k);
        cur.next = first;
        first = cur;
        nelms++;
    }

    // size
    public int getSize(){
        return nelms;
    }

    public void insertAtpos(){
        // this part of the code is already updated in the previous uploaded codes
        // so this module of the program is specifically for finding the
        // solution to the cracking the coding interview question
    }

    public void sum2Link(){
        Link cur = first;
        if(getSize()%2 != 0){
            return ;
        }
        int num = getSize()/2;
        while(num != 0){
            cur = cur.next;
            num = num - 1;
        }
        num  = getSize()/2;
        Link newcount = first;
        int val = 0;
        int carry = 0;
        while(num != 0){
            val = cur.idata + newcount.idata;
            cur.idata = val;
            first = newcount.next;
            newcount = newcount.next; //  this part removes the previous elements
            cur = cur.next;
            num = num - 1;
        }
    }

    public void displayAll(){
        Link itr = first;
        while(itr != null){
            itr.display();
            itr = itr.next;
        }
        System.out.println(" ");
    }
}
