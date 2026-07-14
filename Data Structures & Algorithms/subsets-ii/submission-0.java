class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>());
        return ans;
    }
    void backtrack(int[] arr,int i,List<Integer> list){
        if(i == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        backtrack(arr,i+1,list);
        list.remove(list.size()-1);
        int j = i+1;
        while(j<arr.length && arr[i] == arr[j] ){
            j++;
        }
        backtrack(arr,j,list);
    }
}
