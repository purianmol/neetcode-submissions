class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); 
        int l = 0;
        int r = 0;
        int n = s.length();
        int max_len = 0;
        while(r<n){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            max_len = Math.max(max_len,r-l+1);
            r++;
       }
       return max_len;
    }
}
