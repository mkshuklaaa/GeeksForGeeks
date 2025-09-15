class Solution {
    static boolean helper(int[][] mat,int row,int col,int num){
        // row
        for(int j=0;j<9;j++){
            if(mat[row][j]==num) return false;
        }
        
        //col
        for(int i=0;i<9;i++){
            if(mat[i][col]==num) return false;
        }
        
        int sRow = row/3*3;
        int sCol = col/3*3;
        
        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(mat[i][j]==num) return false;
            }
        }
        return true;
    }
    static boolean isValid(int mat[][]) {
        // code here
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(mat[i][j]==0) continue;
                int num = mat[i][j];
                mat[i][j]=0;
                if(!helper(mat,i,j,num)) return false;
                mat[i][j]=num;
            }
        }return true;
        
    }
}