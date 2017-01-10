/**
 * Created by biplabkumardas on 1/9/17.
 */
class bubbleSort {
    private int[] ar;
    private int maxsize;
    private int nelms;
    public bubbleSort(int s){
        maxsize = s;
        ar = new int[maxsize];
        nelms = 0;
    }

    public void insertEl(int data){
        ar[nelms] = data;
        nelms++;
    }

    public int getSize(){
        return nelms;
    }

    public void display(){
        System.out.println("Array elements -- > ");
        for(int i = 0; i < nelms; i++){
            System.out.println(ar[i]);
        }
        System.out.println(" ");
    }

    public void bubbSort(){
        // comparing the adjacent element and swapping if a higher number is
        // found and continuing this for the total number of elements in the array
        // since the inside loop is comparing wwith the adjacent element it needs
        // to have one less element.
        for(int i = 0; i < nelms; i++){
            for(int j = 0; j < nelms  - 1; j++){
                if(ar[j] > ar[j + 1]){
                    int temp;
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    // swap(j , (j+1));
                }
            }
        } //  end of for loop
    }

    public void swap(int q , int w){
        int temp;
        temp = ar[q];
        ar[q] = ar[w];
        ar[w] = temp;
    }

    // implementation for the Quick sort algorithm
    public void quickSort(int stindex, int endindex){
        // recursively you have to sort both the partitioned array
        // lower array as well as higher array and then
        // merge both the arrays
        if(stindex < endindex){
            int partindex = partitionArray( stindex, endindex );
            quickSort(stindex, partindex -1);
            quickSort(partindex + 1,endindex);
        }
    }
    // Main part of the Quicksort algorithm
    public int partitionArray( int inx, int iny){
        int pivot = ar[iny];
        int index = inx;
        for(int i = inx; i < iny; i++){
            if(ar[i] <= pivot){
                swap(i, (index));
                index++;
            }
        }
        swap(index, iny);
        return index;
    }

    // simple merge sort using a third array for transferring the elements
    // also using 2 additonal data structures for dividing the array
    // into 2 halves- this part is basically without using recursion
    public void simplemergeSort(){
        int[] arlow;
        int[] arhig;
        if(ar.length%2 == 0){
            arlow = new int[ar.length/2];
            arhig = new int[arlow.length];
            for(int i = 0; i < arlow.length; i++){
                arlow[i] = ar[i];
            }
            for(int i = 0; i < arlow.length; i++){
                arhig[i ] = ar[i + arlow.length];
            }
        }
        else{
            arlow = new int[(ar.length+1)/2];
            arhig = new int[ar.length  - arlow.length];
            for(int i = 0; i < arlow.length; i++){
                arlow[i] = ar[i];
            }
            for(int i = 0; i < arhig.length; i++){
                arhig[i ] = ar[i + arlow.length];
            }
        }
        // need 2 counter for checking whether it has reached the end
        // of the array or not

        int[] newarray = new int[ar.length];
        int ix = 0;
        int iy = 0;
        int ic = 0;
        while(ix < arlow.length && iy < arhig.length){
            if(arlow[ix] < arhig[ix]){
                ar[ic] = arlow[ix];
                ix = ix +1;
                ic = ic + 1;
            }
            else{
                ar[ic] = arhig[iy];
                iy = iy+1;
                ic = ic + 1;
            }
        } // end of while loop
        while(ix < arlow.length){
                ar[ic] = arlow[ix];
                ix = ix +1;
                ic =ic +1;
        }
        while(iy < arhig.length){
            ar[ic] = arlow[iy];
            iy = iy +1;
            ic++;
        }
    } // end of simple merge sort algorithm

    // main merge sort algorithm implementation


    public void mergeSort(){
        int[] mergeAr = new int[nelms];
        recMergeSort(mergeAr, 0 , (nelms-1));
    }

    public void recMergeSort(int[] a, int lowerbound, int upperbound){
        if(lowerbound == upperbound){
            return ;
        }
        else{
            int middle = (lowerbound + upperbound)/2;
            recMergeSort(a, lowerbound, middle);
            recMergeSort(a, (middle +1), upperbound);
            merge(a, (middle+1), lowerbound, upperbound);
        }

    }
    public void merge(int[] ad, int highptr, int lowptr, int upperbound){
        int  j = 0;
        int lowbound = lowptr;
        int mid = highptr - 1;
        int n = upperbound - lowbound + 1;
        while(lowptr <= mid && highptr <= upperbound){
            if(ar[lowptr] < ar[highptr]){
                ad[j++] = ar[lowptr++];
            }
            else{
                ad[j++] = ar[highptr++];
            }
        }
        while(lowptr <= mid) {
            ad[j++] = ar[lowptr++];
        }
        while(highptr <= upperbound ) {
            ad[j++] = ar[highptr];
        }
        for(int k = 0; k< n; k++){
            ar[k+lowbound] = ad[k];
        }

    }// end of merge program

    // program for selection sort
    public void selectionSort(){
        int min;
        for(int i = 0 ; i < ar.length ; i++){
            min = i;
            for(int j = i + 1; j < ar.length; j++){
                if(ar[j] < ar[min]){
                    min = j;
                }
            }
            swap(i, min);
        } // end of for loop
    }

} /// end of the class
