




class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> temp= new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int y=arr[i];
            if(arr[i]==target){
                    temp.add(0,i+1);
                    temp.add(1,i+1);
                    return temp;
            }
            for(int j=i+1;j<arr.length;j++){
                 y=y+arr[j];
                if(y==target){
                    temp.add(0,i+1);
                    temp.add(1,j+1);
                    return temp;
                }
                
            }y=0;
            
        }temp.add(0,-1);
        return temp;
    }
}
