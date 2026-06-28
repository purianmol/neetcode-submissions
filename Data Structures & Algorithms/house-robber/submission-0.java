class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int rob(int[] arr) {
        int ans = fun(arr,0);
        return ans;
    }
    int fun(int[] arr,int i){
        if(i>=arr.length){
            return 0;
        }
        
        if(map.containsKey(i)){
            return map.get(i);
        }
        int a = arr[i] + fun(arr,i+2);
        int b =  fun(arr,i+1);
        int result = Math.max(a,b);
        map.put(i,result);
        return result;
    }
}
