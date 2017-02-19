/**
 * Created by biplabkumardas on 2/19/17.
 */
public class counting {
    public static void main(String[] args){
        int[] ar = new int[]{2,1,5,9,6,7,3};
        countingsort(ar);
    }

    public static void countingsort(int[] ar){
        int[] b = new int[10];
        int[] c = new int[ar.length];
        for(int i = 0; i <= 9; i++){
            b[i] = 0;
        }
        for(int i = 0 ; i < ar.length; i++){
            b[ar[i]] = b[ar[i]] + 1;
        }

        for(int i = 1 ; i <= 9; i++){
            b[i] = b[i] + b[i - 1];
        }

        for(int i = ar.length -1 ; i >= 0; i--){
            b[ar[i]] = b[ar[i]] - 1;
            c[b[ar[i]]] = ar[i];
        }

        for(int i = 0; i < ar.length; i++){
            System.out.println(c[i]);
        }
    }
}
