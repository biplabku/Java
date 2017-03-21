
    public  ArrayList<Integer> indicesHash(String s, String[] words) {
        int len = words[0].length();
        HashMap<String, Integer> hmap = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(!hmap.containsKey(words[i])){
                hmap.put(words[i], 1);
            }else{
                hmap.put(words[i], hmap.get(words[i] +1));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0){
            return result;
        }
        for (int i = 0; i <= s.length() - len * words.length; i++) {
            HashMap<String, Integer> temp = new HashMap<>(hmap);
            for (int j = 0; j < words.length; j++) {
                String str = s.substring(i + j*len, i + j*len + len);
                if (temp.containsKey(str)) {
                    int count = temp.get(str);
                    if (count == 1){
                        temp.remove(str);
                    } else{
                        temp.put(str, count - 1);
                    }
                    if (temp.isEmpty()) {
                        result.add(i);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return result;
    }
