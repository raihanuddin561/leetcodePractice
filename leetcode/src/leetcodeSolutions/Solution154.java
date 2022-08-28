package leetcodeSolutions;

public class Solution154 {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot==-1&&nums.length>0) return nums[0];
        if(pivot==nums.length-1) return nums[0];
        if(pivot<nums.length-1){
            if(nums[pivot]>nums[pivot+1])return nums[pivot+1];
        }
        if(pivot>0){
            if( nums[pivot]>nums[pivot-1]) return nums[pivot-1];
        }
         return nums[pivot];
    }
    private int findPivot(int[] arr) {
        int start = 0, end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(mid==arr.length-1 && arr[mid]>arr[0]) return mid;
           // if(mid==0&&)
            if(mid<end&&arr[mid]==arr[start]&&arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[end]<arr[mid])){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;
    }
}
