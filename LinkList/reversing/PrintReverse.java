 // Printing the linklist from the tail without data manipulation and with O(N) time.
 
 
 public void rev(){
        Node cur = head;
        Node c = null;
        printReverse(cur, c );
    }
    public void printReverse(Node nd, Node c){
        Node prev = null;
        while(nd != c){
            prev = nd;
            nd = nd.next;
        }
        System.out.print(" " + prev.data);
        c = prev;
        nd = head;
        if(c == head){
            return;
        }
        printReverse(nd, c);
    }
