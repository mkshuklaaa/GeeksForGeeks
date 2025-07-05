class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int prefixSum = 0;
        map.put(0,-1);
        
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            if(map.containsKey(prefixSum)){
                max = Math.max(max,i-map.get(prefixSum));
            }else{
                map.put(prefixSum,i);
                // prefixSum+=arr[i];
            }
        }return max;
    }
}