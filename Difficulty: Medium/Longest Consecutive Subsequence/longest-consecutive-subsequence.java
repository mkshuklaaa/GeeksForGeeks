class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
       
        
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        for(int num : set){
            if(!set.contains(num-1)){
                int currNum = num;
                int max2 = 1;
                while(set.contains(currNum+1)){
                    max2++;
                    currNum++;
                }max=Math.max(max,max2);
            }
        }return max;
        
        
        
    }
}