/**
 * Created by biplabkumardas on 2/21/17.
 */
public class balancedSmiley {
    public static void main(String[] args){
        String s;
        System.out.println(checkBalance(s = ":):)"));
        System.out.println(checkBalance(s = "hacker (:)"));
        System.out.println(checkBalance(s = "hacker (:()"));
        System.out.println(checkBalance(s = "hacker )("));
        System.out.println(checkBalance(s = "hacker :(("));
    }

    public static String checkBalance(String str){
        int len  = str.length();
        char open = '(';
        char colon = ':';
        char close = ')';
        int maxopen = 0;
        int minopen = 0;
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == open){
                maxopen = maxopen + 1;
                if(i == 0 || str.charAt(i - 1) == colon){
                    minopen = minopen + 1;
                }
            }else if(str.charAt(i) == close){
                minopen--;
                if(minopen < 0){
                    minopen = 0;
                }
                if(i == 0 || str.charAt(i - 1) == colon){
                    maxopen--;
                    if(maxopen < 0){
                        break;
                    }
                }
            }
        }

        if(maxopen >= 0 && minopen == 0){
            return "YES";
        }
        else{
            return "False";
        }
    }
}
