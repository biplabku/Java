/**
 * Created by biplabkumardas on 12/31/16.
 */
class selectionSort {
    private long[] ar;
    private int elms;
    // constructor
    public selectionSort(int max){
        ar = new long[max];
        elms = 0;
    }
    public void insert(long inpt){
        ar[elms] = inpt;
        elms = elms+1;
    }
    // displaying the array
    public void display(){
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
        System.out.println(" ");
    }
    // swap function
    public void swap(int k){
        long temp;
        if(ar[k] > ar[k+1]){
            temp = ar[k];
            ar[k + 1] = ar[k];
            ar[k] = temp;
        }
    }

    // main code for doing selection sort
    public void selectsort(){
        long short_val = ar[0];
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar.length -1; j++){
                if(short_val > ar[j + 1]){
                    break;
                }
            } // inner for loop ends
        } // outer for loop ends
        System.out.println(short_val);
    }
}
