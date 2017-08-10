
    // find the longest palindrome in the sequence
    public String longestPalindrome(String str){
		 // It works in O(N3) 
		 HashMap<Character, Integer> hmap = new HashMap<>();
		 int res = 0;
		 String ans = "";
		 String out = "";
		 for(int i = 0; i < str.length(); i++){
			 for(int j = i+1; j <= str.length(); j++){
				 ans = str.substring(i, j);
				 if(isPalindrome(ans)){
					 res = Math.max(res, ans.length());
					 out = out.length() > ans.length() ? out : ans; // comparison operator without using any loops and stuff
				 }
			 }
		 }
		 return out;
	 }

    public boolean isPalindrome(String str){
		 Stack<Character> st = new Stack<>();
		 for(int i = 0 ; i < str.length(); i++){
			 st.push(str.charAt(i));
		 }
		 
		 for(int i = 0 ; i < str.length(); i++){
			 if(st.pop() != str.charAt(i)){
				 return false;
			 }
		 }
		 return true;
	 }
