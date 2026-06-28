class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int num:nums){
            arr[num]++;
        }
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            while(arr[j]<=0)j++;
            nums[i] = j;
            arr[j]--;
        }
    }
}