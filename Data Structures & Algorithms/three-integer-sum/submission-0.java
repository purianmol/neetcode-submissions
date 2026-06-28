class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 2;i<n;i++){
            for(int j=1;j<i;j++){
                for(int k = 0;k<j;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        set.add(list);
                    }
                }
            }
        }
        for(List<Integer> list: set){
            ans.add(list);
        }
        return ans;
    }
}