class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int select;
    int total;
    public List<List<Integer>> combine(int n, int k) {
        select = k;
        total = n;
        backtrack(1,k,new ArrayList<>());
        return ans;
    }
    void backtrack(int num,int k,List<Integer> list){
        if(k == 0 && list.size() == select){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(k == 0 || num>total)return;   
        list.add(num);
        backtrack(num+1,k-1,list);
        list.remove(list.size()-1);
        backtrack(num+1,k,list);
    }
}