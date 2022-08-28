package leetcodeSolutions;

public class Solution33 {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot>=0 && pivot<nums.length){
            if(nums[pivot]==target) return pivot;
        }
        if(pivot-1>=0&&nums[pivot-1]==target) return pivot-1;
        if(pivot+1<nums.length&&nums[pivot+1]==target) return pivot+1;
         int firstTry = binarySearch(nums,0,pivot-1,target);
        if(firstTry==-1) return binarySearch(nums,pivot+1,nums.length-1,target);
        return firstTry;
    }

    private int binarySearch(int[] nums, int start, int end,int target) {
        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }

    private int findPivot(int[] arr) {
        int start = 0, end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[mid]<=arr[start]) end = mid - 1;
            else start=mid+1;
        }
        return -1;
    }
}
