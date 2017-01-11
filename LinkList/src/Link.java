/**
 * Created by biplabkumardas on 12/28/16.
 */
class Link {
    public int data;
    public Link  next;

    public Link(int id){
        data = id;
        next = null;
    }

    public void display(){
        System.out.println("{ " + data + " }");
    }
}



