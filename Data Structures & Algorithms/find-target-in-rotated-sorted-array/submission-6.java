class Solution {
    public int search(int[] arr, int target) {
        int p = pivot(arr);
        if(arr[p] == target ){
            return p;
        }
        return Math.max(binary(arr,target,0,p),binary(arr,target,p+1,arr.length-1));
    }
    int pivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int mid = s + (e-s)/2;
            if(mid < arr.length-1 &&arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]>arr[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return s;
    }
    int binary(int[] arr,int target,int s,int e){
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target)return mid;
            if(arr[mid]>target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
}
