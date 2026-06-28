class Solution {
    public int findMin(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        if(arr.length == 2){
            return Math.min(arr[0],arr[1]);
        }
        
        int p = pivot(arr);
        if(p == -1){
            return arr[0];
        }
        return arr[p+1];
    }
    int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start<= end){
            int mid = start + (end-start)/2;
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            } 
            if(arr[mid]> arr[end]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
