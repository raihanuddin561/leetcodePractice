package leetcodeSolutions;

public class Solution80 {
    public int removeDuplicates(int[] nums) {
        int c = 0, k = 1;
        if(nums.length==1) return 1;
        if(nums.length==2){
            return 2;
        }
        for (int i = 0; i < nums.length; i++) {
            c++;
            if (c < nums.length) {
                if(nums[i]==nums[c]){
                    i++;
                    nums[i]=nums[c];
                    k++;
                    c++;
                }
                while (c < nums.length && nums[i] == nums[c]) {
                    c++;
                }
                if (c < nums.length && nums[i] != nums[c]) {
                    nums[i + 1] = nums[c];
                    k++;
                }
            }else{
                c=nums.length-1;
                nums[i]=nums[c];
            }

        }
        return k;
    }
}
