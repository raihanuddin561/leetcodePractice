package algoStudyPlan;

public class Solution704 {
    public int search(int[] nums, int target) {
        //int mid =nums.length/2;
        int start = 0,mid=0;
        int end = nums.length-1;
        while (start<=end){
         mid = (start+end)/2;
         if(nums[mid]==target){
             return mid;
         }else if(target>nums[mid]){
             start=mid+1;
         }else end = mid-1;

        }
        return -1;
       // return binarySearch(start,end,mid,nums,target);
    }

    private int binarySearch(int start, int end, int mid, int[] nums,int target) {

       if( start<nums.length && end>=0 && start<=mid){
           if(nums[mid]==target){
               return mid;
           }else if(target>nums[mid]){
               start = mid+1;
               mid = (start+end)/2;
           }else if(target<nums[mid]){
               end = mid -1;
               mid = (start+end)/2;
           }else return -1;
           return binarySearch(start,end,mid,nums,target);
       }
    return -1;
    }
}
