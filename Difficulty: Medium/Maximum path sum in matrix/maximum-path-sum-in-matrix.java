// User function Template for Java
class Solution {
    public int maximumPath(int[][] mat) {
        // code here
        int r = mat.length;
        int c = mat[0].length;
        int[][] dp = new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(i==0) dp[i][j] = mat[i][j];
                else dp[i][j] =mat[i][j]+Math.max((j-1>=0)?dp[i-1][j-1]:0,Math.max(dp[i-1][j],(j+1<c)?dp[i-1][j+1]:0));
            }
        }
        
        int max = -1;
        for(int i=0;i<c;i++) max = Math.max(max,dp[r-1][i]);
        return max;
    }
}