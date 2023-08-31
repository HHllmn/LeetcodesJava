class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rowsArray[]= new int[rows];
        int colsArray[]= new int[cols];
        
        Arrays.fill(rowsArray,1);
        Arrays.fill(colsArray,1);

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (matrix[i][j] == 0){
                    rowsArray[i] = 0;
                    colsArray[j] = 0;
                }
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(rowsArray[i] == 0 || colsArray[j] == 0)
                    matrix[i][j] = 0;
            }
        }
    }
}