// User function Template for Java
class Solution {
    public static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        int ans = checkPrime(n+1) ? n+1 : nextPrime(n+1);
        return ans;
    }
}