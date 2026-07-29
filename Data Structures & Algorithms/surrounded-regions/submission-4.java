class Solution {
    int m;
    int n;
    public void solve(char[][] board) {
        m = board.length;
        n = board[0].length;
        Deque<int[]> q = new ArrayDeque<>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || i == m-1 || j == 0 || j == n-1){
                    if(board[i][j] == 'O'){
                        q.offer(new int[]{i,j});
                        board[i][j] = 'T';
                    }
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
                if(nx<m && ny<n && nx>=0 && ny>=0 && board[nx][ny] == 'O'){
                    board[nx][ny] = 'T';
                    q.offer(new int[]{nx,ny});
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j] == 'O')board[i][j] = 'X';
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j] == 'T')board[i][j] = 'O';
            }
        }
    }
}
