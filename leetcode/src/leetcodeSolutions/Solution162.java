package leetcodeSolutions;

public class Solution162 {
    public int findPeakElement(int[] nums) {
        int start =0,end=nums.length-1;
        int ans=0;
        if(nums.length==1) return 0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid==nums.length-1 && nums[mid]>nums[mid-1]) return mid;
            if(mid==0&&nums[mid]>nums[mid+1]) return mid;
            if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]) return mid;
            if(nums[mid]<nums[mid+1]) start=mid+1;
            else if(nums[mid]<nums[mid-1])end=mid-1;
            ans=mid;
        }
        return ans;
    }
}
