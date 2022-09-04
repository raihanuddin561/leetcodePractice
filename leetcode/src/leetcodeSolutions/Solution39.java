package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {
    static List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        split(candidates,0,candidates.length,target);
        return list;
    }

    private void split(int[] candidates, int s,int e,int target) {
        if(candidates.length<=2) return;
        int mid = (s+e)/2;
        split(candidates,s,mid,target);
        split(candidates,mid,e,target);
        combined(candidates,s,mid,e,target);
    }

    private void combined(int[] candidates, int s, int mid, int e,int target) {
        int sum=0;
        int i=s;
        int j=e;
        List<Integer> subList = new ArrayList<>();

        while (i<mid&&j<e){
           if(subList.isEmpty()){
               if(candidates[i]==target) {
                   subList.add(candidates[i]);
                   list.add(subList);
               }else subList.add(candidates[i]);
               if(candidates[j]==target){
                   subList.add(candidates[j]);
                   list.add(subList);
               }else subList.add(candidates[j]);
           }
        }
    }
}
