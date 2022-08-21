package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
           // list.
        }
        arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
