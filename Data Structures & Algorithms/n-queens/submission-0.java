class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];
        for(char[] arr:grid){
            Arrays.fill(arr,'.');
        }
        backtrack(0,0,grid);
        return ans;
    }
    void backtrack(int i,int j,char[][] grid){
        if(i == grid.length){
            addAns(grid);
            return;
        }
        if(i< 0 || j< 0 || i>=grid.length || j>=grid.length)return;
        grid[i][j] = 'Q';
        if(canPlace(grid,i,j)){
            backtrack(i+1,0,grid);
        }
        grid[i][j] = '.';
        backtrack(i,j+1,grid);
    }
    boolean canPlace(char[][] grid,int j,int k){
        for(int i = 0;i<grid.length;i++){
            if(i != j && grid[i][k] == 'Q')return false;
        }
        for(int i = 0;i<grid.length;i++){
            if(k != i && grid[j][i] == 'Q')return false;
        }
        int[][] dirs = {{-1,1},{1,-1},{-1,-1}};
        for (int[] dir : dirs) {
            int row = j + dir[0];
            int col = k + dir[1];
                while (row >= 0 && row < grid.length && col >= 0 && col < grid.length) {
                if (grid[row][col] == 'Q') {
                    return false;
                }
                row += dir[0];
                col += dir[1];
            }
        } 
        return true;
    }
    void addAns(char[][] grid){
        List<String> list = new ArrayList<>();
        for(char[] arr:grid){
            StringBuilder sb = new StringBuilder();
            for(char ch:arr){
                sb.append(ch);
            }
            list.add(sb.toString());
        }
        ans.add(list);
    }
}
