class Solution {
    static class Node{
        int val;
        int i;
        int j;
        Node(int i,int j,int val){
            this.i = i;
            this.j = j;
            this.val = val;
        }
    }
    int m;
    int n;
    int land = Integer.MAX_VALUE; 
    public void islandsAndTreasure(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        Deque<Node> q = new ArrayDeque<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 0)q.offer(new Node(i,j,grid[i][j]));
            }
        }
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            Node node = q.poll();
            int val = node.val;
            int i = node.i;
            int j = node.j;
            for(int[] dir:dirs){
                int ni = i+dir[0];
                int nj = j+dir[1];
                if(ni>=0 && nj>=0 && ni<m && nj<n && grid[ni][nj] == land){
                    grid[ni][nj] = val+1;
                    q.offer(new Node(ni,nj,val+1));
                }
            }
        }
    }
}
