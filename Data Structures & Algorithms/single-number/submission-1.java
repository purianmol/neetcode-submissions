class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for(int el:nums){
            x^=el;
        }
        return x;
    }
}
