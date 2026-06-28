class Solution {
    public int maxArea(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        int area = 0;
        while(l<r){
            int curr = Math.min(arr[l],arr[r])*(r-l);
            area = Math.max(area,curr);
            if(arr[l]>arr[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return area;
    }
}
