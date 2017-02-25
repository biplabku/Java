
    // find the longest palindrome in the sequence
    public String longestpalindrome(String str){
        HashSet<Character> hs = new HashSet<>();
        hs.add(str.charAt(0));
        int count = 0;
        String res = "";
        String out = "";
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i+1; j <= str.length(); j++){
                res = str.substring(i,j);
                if(isPalindrome(res)){
                    if(res.length() > count){
                        count = res.length();
                        out = res;
                    }
                }
            }
        }
        return out;
    }

    public boolean isPalindrome(String str){
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(!str.equals(rev)){
            return false;
        }
        return true;
    }
