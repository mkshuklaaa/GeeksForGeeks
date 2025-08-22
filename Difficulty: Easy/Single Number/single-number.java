// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
        // code here
        int a = arr[0];
        for(int i=1;i<arr.length;i++) a=a^arr[i];
        return a;
    }
}