class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        int[][] temp = new int [rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                int live = neighbour(board, i-1, j-1) + neighbour(board, i-1, j) + neighbour(board, i-1, j+1) + neighbour(board, i, j+1) + neighbour(board, i+1, j+1) + neighbour(board, i+1, j) + neighbour(board, i+1, j-1) + neighbour(board, i, j-1);
                if (board[i][j] == 1){
                    temp[i][j] = (live < 2 || live > 3) ? 0 : 1;
                }
                else{ 
                    temp[i][j] = (live == 3) ? 1 : 0;
                }
            }
        }

        for (int i = 0; i < rows; i++) board[i] = temp[i].clone();

    }

    public int neighbour(int[][] board, int r, int c){
        if( r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0)return 0;
        return 1;
    
    }
}