/**
 * Created by biplabkumardas on 1/3/17.
 */
class binarySearch {
    private int[] ar;
    private int maxsize;
    private int nelms;

    public binarySearch(int s){
        maxsize = s;
        ar = new int[maxsize];
        nelms = 0;
    }

    // inserting the elements
    public void insert(int key){
        if(nelms > maxsize){
            System.out.println("Array full.  ");
        }
        else{
            ar[nelms] = key;
            nelms = nelms + 1;
        }
    }

    // display function
    public void display(){
        for(int i = 0; i < nelms; i++){
            System.out.println(ar[i]);
        }
    }

    // binarysearch algorithm function
    public int binarysearchalg(int k){
        int low = 0;
        int high = ar.length -1;
        int middle = (low+ high)/2;
        while(true){
            if(k < middle){
                high = middle -1;
                break;
            }
            else if(k == middle){
                return middle; //  found it
            }
            else{
                low = middle + 1;
                break;
            }

        }
        return middle;
    }

}
