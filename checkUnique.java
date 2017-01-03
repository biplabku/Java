import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by biplabkumardas on 12/25/16.
 */
public class checkUnique {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        in.close();
        System.out.println(checkUniquechar(s1));
    }

    // Program for checking unique characters in a string
    static boolean checkUniquechar(String stm1){
        HashSet<Character> hs = new HashSet<>();
        for(int i= 0; i < stm1.length(); i++) {
            hs.add(stm1.charAt(i));
        }
        if(hs.size() != stm1.length()) {
            return false;
        }
        return true;
    }


}
