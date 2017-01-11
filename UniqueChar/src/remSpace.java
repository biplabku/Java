import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by biplabkumardas on 12/26/16.
 */
public class remSpace {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // check and remove the space and replace it with %20;
        char[] str = s.toCharArray();
        int  n = checkLastchar(str);
        replaceStr(str, n);

    }
    public static int checkLastchar(char[] st){
        // logic- increment the counter when its not equal " " space
        for(int i=st.length - 1; i >=  0; i--){
            if(st[i] != ' '){
                return i;
            }
        }
        return st.length;
    }
    public static void replaceStr(char[] stmp, int len){
        int countSpace = 0;
        int countLettr = 0;
        // easy implementation by using array list or any other data structures but the problem lies in removing the ', ' and other extra datas

        for(int i = 0; i < stmp.length; i++ ){
            if(stmp[i] == ' '){
                countSpace = countSpace + 1;
            }
            else{
                countLettr = countLettr + 1;
            }
        }
        int k = 0;
        int actLen = 3*countSpace + countLettr;
        char[] a = new char[actLen];
        for(int j = 0; j < len+1; j++){
            if(stmp[j] != ' '){
                a[j+k] = stmp[j];
            }
            else{
                a[j + k] = '%';
                a[j + k + 1] = '2';
                a[j + k + 2] = '0';
                k = k   +2;
            }
        }
        System.out.println(a);
    }
}
