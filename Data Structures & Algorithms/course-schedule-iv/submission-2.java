class Solution {
    List<Boolean> ans = new ArrayList<>();
    List<List<Integer>> adj = new ArrayList<>();
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            adj.get(pre[0]).add(pre[1]);
        }
        for(int[] query:queries){
            ans.add(canReach(query[0],query[1],new boolean[numCourses]));
        }
        return ans;
    }
    boolean canReach(int u,int v,boolean[] visited){
        if(u == v) return true;
        visited[u] = true;
        for(int nei:adj.get(u)){
            if(!visited[nei] && canReach(nei,v,visited)) return true;
        }
        return false;
    }
}