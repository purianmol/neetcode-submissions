class Solution {
    int n;
    List<List<Integer>> adj = new ArrayList<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        n = numCourses;   
        Deque<Integer> q = new ArrayDeque<>();
        int[] indegree = new int[n];
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        for(int i = 0;i<n;i++){
            if(indegree[i] == 0)q.offer(i);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            for(int nei:adj.get(node)){
                indegree[nei]--;
                if(indegree[nei] == 0) q.offer(nei);
            }
        }
        for(int i = 0;i<n;i++){
            if(indegree[i] != 0)return false;
        }
        return true;
    }
}
