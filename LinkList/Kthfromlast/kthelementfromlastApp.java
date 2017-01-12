/**
 * Created by biplabkumardas on 1/12/17.
 */
 class kthelementfromlastApp {
    public static void main(String[] args){
        LinkList ls = new LinkList();
        ls.inseertfirst(12, 1.2);
        ls.inseertfirst(13,1.3);
        ls.inseertfirst(14, 1.4);
        ls.inseertfirst(15,1.5);
        ls.inseertfirst(15, 1.5);
        ls.inseertfirst(18,1.7);
        //ls.removeDup();
        ls.removeDupUsingHashset();
        Link n = ls.kthelement(4);
        System.out.println("Kth Link is given by -- > " + n.idata + " " + n.ddata);

        ls.displayal();
    }
}
