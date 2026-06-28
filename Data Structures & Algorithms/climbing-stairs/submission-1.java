class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        int ans = ways(0,n);
        return ans;
    }
    int ways(int stair,int n){
        if(map.containsKey(stair)){
            return map.get(stair);
        }
        if(stair > n){
            return 0;
        }
        if(stair == n){
            return 1;
        }
        int a = ways(stair+1,n);
        int b = ways(stair+2,n);

        map.put(stair,a+b);
        return a+b;
    }
}
