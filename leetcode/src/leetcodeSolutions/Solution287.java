package leetcodeSolutions;

public class Solution287 {
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(correct<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else if(nums[i]==nums[correct]&&i!=correct){
                return nums[i];
            }
            else i++;
        }
        return -1;
    }

    private  void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index]=arr[index2];
        arr[index2] =temp;
    }
}
