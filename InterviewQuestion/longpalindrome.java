import java.util.HashSet;

/**
 * Created by biplabkumardas on 2/28/17.
 */
public class longPalindrome {
    public static void main(String[] args){
        String str = "anabbnayan";
        longPalindrome lp = new longPalindrome();
        System.out.println(lp.longpalindrome(str));
    }

    public String longpalindrome(String str){
        String result = "";
        String temp ;
        int len = 1;
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i + 1; j < str.length(); j++){
                temp = str.substring(i, j+1);
                if(isPalindrome(temp)){
                    if(len < (j -i)){
                        len = j-i;
                        result = temp;
                    }
                }
            }
        }
        return result;
    }

    public boolean isPalindrome(String inp){
        String rev = "";
        for(int  i = 0; i < inp.length(); i++){
            rev = rev + inp.charAt(inp.length() - i-1);
        }
        if(rev.equals(inp)){
            return true;
        }
        return false;
    }
}
