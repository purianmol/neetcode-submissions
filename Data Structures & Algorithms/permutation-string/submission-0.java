class Solution {
    int[] s1_freq = new int[26];
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int n = s1.length();

        for(int i =0;i<n;i++){
            int index = s1.charAt(i)-'a';
            s1_freq[index]++;
        }
        int s = 0;
        for(int e = 0;e<s2.length();e++){
            int index = s2.charAt(e)-'a';
            freq[index]++;
            if(e-s+1 > n){
                freq[s2.charAt(s)-'a']--;
                s++;
            }
            if(e-s+1 == n){
                if(compare(freq))return true;
            }
        }

        return false;
    }
    boolean compare(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] != s1_freq[i])return false;
        }
        return true;
    }
}
