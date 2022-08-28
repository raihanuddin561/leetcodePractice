package leetcodeSolutions;

public class Solution2295 {
    public int[] arrayChange(int[] nums, int[][] operations) {
        for(int i=0;i<operations.length;i++){
            int targetValue =operations[i][0];
            int opsValue = operations[i][1];

            int targetIndex = -1;
            int opsIndex = -1;
            int start = 0,end = nums.length;
            while (start<end){
                if(nums[start]==targetValue) targetIndex=start;
                if(nums[start]==opsValue) opsIndex=start;
                start++;
            }
            if(!(targetIndex<0||opsIndex>0)) nums[targetIndex]=opsValue;
        }
        return nums;
    }

    private int binarySearch(int[] nums, int start, int end,int target) {
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target==nums[mid]) return mid;
            if(target>nums[mid]) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    private static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index]=arr[index2];
        arr[index2] =temp;
    }
}
