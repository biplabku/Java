/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_left_rotation;

import java.util.Scanner;

/**
 *
 * @author biplabkumardas
 */
public class Array_left_rotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        // getting the numbers for the array.
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // code for the left rotation
        int temp, temp2;
        if(k == n){
            for(int j = 0; j < n; j++){
               System.out.print(a[n - 1 - j]+ " "); 
            }
        }// code for reversing the sequence if the d < n
        else{
            for(int  i = 0; i < k; i++){ // this indicates the number of shift in total
                temp = a[0];
                for(int s = 0; s < n-1; s++){ // n shifts
                    a[s] = a[s + 1];              
                }
                a[n-1] = temp;
            }
            for(int j = 0; j < n; j++){
               System.out.print(a[j ]+ " "); 
            }
        }
    }
}
