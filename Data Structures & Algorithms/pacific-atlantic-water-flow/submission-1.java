class Solution {
    boolean[][] pacific;
    boolean[][] atlantic;
    List<List<Integer>> ans = new ArrayList<>();
    int m;
    int n;
    // for pacific ocean i = 0, j = 0
    // for atlantic ocean i = m-1, j = n-1
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        pacific = new boolean[m][n];
        atlantic = new boolean[m][n];
        Deque<int[]> q = new ArrayDeque<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || j == 0){
                    pacific[i][j] = true;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] node = q.poll();
            int x = node[0];
            int y = node[1];
            for(int[] dir:dirs){
                int nx = x+dir[0];
                int ny = y+dir[1];
                if(nx<0 || ny<0 || nx>=m || ny>=n || pacific[nx][ny])continue;
                if(heights[nx][ny] >= heights[x][y]){
                    pacific[nx][ny] = true;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == m-1 || j == n-1){
                    atlantic[i][j] = true;
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] node = q.poll();
            int x = node[0];
            int y = node[1];
            for(int[] dir:dirs){
                int nx = x+dir[0];
                int ny = y+dir[1];
                if(nx<0 || ny<0 || nx>=m || ny>=n || atlantic[nx][ny])continue;
                if(heights[nx][ny] >= heights[x][y]){
                    atlantic[nx][ny] = true;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
