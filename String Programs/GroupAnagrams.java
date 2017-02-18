import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by biplabkumardas on 2/18/17.
 */
public class groupAnagrams {
    public static void main(String[] args){
        String[] input = new String[]{"cheating", "teaching","apple","paple", "mist", "helo" , "hot", "toh"};
        String[] hm = new String[input.length];
        for(int i = 0; i < input.length; i++){
            char[] a = input[i].toCharArray();
            Arrays.sort(a);
            hm[i] = String.copyValueOf(a);
        }
        int count = 0;
        int len = input.length;
        for(int i = 0; i < len; i++){
            char[] a = input[i].toCharArray();
            Arrays.sort(a);
            String s2 = String.copyValueOf(a);
            count = check( hm, s2, i);
            if(count != -1){
                System.out.println(input[i] + ", "+ input[count]);
            }
        }
    }

    public static int check( String[] s, String input, int index){
       for(int j = (index+1); j < s.length; j++){
           if(input.equals(s[j])){
               return j;
           }
       }
       return  -1;
    }
}
