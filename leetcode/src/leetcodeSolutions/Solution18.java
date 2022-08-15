package leetcodeSolutions;

import java.util.*;
import java.util.stream.Collectors;

public class Solution18 {
    Set<List<Integer>> finalList = new HashSet<>();
    List<List<Integer>> fList= new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length-1;j++){
                long restTarget = target-nums[i];
                restTarget=restTarget-nums[j];
                int x = j+1;
                int y=nums.length-1;
                while (x<y){
                    if(restTarget==nums[x]+nums[y]){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[x],nums[y]);
                        finalList.add(list);
                        while (x<y && nums[x]==nums[x+1]) x++;
                        while (x<y && nums[y]==nums[y-1]) y--;
                        x++;
                        y--;
                    }
                    else if (nums[x]+nums[y]<restTarget) x++;
                    else  y--;

                }
                while (j<nums.length-1 && nums[j]==nums[j+1]) j++;
            }
            while(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        }
        fList.addAll(finalList);
        return fList;
    }


/*
Set<List<Integer>> finalList = new HashSet<>();
    List<List<Integer>> fList= new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<Integer> subList = new ArrayList<>();
        int i=0,j=1,x=nums.length-1,y=x-1;
    while (x>-1 && y>-1 && i<nums.length-1&&j<nums.length-1){
        if(checkSums(nums,i,j,x,y,target)){
            List<Integer> list = Arrays.asList(nums[i],nums[j],nums[x],nums[y]);
            Collections.sort(list);
            finalList.add(list);
        }
        x--;
        if(x<=0){
            x=nums.length-1;
            y--;
        }
        if(y<=0){
            i++;
            if(i>=nums.length-1){
                i=0;
                j++;
            }
            x=nums.length-1;
            y=x-1;
        }

    }
    fList.addAll(finalList);
    return fList;
    }
    private boolean checkSums(int[] nums, int i, int j, int x, int y,int target) {
        if(i!=x&&i!=y&&j!=x&&j!=y&&x!=y&&i!=j){
        int res = nums[i]+nums[j]+nums[x]+nums[y];
        if(res==target){
            return true;
        }
        }
        return false;
    }
 */
    //2nd solution

    /*
    List<Integer> subList = new ArrayList<>();
        int i=0,j=1,x=nums.length-1,y=x-1;
        while (x>-1 && y>-1 && i<nums.length-1&&j<nums.length-1){
            if(checkSums(nums,i,j,x,y,target)){
                List<Integer> list = Arrays.asList(nums[i],nums[j],nums[x],nums[y]);
                Collections.sort(list);
                finalList.add(list);
            }
            x--;
            if(x==i||x==j||x==y){
                x--;
            }
            if(x<=0){
                x=nums.length-1;
                y--;
                if(y==i||y==j||y==x){
                    y--;
                }
            }
            if(y<=0){
                i++;
                if(i==j||i==x||i==y){
                    i++;
                }
                if(i>=nums.length-1){
                    i=0;
                    j++;
                    if(j==i||j==x||j==y){
                        j++;
                    }
                }
                x=nums.length-1;
                y=x-1;
            }
        }
        fList.addAll(finalList);
        return fList;
     */
}
