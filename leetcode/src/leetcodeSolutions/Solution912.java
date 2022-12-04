package leetcodeSolutions;

import java.util.Arrays;

public class Solution912 {
    public int[] sortArray(int[] nums) {
        if(nums.length==1) return nums;
        int mid = nums.length/2;
        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right = sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        return mergeSort(left,right);
    }

    private int[] mergeSort(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i<first.length&&j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while (i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
