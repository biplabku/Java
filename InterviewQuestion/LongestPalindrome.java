package palindrome;

public class LongestPalindrome {
	
	// using Brute force
  // Complexity - O(n3)
	public static void main(String[] args){
		String st = "attabababab"; 
		// finding the longest pallindrome from the given sequence 
		System.out.println(findlongestpalindrome(st));
		//System.out.println(ispalindrome1("atata"));
	}
	public static String findlongestpalindrome(String st){
		String largPalin = "";
		int palinLength = 0;
		String s = "";
		for(int i = 0; i < st.length(); i++){
			s = s + st.charAt(i);
			for(int j = i + 1; j < st.length(); j++){
				s = s + st.charAt(j);
				if(ispalindrome(s)){
					if(palinLength < s.length()){
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
	
	
	public static boolean ispalindrome1(String input){
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) != input.charAt(input.length() - i - 1)){
				return false;
			}
		}
		return true;
	}
}
