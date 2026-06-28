class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }    

        int a = robbing(nums,0,false);
        map.clear();
        int b = robbing(nums,1,true);
        return Math.max(a,b);
    }
    int robbing(int[] arr,int i,boolean canRobLast){
        if(i>= arr.length){
            return 0;
        }
        if(map.containsKey(i)){
            return map.get(i);
        }
        if(i == arr.length-1){
            if(canRobLast){
                return arr[i];
            }
            else{
                return 0;
            }
        }
        int money = arr[i] + robbing(arr,i+2,canRobLast);
        int money2 = robbing(arr,i+1,canRobLast);

        int result =  Math.max(money,money2);

        map.put(i,result);
        return result;
    }
}
