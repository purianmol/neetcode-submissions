class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums,0,list,new ArrayList<>());
        return list;
    }
    void backtrack(int[] arr,int i,List<List<Integer>> ans,List<Integer> list){
        if(i == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        backtrack(arr,i+1,ans,list);
        list.remove(list.size()-1);
        backtrack(arr,i+1,ans,list);
    }
}
