class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i =2;i<=cost.length;i++){
            int a = dp[i-1]+cost[i-1];
            int b = dp[i-2]+cost[i-2];
            dp[i] = Math.min(a,b);
        }
        return dp[cost.length];
    }
}
