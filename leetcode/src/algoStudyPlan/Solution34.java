package algoStudyPlan;

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
      int first = 0;
      int last = 0;
      return new int[]{first,last};
    }
    private int search(int[] nums,int target,boolean first){
        int start = 0,mid=0,end=nums.length-1;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]<target){
                end = mid+1;
            }else if(nums[mid]>target){

            }
        }
        /*if(result[1]<0){
            result[1]=result[0];
        }else if(result[0]<0) result[0]=result[1];*/
        return 0;
    }
}
