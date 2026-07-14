class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean ans = false;
        if(word.length()>m*n)return false;
        boolean[][] used = new boolean[m][n];   
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(word.charAt(0) == board[i][j]){
                    ans = backtrack(board,i,j,word,0,used);
                    if(ans) return true;
                    used[i][j] = false;
                }
            }
        }
        return false;
    }
    boolean backtrack(char[][] board,int i,int j,String word,int k,boolean[][] used){
        if(k == word.length())return true;
        if(i< 0 || j<0 || i>=board.length || j>=board[0].length ||
        used[i][j] || word.charAt(k) != board[i][j]) return false;
        used[i][j] = true;
        boolean a = backtrack(board,i,j+1,word,k+1,used);
        boolean b = backtrack(board,i+1,j,word,k+1,used);
        boolean c = backtrack(board,i-1,j,word,k+1,used);
        boolean d = backtrack(board,i,j-1,word,k+1,used);
        used[i][j] = false;
        return a || b || c || d;
    }
}
