/**
 * Created by biplabkumardas on 1/11/17.
 */
class Link {
    public int idata;
    public double ddata;
    public Link next;

    // constructor for initialising the Link
    public Link(int id, double dd){
        idata = id;
        ddata = dd;
    }

    // display function
    // call this function for displaying individual links
    public void display(){
        System.out.println("{ " + idata + ", " + ddata + " }");
    }
}
