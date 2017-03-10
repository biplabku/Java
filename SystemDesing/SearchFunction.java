/**
 * Created by biplabkumardas on 3/10/17.
 */
public class SearchApp {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Laptop searchlap = new Laptop("s120", "hp120","hp", 12000);
        // this search laptop needs to go through all the elements/ objects in the inventory
        // and also check its attributes before giving an output whethet the particular laptop
        // exists or not. IF any of the case within the search module fails it should
        // return null that is the object not found error
        if(inventory.searchLaptop(searchlap) != null){
            System.out.println("The laptop with the given attributes exists in our inventory. ");
            System.out.println(searchlap.getLaptop_id() + " " + searchlap.getLaptop_name()
            + " " + searchlap.getLaptop_company() + " " + searchlap.getLaptop_cost());
        }else{
            System.out.println("Sorry,  the " + searchlap.getLaptop_company() + " laptop does not exists. ");
        }

    }

    public static void initializeInventory(Inventory inventory){
        inventory.addLaptops("s120", "012d","hp", 12000);
        inventory.addLaptops("s121", "lap120","lap", 12001);
        inventory.addLaptops("s122", "lenovo120","dell", 12300);
        inventory.addLaptops("s123", "samsung120","lenovo", 15000);
        inventory.addLaptops("s125", "mac120","compaq", 11000);
        inventory.addLaptops("s127", "tab120","samsung", 92000);
    }
}
