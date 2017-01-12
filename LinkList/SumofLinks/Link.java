/**
 * Created by biplabkumardas on 1/12/17.
 */
class Link {
    // suppose the key is the link data that is given in the link list
    public int idata;
    public Link next;

    // constructor for initialising the Link with the data
    public Link(int id){
        idata = id;
    }

    // display function for showing the link data;
    public void display(){
        System.out.println("{ " + idata + " }");
    }
}


