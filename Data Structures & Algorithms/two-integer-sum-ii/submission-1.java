class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])){
                int a = map.get(target-numbers[i])+1;
                int b = i+1;
                return new int[] {a,b};
            }
            map.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }
}
