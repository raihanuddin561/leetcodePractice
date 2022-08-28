package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(correct<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) list.add( j+1);
        }
        return list;
    }
    private static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index]=arr[index2];
        arr[index2] =temp;
    }
}
