package leetcodeSolutions;

import java.util.*;
import java.util.stream.Collectors;

public class Solution1920 {
    public int[] buildArray(int[] nums) {
        if(nums.length<=1) return nums;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length){
                arr[i]=nums[nums[i]];
            }
        }
        return arr;

    }
}
