package leetcodeSolutions;

public class Solution1671 {
    public int minimumMountainRemovals(int[] nums) {
        int start = 0,end=nums.length-1;
        if(nums.length<=1) return 0;
        int counter=0;
        while (start<end){
           for(int j=start+1,k=end-1;j>start&&k<end;j--,k++){
               if(nums[start]>nums[j]) counter++;
               if(nums[end]>nums[k]) counter++;
           }
           start++;
           end--;
        }
        return counter;
    }
}
