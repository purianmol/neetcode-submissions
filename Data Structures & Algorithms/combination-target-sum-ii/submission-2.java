class Solution {
        List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
       backtrack(target,arr,0,new ArrayList<>()); 
       return list;
    }
    void backtrack(int target,int[] arr,int i,List<Integer> temp){
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(i > arr.length || target<0) return;
        for(int j = i;j<arr.length;j++){
            if(j != i && arr[j] == arr[j-1]){
                continue;
            }
            temp.add(arr[j]);
            backtrack(target-arr[j],arr,j+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}

