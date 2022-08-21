package leetcodeSolutions;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length=nums.length;
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            int count=0;
            int l =0,h=length;
            while (l<h){
                if(i!=l && nums[i]>nums[l]){
                    count++;
                }
                l++;
            }
            arr[i]=count;
        }
        return arr;

    }
}
