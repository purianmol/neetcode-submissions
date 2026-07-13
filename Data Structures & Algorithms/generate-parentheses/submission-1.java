class Solution {
    List<String> ans = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int p) {
        n = p;
        backtrack("",0,0);
        return ans;
    }
    void backtrack(String str,int open,int close){
        if(open == n && close == n){
            ans.add(str);
            return;
        }
        if(open < n){
        backtrack(str+"(",open+1,close);
        }
        if(close<open){
        backtrack(str+")",open,close+1);
        }
    }
}
