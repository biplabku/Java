import java.util.Arrays;

/**
 * Created by biplabkumardas on 2/20/17.
 */
public class highestnumber {
    public static void main(String[] args){
        String s = "235612443";
        nexthighest(s);
    }

    public static String nexthighest(String s){
        int len = s.length();
        int curr = 0;
        int succ = 0;
        // find the maximum number in the string and save its next highest number as well as the position
        for(int i = len - 1 ; i >= 1; i--){
            if(Integer.valueOf(s.charAt(i))  > Integer.valueOf(s.charAt(i - 1))){
                curr = i;
                succ = i - 1;
                swap(i, i - 1, s);
                break;
            }
        }



        return s;
    }

    public static void swap(int i, int j, String s){
        char[] ar = s.toCharArray();
        int len = s.length();
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        char[] newar = Arrays.copyOfRange(ar, i , len);
        Arrays.sort(newar);
        int p = 0;
        for(int w = i ; w < len; w++){
            ar[w] = newar[p];
            p = p + 1;
        }
        String newstring;
        newstring = String.valueOf(ar);
        s = newstring;
        System.out.println(s);
    }
}
