class Solution {
    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        
        for(int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int idx = i;
            for(int j=i;j<n;j++){ 
                min = Math.min(min,arr[j]);
                if (arr[j]==min) idx = j;
            }swap(arr,i,idx);
        }
    }
}