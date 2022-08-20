package leetcodeSolutions;

public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        int x=0;
        for(int i=0,j=n;i<n;i++,j++){
            arr[x]=nums[i];
            arr[++x]=nums[j];
            x++;
        }
        return arr;
    }
}
