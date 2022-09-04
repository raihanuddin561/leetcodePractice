package leetcodeSolutions;

public class Solution1998 {
    public boolean gcdSort(int[] nums) {
        sort(nums,0,nums.length-1);

return false;
    }

    private void sort(int[] nums, int low, int high) {
        if(low>=high) return;
        int s=low,e=high;
        int mid = s+(e-s)/2;
        int pivot=nums[mid];
        while (s<=e){
            if(gcd(nums[s],nums[e])!=1) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
            }
            while (nums[s]<pivot) s++;
            while (nums[e]>pivot) e--;
            if(s<=e ){

                  /*  int temp = nums[s];
                    nums[s] = nums[e];
                    nums[e] = temp;*/

                s++;
                e--;
            }

        }
        sort(nums,low,e);
        sort(nums,s,high);
    }

    public int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }

}
