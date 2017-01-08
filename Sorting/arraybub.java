/**
 * Created by biplabkumardas on 12/31/16.
 */
class arraybub {
    private long[] ar;
    private int totEls;
    // default paramatrized constructor
    // it is used to initialize the array parameters
    // in this case it is size and number of elements in the array
    public arraybub(int max){
        ar = new long[max];
        totEls = 0;
    }
    // for inserting elements
    public void insert(long tmp){
        ar[totEls] = tmp;
        totEls = totEls + 1;
    }

    public void display(){
        for(int i = 0 ; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
    //
    public void bubblesort(){
        for(int i = ar.length-1 ; i > 1; i--){
            for(int j = 0 ; j < i; j++){
                swapf(j);
            }
        }
    }
    public void swapf(int jj ){
        long temp;
        if(ar[jj] > ar[jj+1]){
            temp = ar[jj];
            ar[jj] = ar[jj + 1];
            ar[jj + 1] = temp;
        }
    }
}
