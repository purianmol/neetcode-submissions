class Solution {
    List<List<Integer>> adj = new ArrayList<>();
    int[] ans;
    int index = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ans = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] in = new int[numCourses];
        for(int[] pre:prerequisites){
            adj.get(pre[1]).add(pre[0]);
            in[pre[0]]++;
        }
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<numCourses;i++){
            if(in[i] == 0)q.offer(i);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans[index++] = node;
            for(int nei:adj.get(node)){
               in[nei]--;
               if(in[nei] == 0) q.offer(nei); 
            }
        }
        for(int i = 0;i<numCourses;i++){
            if(in[i] != 0) return new int[]{};
        }
        return ans;
    }
}
