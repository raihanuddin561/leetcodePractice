package dsaPractice;

public class FindStartAndEndIndex {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,4,4,5,6,6,7};
        int target = 6;
        int[] res = new int[2];
        res[0]=search(arr,target,true);
        if(res[0]!=-1) res[1]=search(arr,target,false);
        System.out.println(res[0]+","+res[1]);
    }

    private static int search(int[] arr, int target, boolean firstIndex) {
        int start = 0, ans=-1,end = arr.length-1;
        while (start<=end){
             int mid = start+(end-start)/2;
            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else {
                ans=mid;
                if(firstIndex) end=mid-1;
                else start=mid+1;
            }
        }
        return ans;
    }
}
