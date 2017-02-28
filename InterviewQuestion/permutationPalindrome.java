// Reference - from Cracking the coding interview
import java.util.HashSet;

/**
 * Created by biplabkumardas on 2/28/17.
 */
public class longPalindrome {
    public static void main(String[] args){
        String str = "Tact coa";
        int[] arr = new int[]{1,2,1,2,3,1,1,1,1,1};
        int num = 5;
        longPalindrome lp = new longPalindrome();
        //System.out.println(lp.longpalindrome(str));
        //System.out.println(lp.sumofarr(arr, num));
        System.out.println(lp.isPermutationofPalindrome(str));
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


    // that is here we have to find a set of numbers whose sum is equal to a given number and we have to find the
    // such a set of number that has maximum set of numbers.
    // int[] arr = new int[]{1,2,1,2,3,7,1,3,2,1};

    // time complexity for the mentioned problem is O(N2). Can it be reduced to lesser than On2. 3 for loops- O(n3)
    public int sumofarr(int[] arr, int num){
        int reslen = 0;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j <= arr.length; j++) {
                if(checksum(i,j, arr, num)) {
                    count = j - i;
                    if(reslen < count){
                        reslen = count;
                    }
                }
            }
        }
        return reslen;
    }

    public boolean checksum(int x, int y, int[] arr, int num){
        int sum = 0;
        for(int i = x; i < y; i++){
            sum = sum + arr[i];
        }
        if(sum == num){
            return true;
        }
        return false;
    }



    public boolean isPermutationofPalindrome(String str){
        int[] table = checkCountofChar(str);
        return checkMAxoneOdd(table);
    }

    public boolean checkMAxoneOdd(int[] table){
        boolean foundOdd = false;
        for(int count : table){
            System.out.println(count);
            if(count %2 == 1){
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    // this part of the code decides where the letter or the count needs to be located
    public int getCharNumber(char c){
        int a = Character.getNumericValue('a');
        //System.out.println(a);
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            //System.out.println(val-a);
            return val - a;
        }
        return -1;
    }

    // updating the location with its count
    // so that we need to check only the number of counts of each character that
    // has occured in the table. if there is more than one character that is in odd factor then there can not be a
    // permutation of a palindrome.
    public int[] checkCountofChar(String str){
        int[] table;
        table  = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(char c :str.toCharArray()){
            int x = getCharNumber(c);
            if(x != -1){
                table[x] = table[x] + 1;
            }
        }
        return table;
    }
}
