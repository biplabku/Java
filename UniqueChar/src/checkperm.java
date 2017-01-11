import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by biplabkumardas on 12/25/16.
 */
public class checkperm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        in.close();
        System.out.println(checkPermString(s1, s2));
    }
    // Checking the permutation of another string//
    static boolean checkPermString(String stm2, String stm3) {
        char[] s_1 = new char[stm2.length()];
        char[] s_2 = new char[stm3.length()];
        for(int i = 0; i < stm2.length(); i++){
            s_1[i] = stm2.charAt(i);
        }
        Arrays.sort(s_1);
        for(int i = 0; i < stm3.length(); i++){
            s_2[i] = stm3.charAt(i);
        }
        Arrays.sort(s_2);
        if (Arrays.equals(s_1,s_2)) {
            System.out.println(s_2);
            return true;
        }
        return false;
    }

}
