package leetcodeSolutions;

public class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int start = 0,end=nums.length-1;
        if(nums.length==1) return nums[0];
        while (start<=end){
            if(nums[start]!=nums[start+1]) return nums[start];
            if(nums[end]!=nums[end-1]) return nums[end];
            int startValue=nums[start++];
            while (startValue==nums[start])start++;
            int endValue=nums[end--];
            while (endValue==nums[end]) end--;
        }
        return -1;
    }


}
