class Solution {
    int x;
    int y;
    public int numIslands(char[][] grid) {
        x = grid.length;
        y = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[x][y];
        for(int i = 0;i<x;i++){
            for(int j = 0;j<y;j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs(grid,i,j,visited);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(char[][] grid,int i,int j,boolean[][] visited){
        if(i>=x || j>=y || i<0 || j<0 || grid[i][j] == '0' || visited[i][j])return;
        visited[i][j] = true;
        dfs(grid,i+1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i,j-1,visited);
        dfs(grid,i-1,j,visited);
    }
}
