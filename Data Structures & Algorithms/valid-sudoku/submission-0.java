class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0;i<board.length;i++){
            Set<Character> setH = new HashSet<>();
            for(int j = 0;j<board.length;j++){
                if(board[i][j] == '.')continue;
                if(setH.contains(board[i][j])){
                    return false;
                }
                setH.add(board[i][j]);
            }
        }
        for(int i = 0;i<board.length;i++){
            Set<Character> setV = new HashSet<>();
            for(int j = 0;j<board.length;j++){
                if(board[j][i] == '.')continue;
                if(setV.contains(board[j][i])){
                    return false;
                }
                setV.add(board[j][i]);
            }
        }
        for(int sq = 0;sq<9;sq++){
            Set<Character> set = new HashSet<>();
        for(int i = 0;i<3;i++){
                 
            for(int j = 0;j<3;j++){
               
                int row = (sq/3)*3 +i;
                int col = (sq%3)*3 + j;
                if(board[row][col] == '.')continue;
                if(set.contains(board[row][col]))return false;
                set.add(board[row][col]);
            }
        }
        }
        return true;
    }
}
