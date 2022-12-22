class Solution {
    public void rotate(int[][] matrix) {

        // 1. get the transpose of the matrix.
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++){
             for(int j = i + 1; j < col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
             }
        }
       
        // 2. interchange col1 <-> col(n)   col2 <-> col(n-1) and so on.....
        
        int c1 = 0;
        int c2 = col - 1;
        
        while(c1 < c2){
            for(int r = 0; r < row; r++){
                int temp = matrix[r][c1];
                matrix[r][c1] = matrix[r][c2];
                matrix[r][c2] = temp;
            }
            
            c1++;
            c2--;
        }
        
        
    }
}