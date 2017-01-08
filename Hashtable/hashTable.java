/**
 * Created by biplabkumardas on 1/8/17.
 */
class hashTable {
    private dataItem[] hashArray;
    private dataItem nonItem;
    private int Arraysize;

    public hashTable(int s){
        Arraysize = s;
        hashArray = new dataItem[Arraysize];
        nonItem = new dataItem(-1);
    }
    // first we need the hash function so that it can generate an index
    public int hashfunct(int key){
        return key % Arraysize;

    }

    // inserting items into a hashtable
    public void insert(dataItem d){
        int key1 = d.getKey();
        int hashval = hashfunct(key1);
        while(hashArray[hashval] != null && hashArray[hashval].getKey() != -1){
            hashval = hashval + 1;
            hashval = hashval % Arraysize;
        }
        hashArray[hashval] = d;
    }

    // for displaying the elements inside the Hashtable
    public void display(){
        for(int i = 0; i< Arraysize; i++){
            if(hashArray[i] != null){
                System.out.println(hashArray[i].getKey());
            }
            else{
                System.out.println("* *");
            }
        }
        System.out.println(" ");
    }

    // for deleting an element
    public dataItem delete(int k){
        int hsval = hashfunct(k);
        while(hashArray[hsval] != null){
            if(hashArray[hsval].getKey() == k){
                dataItem temp = hashArray[hsval];
                hashArray[hsval] = nonItem;
                return temp;
            }
            hsval = hsval + 1;
            hsval = hsval % Arraysize;
        }
        return null;
    }

}
