class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int i = 0;
        int n = nums.length;
        for(int el: nums){
            arr[i] = el;
            arr[n+i] = el;
            i++;
        }
        return arr;
    }
}