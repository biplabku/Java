/**
 * Created by biplabkumardas on 1/16/17.
 */
class Node {
    public int idata;
    public double ddata;
    public Node rightchild;
    public Node leftchild;

    // parametrized constructor
    public Node(int id, double dd){
        idata = id;
        ddata = dd;
    }

    // for displaying individual node
    public void display(){
        System.out.println("{ " + idata + ", "+ ddata + " }");
    }

}
