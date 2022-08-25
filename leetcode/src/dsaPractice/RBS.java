package dsaPractice;

public class RBS {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 2;
       int found= findTarget(arr,target);
        System.out.println("Found: "+found);
    }

    private static int findTarget(int[] arr, int target) {
        int pivot = findPivotal(arr);
        if(target==pivot) return arr[pivot];

          int firstTry = binarySearch(arr,target,0,pivot-1);
          if(firstTry<0) {
              return  binarySearch(arr,target,pivot+1,arr.length-1);

          }
          return firstTry;

        //return pivot;
    }

    static int findPivotal(int[] arr){
        int start = 0, end = arr.length-1;
        while (start<end){
           int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            if(arr[mid]<=arr[start]) end = mid - 1;
            else start=mid+1;
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
      // int mid = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
