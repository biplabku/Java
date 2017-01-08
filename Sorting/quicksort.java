/**
 * Created by biplabkumardas on 1/1/17.
 */
class quicksort {
    private int[] ar;
    private int totlems;

    public quicksort(int maxsize){
        ar = new int[maxsize];
        totlems = 0;
    }

    public int size(){
        return totlems;
    }
    public void insert(int inse){
        ar[totlems] = inse;
        totlems = totlems + 1;
    }

    public void display(){
        for(int i = 0; i < totlems; i++){
            System.out.println(ar[i]);
        }
        System.out.println(" ");
    }

    public int find(int key){
        int lowerkey = 0;
        int upperkey = ar.length-1;
        while(true){
            int middle = (lowerkey + upperkey)/2;
            if(key == middle ){
                return middle;
            }
            else{
                if(key < middle){
                    upperkey = middle - 1;
                }
                else{
                    lowerkey = lowerkey + 1;
                }
            }
        }
    }
    public void swap(int x, int y){
        int tmp= 0;
        if(ar[x] > ar[y]){
            tmp = ar[y];
            ar[y] = ar[x];
            ar[x] = tmp;
        }
    }
    ///// Selection Sort //////
    public void selectionsort(){
        int record;
        for(int i = 0; i < ar.length; i++){
            record = ar[i];
            for(int j = i ; j < ar.length-1; j++){
                if(record >= ar[j + 1]){
                    // insert the swap function
                    record = ar[j + 1];
                    swap(i, j+1);
                }
            }
            ar[i] = record;
        }
    }
    ///// INSERTION SORT ///////
    public void insertionSort(){
        for(int i = 1; i < ar.length-1; i++){
            int el = ar[i];
            int  j = i;
            while(j > 0 && ar[j - 1] > el){
                ar[j] = ar[j - 1];
                ar[j - 1] = el;
                j = j - 1;
            }
        }
    }

    // MERGE sort
    public void mergeSort(int[] A1, int[] B1, int[] C1){
        int temp = 0;
        int i = 0,j=0;
        while(j < B1.length){
            if(A1[i] > B1[j]){
                C1[temp] = B1[j];
                j = j + 1;
                temp = temp + 1;
            }
            else{
                C1[temp] = A1[i];
                i = i + 1;
                temp = temp + 1;
            }
        }// while loop ends
        while(i < A1.length ){
            C1[temp ] = A1[i];
            i = i + 1;
            temp = temp + 1;
        }
        for(int k = 0; k < C1.length; k++){
            System.out.println(C1[k]);
        }
        System.out.println(" ");
    }

    public void mergeSortDif()

}
