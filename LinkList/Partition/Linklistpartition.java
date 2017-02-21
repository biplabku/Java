import sun.awt.image.ImageWatched;

/**
 * Created by biplabkumardas on 2/21/17.
 */
public class Linklist {
    public Node head;
    public int nelms;
    public Linklist(){
        head = null;
        nelms = 0;
    }

    public  void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        nelms = nelms + 1;
    }

    public  void display(){
        Node cur = head;
        while(cur != null){
            System.out.print(" ");
            System.out.print(cur.data );
            cur = cur.next;
        }
    }

    public static Node partitionlist(Node node, int val){
        Node headstart = null;
        Node headend = null;
        Node tailstart = null;
        Node tailend = null;
        while(node != null){
            Node next = node.next;
            node.next = null;
            if(node.data < val){
                if(headstart == null){
                    headstart = node;
                    headend = headstart;
                }
                headend.next = node; // assigning the link to point to the 'node's' next link
                headend = node; // assigning the value of the node to headend;
            }else{
                if(tailstart == null){
                    tailstart = node;
                    tailend = tailstart;
                }else{
                    tailend.next = node;
                    tailend = node;
                }
            }
            node = next;
        }
        // headend and tailend are always pointing to null
        // so after the while loop ends we just need to assign the proper reference for
        // the linklist to work;
        // that is the last node of first part should be assigned to the first part of the last link list
        headend.next = tailstart;
        return headstart;
    }
