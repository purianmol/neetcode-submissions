class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int minCostClimbingStairs(int[] arr) {
        int cost = 0;
        int ans = Math.min(func(arr,0),func(arr,1));
        return ans;
    }
    int func(int[] arr,int index){
        if(index >= arr.length) return 0;
        if (map.containsKey(index)) return map.get(index);
        
        int a = func(arr,index+1);
        int b = func(arr,index+2);

        int min = arr[index]+ Math.min(a,b);
        map.put(index,min);
        return min;
    }
}
