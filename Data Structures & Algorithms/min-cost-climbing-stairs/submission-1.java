class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost(cost,0,0);
        int b = cost(cost,1,0);
        return Math.min(a,b);
    }
    static int cost(int[] arr,int index,int cost){
        if(index>=arr.length){
            return cost;
        }
        int a = cost(arr,index+1,cost+arr[index]);
        int b = cost(arr,index+2,cost+arr[index]);

        return Math.min(a,b);
    }
}
