    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        String res = "";
        HashMap<Character, Integer> hm = new HashMap<>(); 
        for (int j = 0, i = 0; j < n; j++) {
            if (hm.containsKey(s.charAt(j))) {
                i = Math.max(hm.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            hm.put(s.charAt(j), j + 1);
        }
        return ans;
    }
