/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmzerosum;

import java.util.HashMap;

/**
 *
 * @author biplabkumardas
 */
public class HMzerosum {

    /**
     * @param args the command line arguments
     */
    public static void main(String arg[])
    {
        int arr[] = {4, 2, -3, 1, 6};
        if (printZeroSumSubarray(arr))
            System.out.println("Found a subarray with 0 sum");
        else
            System.out.println("No Subarray with 0 sum");            
    }
    public static boolean printZeroSumSubarray(int[] ar){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < ar.length; i ++){
            hm.put(i, ar[i]);
            System.out.println(hm.get(i));
            sum = sum + hm.get(i);
            if()
        }
        
        return false;
    }
}
