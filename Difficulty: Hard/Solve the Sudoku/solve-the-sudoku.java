// User function Template for Java

class Solution {
    // Function to find a solved Sudoku.
    static int check =0;
    static boolean isValid(int[][] mat,int row,int col,int num){
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
    static void solve(int[][] mat,int row,int col){
        if(row==9){
            check=1;
            return;
        }else if(mat[row][col]!=0){
            if(col!=8) solve(mat,row,col+1);
            else solve(mat,row+1,0);
        }else{
            for(int i=1;i<=9;i++){
                if(isValid(mat,row,col,i)){
                    mat[row][col] = i;
                    if(col!=8) solve(mat,row,col+1);
                    else solve(mat,row+1,0);
                    if(check==1) return;
                    mat[row][col] = 0;
                }
            }
        }
    }
    static void solveSudoku(int[][] mat) {
        // code here
        solve(mat,0,0);
        check = 0;
    }
}