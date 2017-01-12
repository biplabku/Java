/**
 * Created by biplabkumardas on 1/11/17.
 */
class LinkList {
    public Link first;
    public int nelms;

    // default constructor
    public LinkList(){
        first = null;
        nelms = 0;
    }

    // for inserting elements
    public void inseertfirst(int d1, double d_1){
        Link nlink = new Link(d1, d_1);
        nlink.next = first;
        first = nlink;
        nelms = nelms + 1;
    }

    // specify the position where it needs to added
    // in this case data value shows as key value
    public void insertAtpos(int key, double k2){
        Link cur = first;
        Link prev = first;
        while(cur.idata != key){
            prev = cur;
            cur = cur.next;
        }
        // now prev has the Link before which the new Link needs
        // to be inserted
        Link nlink = new Link(key, k2);
        nlink.next = prev.next;
        prev.next = nlink;
        nelms = nelms + 1;
    }
    // deleting a node from the middle when only access to the particular
    // Link is given
    public void deleteMiddle(int key, double k){
        Link find = first;
        while(find.idata != key){
            find = find.next;
        }
        Link next = find.next;
        find.idata = next.idata;
        find.next = next.next;
    }




    // deleting a middle node, given only access to its middle node
    // from the given node only we have to delte the node]
    public void delete(int key){
        Link cur = first;
        Link prev = first;
        while(cur.idata != key){
            prev = cur;
            cur = cur.next;
        }
        // now prev has the Link before which the new Link needs
        // to be inserted
        prev.next = cur.next;
        nelms = nelms - 1;
    }


    // for displaying all the Links with their values
    // keep movingg up until we encounter null;
    public void displayal(){
        Link cur = first;
        while(cur != null){
            System.out.println(cur.idata + " " + cur.ddata);
            cur = cur.next;
        }
        System.out.println("Total Link in the Link list -- > " + nelms);
        System.out.println(" ");
    }
}
