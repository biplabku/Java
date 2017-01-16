import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by biplabkumardas on 1/4/17.
 */
public class compString {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(checkcompString(s));
    }

    public static String checkcompString(String name){
        char[] as = name.toCharArray();
        // code for compressing string. needs to be sorted
        Arrays.sort(as);
        String out = " " ;
        int count = 0;
        int len = as.length;
        for(int i = 0; i < len-1; i++){
            count = count + 1;
            if(as[i] == as[i + 1]){
                count = count + 1;
            }
            out = out + as[i] + count;
            i = i + count;
            count = 0;

        }
        return out;
    }

}
