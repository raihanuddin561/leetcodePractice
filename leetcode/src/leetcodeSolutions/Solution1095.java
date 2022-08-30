package leetcodeSolutions;

public class Solution1095 {
    public int findInMountainArray(int target, int[] mountainArr) {
        if(mountainArr.length<3) return -1;
        int pivot = findPivot(mountainArr);
        if(pivot==-1) return -1;
        if(target==mountainArr[pivot]) return pivot;
        int firstTry = binarySearch(mountainArr,0,pivot-1,target,true);
        if(firstTry==-1){
            return binarySearch(mountainArr,pivot+1,mountainArr.length-1,target,false);
        }
        return firstTry;

    }
    private int findPivot(int[] mountainArr){
        int start=0,end=mountainArr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<mountainArr.length&&mid>0&&mountainArr[mid]>mountainArr[mid-1]&&mountainArr[mid]>mountainArr[mid+1]) return mid;
            if(mid>0&&mountainArr[mid]<mountainArr[mid-1]) end=mid-1;
            else if(mid<mountainArr.length&&mountainArr[mid]<mountainArr[mid+1]) start=mid+1;


        }
        return -1;
    }
    private int binarySearch(int[] mountainArr,int start,int end,int target,boolean firstIndex){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mountainArr[mid]==target) return mid;
            if(firstIndex){
                if(mountainArr[mid]>target) end=mid-1;
                else start=mid+1;
            }else {
                if(mountainArr[mid]>target) start=mid+1;
                else end=mid-1;
            }
        }
        return -1;
    }
}
