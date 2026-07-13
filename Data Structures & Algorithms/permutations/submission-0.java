class Solution {
    List<List<Integer>> list = new ArrayList<>();
    int n;
    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        boolean[] visited = new boolean[n];
        backtrack(nums,visited,new ArrayList<>());
        return list;
    }
    void backtrack(int[] arr,boolean[] visited,List<Integer> temp){
        if(temp.size() == n){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<n;i++){
            if(visited[i]){
                continue;
            }
            temp.add(arr[i]);
            visited[i] = true;
            backtrack(arr,visited,temp);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }
    }
}
