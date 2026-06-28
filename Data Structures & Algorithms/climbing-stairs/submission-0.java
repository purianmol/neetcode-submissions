class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        int ans = func(0,n);
        return ans;
    }
    int func(int sum,int n){
        if(sum == n){
            return 1;
        }
        if(sum>n){
            return 0;
        }
        if(map.containsKey(sum)){
            return map.get(sum);
        }
        else{
        int a = func(sum+1,n);
        int b = func(sum+2,n);
        map.put(sum,a+b);
        return a+b;
        }
         
    }
}
