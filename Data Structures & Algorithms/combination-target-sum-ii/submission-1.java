class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
       Arrays.sort(arr); 
       List<List<Integer>> list = new ArrayList<>();
       backtrack(0,target,arr,list,new ArrayList<>());
       return list;
    }
    void backtrack(int i,int t,int[] arr,List<List<Integer>> list,List<Integer> temp){
        if(t == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(t<0 || i>=arr.length)return;
        for(int j = i;j<arr.length;j++){
            if(j>i && arr[j] == arr[j-1]){
                continue;
            }
            if(arr[j]>t) break;
            temp.add(arr[j]);
            backtrack(j+1,t-arr[j],arr,list,temp);
            temp.remove(temp.size()-1);
        }
    }
}
