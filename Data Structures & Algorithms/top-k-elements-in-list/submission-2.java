class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int el:nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            q.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] arr = new int[k];
        while(k>0){
            arr[--k] = q.poll()[0];
        }
        return arr;
    }
}
