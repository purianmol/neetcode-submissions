class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        for(int num: nums){
            if(map.containsKey(target-num)){
                return new int[] {map.get(target-num),i};
            }
            map.put(num,i);
            i++;
        }
        return new int[] {-1,-1};
    }
}
