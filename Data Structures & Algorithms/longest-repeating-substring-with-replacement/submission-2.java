class Solution {
    public int characterReplacement(String str, int k) {
        int[] freq = new int[26];
        int n = str.length();
        int s = 0;
        int max = 0;
        int maxFreq = 0;
        for(int e = 0;e<n;e++){
            freq[str.charAt(e) - 'A']++;
            maxFreq = Math.max(maxFreq,freq[str.charAt(e)-'A']);
            if((e-s+1)-maxFreq>k){
                freq[str.charAt(s)-'A']--;
                s++;
            }
            max = Math.max(max,e-s+1);
        }
        return max;
    }
}
