package leetcodeSolutions;

public class Solution1998 {
    public boolean gcdSort(int[] nums) {
       for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j>0;j--){
               if(nums[j]<nums[j-1] && checkGCD(nums[j-1],nums[j])){
                   swap(nums,j,j-1);
               }
           }
       }
       return isSorted(nums);
    }

    private boolean isSmallestOfRight(int[] nums, int num,int index) {
        if(index>=nums.length) return true;
        else {
            for(int i=index;i<nums.length;i++){
                if(num>nums[i]) return false;
            }
        }
        return true;
    }
    private boolean isBiggestOfLeft(int[] nums, int num,int index) {
        if(index>=nums.length) return true;
        else {
            for(int i=index;i>=0;i--){
                if(num<nums[i]) return false;
            }
        }
        return true;
    }

    private boolean isSorted(int[] nums) {
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) return false;
        }
        return true;
    }

    boolean checkGCD(int a,int b){
        int i;
        if(a>b){
            i=b;
        }else i=a;
        for(i=i;i>1;i--){
            if(a%i==0 && b%i==0) return true;
        }
        return false;
    }
    private static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index]=arr[index2];
        arr[index2] =temp;
    }

}
