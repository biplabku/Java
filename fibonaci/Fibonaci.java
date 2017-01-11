/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

import java.util.Scanner;

/**
 *
 * @author biplabkumardas
 */
public class Fibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
    
      public static int fibonacci(int n) {

        // Complete the function.
        int[] out = new int[n + 1]; 
            for(int j = 0; j < n+1; j++){
                if( j == 0){
                    out[j] = 0;
                }
                else if(j == 1){
                    out[j] = 1;
                }
                else{
                    out[j] = out[j - 1] + out[j - 2];
                }
            }
            return out[n];
        }
    
}
