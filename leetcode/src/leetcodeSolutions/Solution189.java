package leetcodeSolutions;

import java.util.Arrays;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k=k%l;
        reverse(nums,0,l-1);
        reverse(nums,0,k-1);
        reverse(nums,k,l-1);
        System.out.println(Arrays.toString(nums));

    }

    private void reverse(int[] nums, int start, int end) {
        while (start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
