class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int n = piles.length;
        for(int pile: piles){
            max = Math.max(max,pile);
        }
        if(h == n){
            return max;
        }
        int start = 1;
        int end = max;
        int ans = max;
        while(start<=end){
            int mid = start + (end - start)/2;
            long hr = 0;
            for(int pile : piles){
                hr += (pile + mid - 1) / mid;
            }
            if(hr>h){
                start = mid+1;
            }
            else{
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
}
