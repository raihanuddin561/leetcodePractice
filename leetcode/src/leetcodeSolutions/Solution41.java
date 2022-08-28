package leetcodeSolutions;

public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0&&correct<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return nums.length+1;

    }
    private  void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index]=arr[index2];
        arr[index2] =temp;
    }
}
