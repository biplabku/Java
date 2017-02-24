package palindrome;

import java.util.HashSet;

public class LongestPalindrome {
	

	public static void main(String[] args){
		String st = "abtaavta"; 
		// finding the longest pallindrome from the given sequence 
		//System.out.println(findlongestpalindrome(st));
		//System.out.println(ispalindrome1("atata"));
		System.out.println(isdistinct(st,3));
	}

	
	// to find the number of distinct elements;
	public static boolean isdistinct(String input, int count){
		int distinct = 0;
		if(input == null){
			return false;
		}
		if(input.length() == 1){
			return true;
		}
		int len = input.length();
		HashSet<Character> hs = new HashSet<>();
		for(int i = 0; i < len; i++){
			if(!hs.contains(input.charAt(i))){
				distinct++;
				//System.out.println(distinct + " " + !hs.contains(input.charAt(i)) + " " + input.charAt(i)  );
				if(distinct > count){
					return false;
				}
			}
			if(hs.contains(input.charAt(i))){
				distinct--;
			}
		}
		return true;
	}
	
	
	
	public static String findlongestpalindrome(String st){
		String largPalin = "";
		int palinLength = 0;
		String s = "";
		for(int i = 0; i < st.length(); i++){
			s = s + st.charAt(i);
			for(int j = i + 1; j < st.length(); j++){
				s = st.substring(i,j);
				//s = s + st.charAt(j);
				if(ispalindrome(s)){
					if(palinLength < s.length() ){
						palinLength = s.length();
						largPalin = s;
					}
				}
			}
			s = "";
		}
		return largPalin;
	}
	public static boolean ispalindrome(String input){
		if(input == null){
			return false;
		}
		if(input.length() == 1){
			return true;
		}
		int len = input.length() - 1;
		int halflen = input.length()/2;
		for(int i = 0 ; i < halflen; i++ ){
			if(input.charAt(i) != input.charAt(len)){
				return false;
			}
			len--;
		}
		return true;
	}
	
}
