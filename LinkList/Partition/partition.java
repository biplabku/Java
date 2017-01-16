/**
 * Created by biplabkumardas on 1/7/17.
 */
class partition {
    private long[] arr;
    private int nelms;

    public partition(int s){
        arr = new long[s];
        nelms = 0;
    }

    public void insert(long s1){
        arr[nelms] = s1;
        nelms++;
    }

    public int size(){
        return nelms;
    }

    public void display(){
        for(int  i = 0; i < size(); i++){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }

    // main program for partition
    // it is helpful for carrying out the quicksort algorithm
    // for sorting elemnts, but in case of partion
    // it just divides the elms into 2 sets of higher and
    // lower/\.
    public int partitionelems(long piv, int left, int right){
    // description of the algorithm-- here we use 2 pointers basically array indice locations pointing to extreme ends of the array and
        // then  we move towards each other comparing the value of the pivot with the
        // array elements and according to their value bigger or smaller we basically
        // do the sorting
        int leftptr = left - 1;
        int rightptr = right + 1;
        while(true){
            while(leftptr < right && piv > arr[++leftptr] );
            while(rightptr > left && piv < arr[--rightptr]);
            if(leftptr >= rightptr){ // already sorted no elements left
                break;
            }
            else{
                swapnum(leftptr, rightptr);
            }
        } // end of while loop (outer);
        swapnum(leftptr, right);
        return leftptr;
    }

    public void swapnum(int k , int l){
        long temp;
        // just needs to be swapped, you dont have to check
        // here since it is already checked in the partition
        // algorithm
        temp = arr[k];
        arr[k] = arr[l];
        arr[l] = temp;
    }

    // need to implement the same for the Quick sort algorithm
    // basically it uses the partition algorithm for carrying out Quicksort algorithm
    public int partitionelemsforQuickSort(long piv, int left, int right){
        // description of the algorithm-- here we use 2 pointers basically array indice locations pointing to extreme ends of the array and
        // then  we move towards each other comparing the value of the pivot with the
        // array elements and according to their value bigger or smaller we basically
        // do the sorting
        int leftptr = left - 1;
        int rightptr = right + 1;
        while(true){
            while(piv > arr[++leftptr] );
            while(rightptr > 0 && piv < arr[--rightptr]);
            if(leftptr >= rightptr){ // already sorted no elements left
                break;
            }
            else{
                swapnum(leftptr, rightptr);
            }
        } // end of while loop (outer);
        swapnum(leftptr, right);
        return leftptr;
    }


    public void recQuicksort(int lft, int rght){
        if(rght-lft <= 0){
            return;
        }
        else{
            long pivot1 = arr[rght];
            int partition = partitionelemsforQuickSort(pivot1, lft, rght);
            recQuicksort(lft, partition - 1);
            recQuicksort(partition+1, rght);
        }
    }

    public void QuickSort(){
        recQuicksort(0,nelms -1);
    }

}
