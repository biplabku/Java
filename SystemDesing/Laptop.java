/**
 * Created by biplabkumardas on 3/10/17.
 */
public class Laptop {
    private String laptop_id;
    private String laptop_name;
    private int laptop_cost;
    private String laptop_company;

    // initialise the instance of the laptop class with its variables name and details
    public Laptop(String id, String name, String company, int price){
        this.laptop_id = id;
        this.laptop_name = name;
        this.laptop_company = company;
        this.laptop_cost = price;
    }

    // generating the class functions using its attributes
    public String getLaptop_id(){

        return laptop_id;
    }

    public String getLaptop_name(){

        return laptop_name;
    }

    public String getLaptop_company(){

        return laptop_company;
    }

    public int getLaptop_cost(){

        return laptop_cost;
    }
}
