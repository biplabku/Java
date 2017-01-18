/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remdupusinghash;

import java.util.LinkedHashSet;

/**
 *
 * @author biplabkumardas
 */
public class RemDupUsingHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        String str = "aabbccddaa";
        removeDuplicates(str);
    }
    /* Function removes duplicate characters from the string
    This function work in-place */
    public static void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0; i < str.length(); i++)
            lhs.add(str.charAt(i));
         
        // print string after deleting duplicate elements
        for(char ch : lhs)
            System.out.print(ch);
    }
    
}
