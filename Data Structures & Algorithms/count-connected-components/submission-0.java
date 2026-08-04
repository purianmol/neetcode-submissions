class Solution {
    List<List<Integer>> adj = new ArrayList<>();
    int count;
    public int countComponents(int n, int[][] edges) {
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,visited);
            }
        }
        return count;
    }
    void dfs(int u,boolean[] visited){
        visited[u] = true;
        for(int nei:adj.get(u)){
            if(!visited[nei]){
                dfs(nei,visited);
            }
        }
    }
}
