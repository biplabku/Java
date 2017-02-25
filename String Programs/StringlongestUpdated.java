  public String longestSubstring(String str){
        // use hashset
        str = str.replaceAll("\\s", "");
        if(str.length() == 1){
            return str;
        }
        if(str == ""){
            return str;
        }
        HashSet<Character> hs = new HashSet<>();
        hs.add(str.charAt(0));
        int count = 0;
        String res = "";
        res = res + str.charAt(0);
        String out = "";
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i+1; j < str.length(); j++){
                //System.out.println(j);
                if(!hs.contains(str.charAt(j))){// does not contains
                    hs.add(str.charAt(j));
                    res = res + str.charAt(j);
                }else{
                    if(str.charAt(j-1) == str.charAt(j)){
                        hs.clear();
                        if(res.length() > count){
                            count = res.length();
                            out = res;
                        }
                        res = "";
                    }else{
                        hs.clear();
                        hs.add(str.charAt(j-1));
                        hs.add(str.charAt(j));
                        if(res.length() > count){
                            count = res.length();
                            out = res;
                        }
                        res = "";
                        res = res + str.charAt(j-1) + str.charAt(j);
                        continue;
                    }
                }
                //System.out.println("value at " +j+ " "+res);
            }
        }
        return out;
    }
