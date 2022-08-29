package leetcodeSolutions;

public class Solution852 {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0,end=arr.length-1;
        int ans=0;
        if(arr.length==1) return 0;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid==arr.length-1 && arr[mid]>arr[mid-1]) return mid;
            if(mid==0&&arr[mid]>arr[mid+1]) return mid;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]) return mid;
            if(arr[mid]<arr[mid+1]) start=mid+1;
            else if(arr[mid]<arr[mid-1])end=mid-1;
            ans=mid;
        }
        return ans;
    }
}
