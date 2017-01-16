import java.util.Arrays;

/**
 * Created by biplabkumardas on 1/5/17.
 */
public class checkAnagramIndex {
    public static void main(String[] args){
        String haystac = "ABCD";
        String needl = "CD";
        //System.out.println(strStr(haystac, needl));
        System.out.println(searchAnagramSubstring(haystac, needl));
    }


    // this function is only for finding the first occurence of the pattern
    public static int strStr(String haystack, String needle) {
        if (needle == null || haystack == null)
            return -1;
        if (needle.length() > haystack.length())
            return -1;

        int nlength = needle.length();

        for (int i = 0; i <= haystack.length() - nlength; i++) {
            if (haystack.substring(i, i + nlength).equalsIgnoreCase(needle)) {
                return i;
            }
        }

        return -1;
    }
    private static boolean equalHistogram(int[] hist1, int[] hist2){

        for(int i = 0; i < hist1.length; i++){
            if(hist1[i] != hist2[i]){
                return false;
            }
        }

        return true;
    }

    public static int searchAnagramSubstring(String text, String pattern){
        int count = 0;
        int n = text.length();
        int m = pattern.length();
        System.out.println(n +" "+  m);
        if(n < m | m == 0 | m == 0){
            return 0;
        }

        int textHist[] = new int[256];
        int patHist[] = new int[256];

        //initial histogram window of size m
        int i = 0 ;
        for( i = 0; i < m; i++){
            patHist[pattern.charAt(i)]++;
            System.out.println(patHist[pattern.charAt(i)]++);

            textHist[text.charAt(i)]++;
            //System.out.println(textHist[text.charAt(i)]++);
        }
        System.out.println();
        //search the pattern histogram in a sliding window of text histogram
        do{
            //O(1) time check as array size is constant
            if(equalHistogram(textHist, patHist)){
                System.out.println("anagram found : "+text.substring(i-m, i));
                System.out.println(i-m);
                count++;
            }

            //slide the text histogram window by 1 position to the right and check for anagram
            textHist[text.charAt(i)]++;
            textHist[text.charAt(i-m)]--;
        } while(++i < n);

        if(equalHistogram(patHist, textHist)){
            System.out.println("anagram found : "+ (n-m));
        }
        return count;
    }



}
