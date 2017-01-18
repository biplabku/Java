/**
 * Created by biplabkumardas on 12/19/16.
 * Program for checking whether the 2 strings are anagrams
 */
import java.util.*;
import java.lang.String;
public class Ana {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(checkAna(a, b));

    }
    public static boolean checkAna(String a1,  String b1){
        int len = a1.length();
        String compA = a1;
        String tmp1, tmp2, tempa;
        if(len != b1.length()){
            return false;
        }
        else {
            int max = 0;
            for(int i = 0; i < len; i++){
                for(int j = 0; j < len; j++) {
                    //System.out.println(len-1);
                    //a1 = a1.substring(1, 4);
                    if (a1.charAt(i) != b1.charAt(j)) {
                        max = 0;
                    }
                    else {
                        max = 1;
                        if(a1.charAt(i) == b1.charAt(0)) {
                            tmp1 = b1.substring(i, len-1);
                            b1 = tmp1;
                            break;
                        }
                        else if(a1.charAt(i) == (b1.charAt(len-1))) {
                            tmp1 = b1.substring(i, len - 2);
                            b1 = tmp1;
                            break;
                        }
                        else{
                            tmp1 = b1.substring(i, j - 1);
                            tmp2 = b1.substring(j + 1, len - 1);
                            b1 = tmp1.concat(tmp2);
                            break;
                        }
                    }
                }
            }
            if(b1 == "null"){
                return true;
            }
            else {
                return false;
            }
        } // end of else statement
    }
}
