class Solution {
    public int uniquePaths(int m, int n) {
        int ans = fun(m,n);
        return ans;
    }
    int fun(int m,int n){
        if(m == 1){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        int a = fun(m-1,n);
        int b = fun(m,n-1);

        return a+b;
    }
}
