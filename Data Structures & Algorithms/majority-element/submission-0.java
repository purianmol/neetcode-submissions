class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int majorityCount = 0;
        for(int num:nums){
            if(majority != num){
               if(majorityCount == 0){ 
                majority = num;
                majorityCount++;
               }
               else{
                majorityCount--;
               }
            } 
            else{
                majorityCount++;
            }
        }
        return majority;
    }
}