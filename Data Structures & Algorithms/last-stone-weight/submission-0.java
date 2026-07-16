class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b-a);
        for(int stone:stones){
            q.offer(stone);
        }
        while(q.size()>1){
            int a = q.poll();
            int b = q.poll();
            if(a != b){
                q.offer(Math.abs(a-b));
            }
        }
        if(q.isEmpty())return 0;
        return q.peek();
    }
}
