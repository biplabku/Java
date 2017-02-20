/**
 * Created by biplabkumardas on 2/20/17.
 */
public class merge {
    public static void main(String[] args){
        int[] ar = new int[]{9, 7, 4, 1, 8, 6, 3, 0};
        int[] temp = new int[ar.length];
        mergesort(ar, temp, 0,  ar.length -1 );
        System.out.println("The sorted array after the merge sort algorithm is given by  -- > " );
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }

    public static void mergesort(int[] ar, int[] temp, int startindex, int endindex){
        int middle  = (startindex + endindex)/2;
        if(startindex >= endindex){
            return ;
        }
        mergesort(ar, temp, startindex, middle);
        mergesort(ar, temp, middle+1, endindex);
        mergehalves(ar, temp, startindex, endindex);
    }

    public static void mergehalves(int[] arr, int[] temp, int leftstart, int rightend){
        int leftend = (rightend + leftstart)/2;
        int len = rightend - leftstart + 1;
        int left = leftstart;
        int rightstart = leftend + 1;
        int right = rightstart;
        int index = leftstart;
        while(left <= leftend && right <=  rightend){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }
            else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left, temp, index,leftend-left+1);
        System.arraycopy(arr, right, temp, index,rightend-right+1);
        System.arraycopy(temp, leftstart, arr, leftstart,len);
    }
}
