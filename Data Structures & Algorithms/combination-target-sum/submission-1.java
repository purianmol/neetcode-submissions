class Solution {
        List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(nums,new ArrayList<>(),0,target);
        return list;
    }
    void backtrack(int[] arr,List<Integer> temp,int i,int target){
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(i >= arr.length || target<0) return;
        temp.add(arr[i]);
        backtrack(arr,temp,i,target-arr[i]);
        temp.remove(temp.size()-1);
        backtrack(arr,temp,i+1,target);
    }
}
