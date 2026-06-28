class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int[] maxRight = new int[n];
        maxRight[n-1] = 0;
        int max = maxRight[n-1];
        for(int i = n-2;i>=0;i--){
            max = Math.max(arr[i+1],max);
            maxRight[i] = max; 
        }
        int ans  = 0;

        for(int i = 0;i<n;i++){
            ans = Math.max(ans,maxRight[i]-arr[i]);
        }
        return ans;
    }
}
