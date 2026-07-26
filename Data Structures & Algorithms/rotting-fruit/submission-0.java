class Solution {
    int m;
    int n;
    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        Deque<int[]> q = new ArrayDeque<>();
        int fresh = 0;
        int time = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1)fresh++;
                if(grid[i][j] == 2)q.offer(new int[]{i,j});
            }
        }
        if(fresh == 0) return 0;
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int size  = q.size();
            boolean rotted = false;
            for(int i = 0;i<size;i++){
                int[] node = q.poll();
                for(int[] dir:dirs){
                    int nx = node[0]+dir[0];
                    int ny = node[1]+dir[1];
                    if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny] == 1){
                        fresh--;
                        grid[nx][ny]++;
                        q.offer(new int[]{nx,ny});
                        rotted = true;
                    }
                }
            }
            if(rotted)time++;
        }
        if(fresh == 0) return time;
        return -1;
    }
}
