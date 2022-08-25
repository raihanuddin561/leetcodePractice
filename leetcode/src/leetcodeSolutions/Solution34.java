package leetcodeSolutions;

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
       res[0] = binarySearch(nums,target,true);
       if(res[0]!=-1) {
            res[1] = binarySearch(nums,target,false);
       }
       return res;

    }

    private int binarySearch(int[] nums, int target, boolean firstIndex) {
        int start = 0,end = nums.length-1,ans=-1;
        while (start<=end){
          int  mid = start+(end-start)/2;
            if(target>nums[mid]) start=mid+1;
            else if (target<nums[mid]) end=mid-1;
            else {
                ans=mid;
                if(firstIndex) end = mid-1;
                else start=mid+1;
            }
        }
        return ans;
    }
}
