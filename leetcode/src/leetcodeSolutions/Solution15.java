package leetcodeSolutions;

import java.util.*;
import java.util.stream.Collectors;

public class Solution15 {
    public List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> finalResult = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j) {
                    for (int k = 0; k < nums.length; k++) {
                        if (i != j && i != k && j != k) {
                            List<Integer> res = new ArrayList<>();
                            if ((nums[i] + nums[j] + nums[k]) == 0) {
                                res.add(nums[i]);
                                res.add(nums[j]);
                                res.add(nums[k]);
                            }
                          //  if(res.size()>3) res.remove(0);
                            Collections.sort(res);
                            if (!res.isEmpty()) finalResult.add(res);

                        }
                    }
                }
            }

        }
        return new ArrayList<>(finalResult);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> finalResult = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) {
                continue;
            }
          int high = nums.length-1;
          int low = i+1;
          while (low<high){
              int sum = nums[i]+nums[low]+nums[high];
              if(sum==0){
               //   List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                 // Collections.sort(list);
                  finalResult.add(Arrays.asList(nums[i],nums[low],nums[high]));
                  high--;
                  while (low<high && nums[high]==nums[high+1]) {
                      high--;
                  }
              }else if(sum>0){
                  high--;
              }else low++;
          }
        }
        return new ArrayList<>(finalResult);
    }

}
