class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(nums,list,new ArrayList<>(),target,0);
        return list;
    }
    void backtrack(int[] arr,List<List<Integer>> list,List<Integer> temp,int target,int i){
        if(target < 0 || i>=arr.length) return;
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return; 
        }
        temp.add(arr[i]);
        backtrack(arr,list,temp,target-arr[i],i);
        temp.remove(temp.size()-1);
        backtrack(arr,list,temp,target,i+1);
    }
}
