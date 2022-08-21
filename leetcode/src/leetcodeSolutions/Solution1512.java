package leetcodeSolutions;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int pair=0;
        for(int i=0;i<nums.length;i++){
            int l=i+1,h=nums.length;
            while (l<h){
                if(nums[i]==nums[l]){
                    pair++;
                }
                l++;
            }
        }
        return pair;
    }
}
