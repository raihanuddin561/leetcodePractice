package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution1_1 {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!checkCondition(nums[i]) && !checkCondition(target)){
                return null;
            }
            int requiredNum = target - nums[i];
            for(int y=i+1;y<nums.length;y++){
                if(nums[y]==requiredNum)  {
                   result.add(i);
                   result.add(y);
               }
            }
        }
        int[] output = result.stream().mapToInt(x->x).toArray();
        return output;
    }


    private boolean checkCondition(int num) {
        if(num>=Math.pow(-10,9) && num<=Math.pow(10,9)){
            return true;
        }
        return false;
    }
}
