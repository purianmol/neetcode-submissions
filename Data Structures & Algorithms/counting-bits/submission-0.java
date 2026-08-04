class Solution {
    public int[] countBits(int n) {
        int offset = 0;
        int pow = 1;
        int[] dp = new int[n+1];
        for(int i = 1;i<n+1;i++){
            if(i>= pow){
                offset = pow;
                pow*=2;
            }
            dp[i] = 1+dp[i-offset];
        }
        return dp;
    }
}
