// facebook interview question
// Count and say
// count the number of same digits in a number and compute a string such the number of times the digit is repeated
// is shown previous to it.
// for example = 11 = 21, 121 = 111211, 3344 = 2324
import java.util.HashSet;

/**
 * Created by biplabkumardas on 2/28/17.
 */
public class CountAndSay {
    public static void main(String[] args){
        int number = 111122;
        CountAndSay cs = new CountAndSay();
        System.out.println(cs.Countandsay(number));
    }


    public String Countandsay(int number){
        String str = String.valueOf(number);
        HashSet<Character> hs = new HashSet<>();
        int count = 1;
        String result = "";
        String prev = "";
        for(int i = 0 ; i < str.length(); i++){
            if(!hs.contains(str.charAt(i))){
                count = 1;
                hs.add(str.charAt(i));
                prev = result;
                result = result + count + str.charAt(i);
            }else{
                count++;
                result = prev + count +str.charAt(i);
            }
        }
        return result;
    }
}
