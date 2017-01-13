/**
 * Created by biplabkumardas on 1/13/17.
 */
class stackLink {
    private Link first;
    private int nel ;
    public stackLink(){
        first = null;
        nel = 0;
    }

    public void push(int key){
        Link cur = new Link(key) ;
        cur.next = first;
        first = cur;
        nel = nel + 1;
    }

    public void display(){
        Link  cur = first;
        System.out.println("Displaying the stack ");
        while(cur != null){
            System.out.println("{ " + cur.data + " }");
            cur = cur.next;
        }
        System.out.println("End of the Stack ");
    }

    public int pop(){
        int temp = 0;
        Link cur = first;
        if(nel < 0){
            System.out.println("No more elements left ");
        }
        else{
            temp = cur.data;
            first = cur.next;
            nel = nel - 1;
        }
        return temp;
    }

    public int peek(){
        return first.data;
    }
}
