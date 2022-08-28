package leetcodeSolutions;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int l=0,h=nums.length-1,k=0;
        if(nums.length<1) return 0;
        if(nums.length==1){
            if(nums[l]==val){
                nums=new int[0];
            }else k++;
        }else {
        while (l<=h){
            if(nums[l]==val){
                while (h>l){
                    if(nums[h]==val) {
                        h--;
                    }
                    else  {
                        k++;
                        break;
                    }
                }
                int temp = nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
            }else {
                k++;
            }
            l++;
        }
        }
        return k;
    }
}
