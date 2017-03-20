import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
/**
 * Created by biplabkumardas on 3/19/17.
 */
public class Example1 {
    // integer work


    // finding the position where the words meets in the given string
    public ArrayList indices(String s, String[] words){
       int res = 0;
        // STORE THE WORD VALUES IN THE HASHSET AND THEN COMPARE WITH EACH OF THEM.
        // IF THERE ARE 2 VALUES THEN THE MAXIMUM NUMBER OF WAYS THAT CAN BE ARRANGED IS 2.
        // HOWEVER IF THE NUMBER OF WORDS GIVEN IN THE WORDS ARRAY IS 3 THEN THE
        // MAXIMUMM NUMBER OF POSSIBLE WAYS WILL BE  ABC, ACB, CBA, CAB, BAC, BCA - 6
        // main question here is how to generalize the solution.
        HashSet<String> list = new HashSet<>();
        String concatword = "";
        for(int k = 0; k < words.length; k++){
            concatword = concatword + words[k];
        }
        char[] arr = concatword.toCharArray();
        Arrays.sort(arr);
        String concat = new String(arr);
        list.add(concat);
        System.out.println(list);
        int len = concat.length();
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0; i < s.length() - len; i++){
            String temp = s.substring(i, len + i);
            char[] tmp = temp.toCharArray();
            Arrays.sort(tmp);
            String tm = new String(tmp);
            if(list.contains(tm)){
                count.add(i);
            }
        }
        return count;
    }


    public static void main(String[] args){
        Example1 ex = new Example1();
        String s = "abarfootheafoobarmanasd";
        String[] words = new String[]{"foo", "bar", "man"};
        System.out.println(ex.indices(s, words));


    }



}
