package leetcodeSolutions;

public class Solution1671 {
    public int minimumMountainRemovals(int[] nums) {
        if(nums.length<=2) return 0;
        int length=nums.length-1;
        int start = 0,end=length;
        int mid = start+(end-start)/2;
        int firstEnd=mid-1,secondStart=mid+1;
        if(nums.length<=1) return 0;
        int counter=0;
       counter+= counting(nums,0,firstEnd,true);
       counter+= counting(nums,secondStart,length,false);
        if(nums[mid]==nums[mid+1]||nums[mid]==nums[mid-1]) counter++;
        return counter;
    }

    private int counting(int[] nums, int start, int end,boolean firstCheck) {
        int counter=0;
        while (start<=end){
           if(firstCheck){
               if(start+1<=end&&nums[start]>=nums[start+1]) counter++;
               start++;
           }else {
               if(end-1>=start&&nums[end]>=nums[end-1]) counter++;
             //  if(end-1==start&&nums[end]>=nums[end-1]) counter--;//this is a problem in a dataset
               end--;
           }
        }
        return counter;
    }
}
