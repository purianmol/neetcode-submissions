class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i = 0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i<times.length;i++){
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj.get(u).add(new int[]{v,w});
        }
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE); 
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            int nodeVal = node[0];
            int nodeDist = node[1];
            if(nodeDist > dist[nodeVal])continue;
            List<int[]> neighbours = adj.get(nodeVal);
            for(int[] nei: neighbours){
                if(nodeDist+ nei[1] < dist[nei[0]]){
                    dist[nei[0]] = nodeDist +  nei[1];
                    pq.offer(new int[] {nei[0],dist[nei[0]]});
                }
            }
        }
        int max_time = 0;
        for(int i = 1;i<=n;i++){
            max_time = Math.max(max_time,dist[i]);
        }
        if(max_time == Integer.MAX_VALUE) return -1;
        return max_time;
    }
}
