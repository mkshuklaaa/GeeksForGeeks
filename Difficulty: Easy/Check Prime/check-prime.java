class Solution {
    public static boolean prime(int n) {
        // Write your code here
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }if(count==2) return true;
        return false;
    }
}