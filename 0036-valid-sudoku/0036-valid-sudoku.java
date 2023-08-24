class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.'){
                    String numAtPos = "(" + board[i][j] + ")";
                    if (!seen.add(numAtPos + i) || !seen.add(j + numAtPos) || !seen.add(i/3 + numAtPos + j/3)) return false;
                }
            }
        }
        return true;
    }
}