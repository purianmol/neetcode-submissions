class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n<=2)return 1;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int ans = 0;
        for(int i = 3;i<=n;i++){
            ans = a+b+c;
            arr[i] = ans;
            a = b;
            b = c;
            c = ans;
        }
        return ans;
    }
}