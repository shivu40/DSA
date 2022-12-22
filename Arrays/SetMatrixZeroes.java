class Solution {
    
    //Brute Force:
    static void solve(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] matrix2 = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    //making column zero:
                    for(int k = 0; k < n; k++){
                        matrix2[k][j] = -1;
                    }
                    
                    //making row zero:
                    for(int k = 0; k < m; k++){
                        matrix2[i][k] = -1;
                    }
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix2[i][j] == -1){
                    matrix2[i][j] = 0;                    
                }else{
                    matrix2[i][j] = matrix[i][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               matrix[i][j] = matrix2[i][j];
            }
        }
     
    }
    
    
     //Optimized to two Arrays:
    static void solve2(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[] dummyr = new int[m];
        int[] dummyc = new int[n];
        
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    //making dummyr zero:
                    dummyr[j] = -1;
                    
                    //making dummyc zero:
                    dummyc[i] = -1;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(dummyr[j] == -1 || dummyc[i] == -1){
                    matrix[i][j] = 0;                    
                }
            }
        }
       
    }
    
    
    //Optimized to Constant space:
    static void solve3(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
         
       boolean isRowZero = false;
       boolean isColZero = false;
        
       //Checking the row:
       for(int j = 0; j < m; j++){
           if(matrix[0][j] == 0){
               isRowZero = true;
               // matrix[0][j] = -1;
           }         
       }
        
       //Checking the column:
       
        for(int i = 0; i < n; i++){
            if(matrix[i][0] == 0){
                isColZero = true;
                // matrix[i][0] = -1;
            }
        }
        
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;                
                }
            }
        }
        
        if(isRowZero){
            for(int j = 0; j < m; j++){
              matrix[0][j] = 0;                        
            }
        }
        
        
        if(isColZero){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }    
    }
    public void setZeroes(int[][] matrix) {
        // solve(matrix);
        // solve2(matrix);
        solve3(matrix);
    }
}