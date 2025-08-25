//Back-end complete function Template for Java

class Solution {
    static int minClimb(int[] cost,int idx,int[] dp){
        if(idx>=cost.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int sing = cost[idx] + minClimb(cost,idx+1,dp);
        int doub = cost[idx] + minClimb(cost,idx+2,dp);
        int skip = minClimb(cost,idx+1,dp);
        
        return dp[idx] = Math.min(sing,doub);
    }
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minClimb(cost,0,dp),minClimb(cost,1,dp));
    }
};