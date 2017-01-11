/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author biplabkumardas
 */
public class Arry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> arint = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> row1 = new ArrayList<Integer>();
            int d = in.nextInt();
            for(int j = 0; j < d; j++){  
                row1.add(in.nextInt());
            }
            arint.add(row1);
        }
            int q = in.nextInt();
            for(int r = 0; r < q; r++){
                int x = in.nextInt();
                int y = in.nextInt();
                System.out.println(arint.get(r).size());
                System.out.println("awesome");
                if((x-1) > arint.get(r).size()){
                    System.out.println("ERROR!");
                }
                else{
                    if((y-1) > arint.get(r).size()){
                        System.out.println("ERROR!");
                    }
                    else if((y-1) == arint.get(r).size()){
                        System.out.println(arint.get(x - 1).get(y - 1));
                    }
                    else{
                        System.out.println(arint.get(x - 1).get(y - 1));
                    }   
                }
            }
        
        //System.out.println(arint);
    }
  
}
