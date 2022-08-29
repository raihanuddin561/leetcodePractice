package leetcodeSolutions;

public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int targetIndex = binarySearch(nums,0,nums.length-1,target);
        if(target>nums[targetIndex] && targetIndex==nums.length-1) return targetIndex+1;
        else if(target<nums[targetIndex]&&targetIndex==0) return 0;
        else if(target>nums[targetIndex]) return targetIndex+1;
        else if(target<nums[targetIndex] && target>nums[targetIndex-1]) return targetIndex;
        return targetIndex;
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        int ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(target>nums[mid]) start=mid+1;
            else end=mid-1;
            ans=mid;
        }
        return ans;
    }

}
