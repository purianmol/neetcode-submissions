class Solution {
    public int mySqrt(int x) {
        if(x <=1){
            return x;
        }
        int ans = -1;
        int start = 2;
        int end = x;
        while(start<=end){
            int mid = start + (end-start)/2;
            long sq = (long)mid*mid;
            if(sq == x){
                return mid;
            }
            if(sq>x){
                end = mid-1;
                
            }
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}