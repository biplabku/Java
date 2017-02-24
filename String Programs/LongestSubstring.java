import java.util.HashSet;

/**
 * Created by biplabkumardas on 2/24/17.
 */
public class Palindrome {
    // program for calculating the longest unrepeated substring
    // find the largest substring from a given string
    public static void main(String[] args){
        String str = "pwwkew";
        Palindrome  p = new Palindrome();
        System.out.println(p.longestSubstring(str));
    }

    public String longestSubstring(String str){
        // use hashset
        HashSet<Character> hs = new HashSet<>();
        hs.add(str.charAt(0));
        int count = 0;
        String res = "";
        res = res + str.charAt(0);
        String out = "";
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i+1; j < str.length(); j++){
                if(!hs.contains(str.charAt(j))){
                    hs.add(str.charAt(j));
                    res = res + str.charAt(j);
                }else{
                    hs.clear();
                    hs.add(str.charAt(j));
                    //System.out.println(res);
                    if(res.length() > count){
                        count = res.length();
                        out = res;
                    }
                    res = "";
                    res = res + str.charAt(j);
                    continue;
                }
            }
        }
        return out;
    }

}
