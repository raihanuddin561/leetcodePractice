package leetcodeSolutions;

import java.util.*;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        boolean first = true;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int low = i+1;
            int high = nums.length-1;
            while (high>low){
                if(first){
                    res = nums[i]+nums[low]+nums[high];
                    first = false;
                }else {
                    int sum = nums[i]+nums[low]+nums[high];
                    if(Math.abs(sum-target)<Math.abs(res-target)) res = sum;
                }
                high--;
                if(high<=low){
                    low++;
                    high=nums.length-1;
                }
            }

        }
        return res;
    }
    public int threeSumClosest2(int[] nums, int target) {
        Arrays.sort(nums);
        Set<Integer> finalResult = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) {
                continue;
            }
            int high = nums.length-1;
            int low = i+1;
            while (low<nums.length-1){
                int h = high;
                while (h>low){
                    int sum = nums[i]+nums[low]+nums[h];
                    finalResult.add(sum);
                    h--;
                }
                low++;
            }
        }
        Integer[] arr = finalResult.toArray(new Integer[0]);
        Arrays.sort(arr);
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            if(Math.abs(target-res)>Math.abs(target-arr[i])){
                res = arr[i];
            }
        }
        return res;
    }
}
