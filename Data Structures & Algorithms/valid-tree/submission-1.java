class Solution {
        boolean[] visited;
        List<List<Integer>> adj = new ArrayList<>();
    public boolean validTree(int n, int[][] edges) {
        visited = new boolean[n];
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int i = edge[0];
            int j = edge[1];
            adj.get(i).add(j);
            adj.get(j).add(i);
        }
        boolean dfs = dfs(0,-1);
        for(int i = 0;i<n;i++){
            if(!visited[i])return false;
        }
        return dfs;
    }
    boolean dfs(int node,int parent){
        List<Integer> neighbors = adj.get(node);
        visited[node] = true;
        for(int nei:neighbors){
            if(!visited[nei]){
                if(!dfs(nei,node))return false;
            }
            else if(nei != parent)return false;
        }
        return true;
    }
}
