import java.util.HashSet;
import java.util.Stack;

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
    // first start with the sample case as if there are no duplicate elements
    // so in the above given case we just need to transfer the elements less then
    // the given node value to one side and node value greater than the given
    // to the right side
    public void partitionLinklist(int key){
        Link prev = first;
        Link cur = first;
        Link after = first;
        // for finding the position of the key and position after the
        while(cur.idata != key){
            prev = cur;
            cur = cur.next;   // after while loop terminates it will have the "given " Link
            after = cur.next; //  the given link's next Link positon
        }

        if(cur.idata > after.idata){
            prev.next = after;
            cur.next = after.next;
            after.next = cur;
        }
    }

    public void partition(int key){
        Link beforeStart = null;
        Link beforeEnd = null;
        Link afterStart = null;
        Link afterEnd  = null;
        Link cur = first;
        while(cur != null){
            if(cur.idata < key){

            }
        }
    }
    

    // after reversing the linklist check whether they are equal, if
    // they are then it is a palindrome.
    public boolean checkpalindrome(){
        Link cur = first;
        Stack<Integer> st = new Stack<>();
        while(cur != null){
            st.push(cur.idata);
            cur = cur.next;
        }
        cur = first;
        while(cur != null){
            if(st.pop() != cur.idata){
                return false;
            }
            cur = cur.next;
        }
        return true;
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
