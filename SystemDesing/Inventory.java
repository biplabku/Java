import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by biplabkumardas on 3/10/17.
 */
public class Inventory {
    private LinkedList laptops;
    public Inventory(){
        laptops = new LinkedList();
    }

    public void addLaptops(String id, String name, String company, int price){
        Laptop laptop = new Laptop(id, name, company, price);
        laptops.add(laptop);
    }


    public Laptop getLaptop(String laptop_id){
        Iterator itr;
        for(itr = laptops.iterator(); itr.hasNext();){
            Laptop lp = (Laptop) itr.next();
            if(lp.getLaptop_id().equals(laptop_id)){
                return lp;
            }
        }
        return null;
    }

    // search can be made according to different attributes
    // lets say using only 1
    public Laptop searchLaptop(Laptop searchlaptop){
        for(Iterator itr = laptops.iterator(); itr.hasNext();){
            Laptop newlaptop = (Laptop) itr.next();
            // this is the laptop where all the search needs to be done
            // depending on the number of the different attributes
            // here i need to check the newlaptop attributes with the search laptop attributes
            // and if there is a match then return that particular laptop.
            String id = newlaptop.getLaptop_id();
            if(!id.equals(searchlaptop.getLaptop_id())){
                continue;
            }
            String name = newlaptop.getLaptop_name();
            if(!name.equals(searchlaptop.getLaptop_name())){
                continue;
            }
            String company = newlaptop.getLaptop_company();
            if(!company.equals(searchlaptop.getLaptop_company())){
                continue;
            }
            int cost = newlaptop.getLaptop_cost();
            if(cost != searchlaptop.getLaptop_cost()){
                continue;
            }
            return searchlaptop;
        } //  end of for loop;
        return null;
    }


    /*
    public static void main(String[] args){
        Inventory inv = new Inventory();
        inv.addLaptops("s120", "hp120","hp", 12000);
        inv.addLaptops("s121", "lap120","lap", 12001);
        inv.addLaptops("s122", "lenovo120","dell", 12300);
        inv.addLaptops("s123", "samsung120","lenovo", 15000);
        inv.addLaptops("s125", "mac120","compaq", 11000);
        inv.addLaptops("s127", "tab120","samsung", 92000);

        Laptop search = new Laptop("s120", "hp120","hp", 12000);
        System.out.println(inv.searchLaptop(search));
    }
    */
}
