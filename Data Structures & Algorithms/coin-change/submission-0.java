class Solution {
    int inf = Integer.MAX_VALUE-1;
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 1;i<=amount;i++){
            dp[0][i] = inf;
        }
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<=amount;j++){
                if(coins[i-1]<=j){
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount] == inf? -1:dp[n][amount];
    }
}
