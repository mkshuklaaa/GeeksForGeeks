// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n<=1) return n;
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++) dp[n]=-1;
        if(dp[n]!=-1) return dp[n];
        int ans = nthFibonacci(n-1)+nthFibonacci(n-2);
        dp[n] = ans;
        return ans;
    }
}