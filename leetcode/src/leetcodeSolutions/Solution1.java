package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        if(nums.length<2 || nums.length>Math.pow(10,4)){
            return null;
        }
        for(int i=0;i<nums.length;i++){
            for(int y=i+1;y<nums.length;y++){
                if((checkCondition(nums[i]) && checkCondition(target) && sumCheck(nums[i],nums[y],target))){
                    result.add(i);
                    result.add(y);

                }
            }
        }
        int[] output = new int[result.size()];
        int count = 0;
        for(int a:result){
            output[count]=a;
            count++;
        }
        return output;
    }

    private boolean sumCheck(int num, int num1,int target) {
        if(num+num1==target){
            return true;
        }
        return false;
    }

    private boolean checkCondition(int num) {
        if(num>=Math.pow(-10,9) || num<=Math.pow(10,9)){
            return true;
        }
        return false;
    }
}
