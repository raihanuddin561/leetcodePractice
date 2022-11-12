package dsaPractice.recursion;

public class CircularSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,1,2,3,4};
       // int[] arr = {5,6,7,8,1,2,3};
        System.out.println("target index: "+search(arr,6,0,5));
    }
    public static int search(int[] arr,int target,int s,int e){
        if(s>e) return -1;
        int mid = s+(e-s)/2;
        if(target==arr[mid]) return mid;
        if(arr[mid]>=arr[s]){
            if(target>s&&target<mid){
              return  search(arr,target,s,mid-1);
            }else{
               return search(arr,target,mid+1,e);
            }
        }
        if(target>arr[mid]&&target<arr[e]){
            return search(arr,target,mid+1,e);
        }else{
            return search(arr,target,s,mid-1);
        }
    }
}
