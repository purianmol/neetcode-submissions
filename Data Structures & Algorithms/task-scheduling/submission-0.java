class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        int[] freq = new int[26];
        for(char task:tasks){
            freq[task-'A']++;
        }
        for(int taskFreq: freq){
            if(taskFreq>0)heap.offer(taskFreq);
        }
        Deque<int[]> waitQueue = new ArrayDeque<>(); 
        int time = 0;

        while(!heap.isEmpty() || !waitQueue.isEmpty()){
            time++;
            if(!heap.isEmpty()){
                int count = heap.poll() -1 ;
                if(count>0)waitQueue.offer(new int[]{count,time+n});
            }
            if(!waitQueue.isEmpty()){
                if(waitQueue.peek()[1]== time)heap.offer(waitQueue.poll()[0]);
            }
        }
        return time;
    }
}
