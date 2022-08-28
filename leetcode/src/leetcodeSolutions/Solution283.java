package leetcodeSolutions;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        if(nums.length>1){
            int length = nums.length;
            int i=0;
            while (i<length){
                if(nums[i]==0){
                    int l = i+1, h = nums.length - 1;
                    int temp=nums[i];
                    if(l<nums.length){
                        nums[i]=nums[l];
                        while (l<h){
                            nums[l]=nums[++l];
                        }
                        nums[h]=temp;
                    }
                    length--;
                    i=0;
                }
                else{
                    i++;
                }
            }
        }
    }

    private void move(int[] nums) {
    }
}
