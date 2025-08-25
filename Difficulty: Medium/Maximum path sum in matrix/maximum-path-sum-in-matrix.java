// User function Template for Java
class Solution {
    public int max(int[][] mat,int r,int c,int[][] dp){
        if(r>=mat.length || c>=mat[0].length) return 0;
        if(r<0 || c<0) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int dl = max(mat,r+1,c-1,dp);
        int d = max(mat,r+1,c,dp);
        int dr = max(mat,r+1,c+1,dp);
        return dp[r][c]=mat[r][c] + Math.max(dl,Math.max(d,dr));
    }
    public int maximumPath(int[][] mat) {
        // code here
        int r = mat.length;
        int c = mat[0].length;
        int[][] dp = new int[r+1][c+1];
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++) dp[i][j]=-1;
        }
        int max =0;
        for(int i=0;i<c;i++) max = Math.max(max,max(mat,0,i,dp));
        return max;
    }
}