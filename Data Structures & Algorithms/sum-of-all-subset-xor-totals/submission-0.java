class Solution {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
    int backtrack(int[] arr,int i,int curr){
        if(i == arr.length) return curr;
        int include = backtrack(arr,i+1,curr^arr[i]);
        int exclude = backtrack(arr,i+1,curr);
        return include + exclude;
    }
}