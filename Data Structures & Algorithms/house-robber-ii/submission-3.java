class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];
        if(n == 2)return Math.max(nums[0],nums[1]);
        int[] a = new int[n-1];
        int[] b = new int[n];
        a[0] = nums[0];
        a[1] = Math.max(nums[0],nums[1]);
        b[1] = nums[1];
        b[2] = Math.max(nums[1],nums[2]);
        for(int i = 2;i<n-1;i++){
            a[i] = Math.max(a[i-2]+nums[i],a[i-1]);
        }
        for(int i = 3;i<n;i++){
            b[i] = Math.max(b[i-2]+nums[i],b[i-1]);
        }
        return Math.max(a[n-2],b[n-1]);
    }
}
