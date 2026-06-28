class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        return Math.min(cost(dp,cost,0),cost(dp,cost,1));
    }
    int cost(int[] dp,int[] cost,int i){
        if(i >= cost.length)return 0;
        if(dp[i] != 0) return dp[i];
        int a = cost[i] + cost(dp,cost,i+1);
        int b = cost[i] + cost(dp,cost,i+2);
        return dp[i] = Math.min(a,b);
    }
}
