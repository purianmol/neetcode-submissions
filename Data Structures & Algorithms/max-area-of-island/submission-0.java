class Solution {
    int m;
    int n;
    boolean[][] visited;
    int max_area = 0;
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    max_area = Math.max(max_area,dfs(grid,i,j));
                } 
            }
        }
        return max_area;
    }
    int dfs(int[][] grid,int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == 0 || visited[i][j]) return 0;
        visited[i][j] = true;
        return 1+dfs(grid,i+1,j)+dfs(grid,i-1,j)+dfs(grid,i,j+1)+dfs(grid,i,j-1);
    }
}