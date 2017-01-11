/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runmedian;
import java.util.Scanner;
/**
 *
 * @author biplabkumardas
 */
public class RunMedian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double median;
        Scanner in = new Scanner(System.in);
        // number of elements 
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();   
            median = (double)arsort(a, a_i);
            //median = (double)(runmed(a, a_i));
            System.out.println(median);
        }  
    }
    public static double arsort(int[] sorta, int k){
        int temp;
        k = k + 1;
        int[] ar =new int[k];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k - 1; j++ ){
                if(sorta[j] > sorta[j + 1]){
                    temp = sorta[j + 1];
                    sorta[j + 1] = sorta[j];
                    sorta[j] = temp;
                }
            }
        }
        double med; 
        // code for median
        if(k%2 != 0 ){
            //means length is odd  
            return ((double)sorta[k/2]);
        }
        else if(k == 1){
            return (double)sorta[0];
        }
        else{
            return (((double)sorta[k/2 -1] + (double)sorta[k/2])/2);
        }
    }
    
}
