import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
/**
 * Created by biplabkumardas on 1/4/17.
 */
public class checkPerm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String d = in.nextLine();
        System.out.println(perm(s,d));

    }

    public static boolean checkPerm(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String s_1 = arsor(s1);
        String s_2 = arsor(s2);
        if(s_1.equals(s_2)){
            return true;
        }
        else{
            return false;
        }

    }

    public static String arsor(String srt){
        char[] srt_1= srt.toCharArray();
        Arrays.sort(srt_1);
        return new String(srt_1);
    }

    public static boolean perm(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] letter = new int[128];
        for(int i = 0; i <s.length(); i++){
            letter[s.charAt(i)] = letter[s.charAt(i)]+1; // ++ indicates it is incrementing one place
            System.out.println(letter[s.charAt(i)]);
        }
        for(int j = 0; j <t.length(); j++){
            letter[t.charAt(j)]--;
            if(letter[t.charAt(j)] < 0){
                return false;
            }
        }
        return true;
    }
    //
}
