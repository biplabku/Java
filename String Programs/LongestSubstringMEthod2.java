  public String longestMethod2(String str){
        HashSet<Character> hs = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxlen = 0;
        String res = "";
        int len = str.length();
        while(i < len && j < len){
            if(!hs.contains(str.charAt(j))){
                hs.add(str.charAt(j++));
                maxlen = Math.max(maxlen, (j - i));
                res = str.substring(i,j);
                j++;
            }else{
                hs.remove(str.charAt(i++));
            }
        }
        return res;
    }
