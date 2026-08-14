class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max_profit = 0;
        while(sell<prices.length){
            if(prices[buy]<prices[sell]){
                max_profit = Math.max(max_profit,prices[sell]-prices[buy]);
            }
            else{
                buy = sell;
            }
            sell+=1;
        }
        return max_profit;
    }
}
