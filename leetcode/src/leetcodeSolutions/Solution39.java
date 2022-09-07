package leetcodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39 {
    static List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        combined(candidates,0,target,lists,new ArrayList<>());
        return lists;
    }

    private void combined(int[] candidates,int index, int target,List<List<Integer>> res,List<Integer> list) {
        if(index==candidates.length) {
            if(target<=0)
                res.add(new ArrayList<>(list));
            return;
        }
        if(candidates[index]<=target){
            list.add(candidates[index]);
            combined(candidates,index,target-candidates[index],res,list);
            list.remove(list.size()-1);
        }
        combined(candidates,index+1,target,res,list);
    }

}
