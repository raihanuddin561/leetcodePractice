package leetcodeSolutions;

public class Solution81 {
    public boolean search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target) return true;
            else return false;
        }
        if(nums.length<1) return false;
        int pivot = findPivot(nums);
        if(pivot==-1&&nums.length>0){
            if(nums[0]==target) return true;
            else return  false;
        }
        if(nums[pivot]==target) return true;
        if(pivot>0 && nums[pivot-1]==target) return true;
        if(pivot<nums.length-1&&nums[pivot+1]==target) return true;
        boolean firstTry = binarySearch(nums,0,pivot-1,target);
        if(!firstTry)return binarySearch(nums,pivot+1,nums.length-1,target);
        return firstTry;

    }
    private boolean binarySearch(int[] nums, int start, int end,int target) {
        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
    private int findPivot(int[] arr) {
        int start = 0, end = arr.length-1;
        if(arr[end]>arr[start]) return end;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(mid==arr.length-1 && arr[mid]>arr[0]) return mid;
            if(mid==start && arr[arr.length-1]>arr[start]) return arr.length-1;
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
