package dsaPractice;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
        int ceil = findCeil(arr,target);
        int floor = findFloor(arr,target);
        System.out.println("Ceil index: "+ceil);
        System.out.println("floor index: "+floor);

    }

    private static int findFloor(int[] arr, int target) {
        int l=0,h=arr.length-1,index=-1;
        while (l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target) {
                index=mid-1;
                break;
            }
            else if(arr[mid]<target){
                l=mid+1;
            } else if (arr[mid]>target) {
                h=mid-1;
            }
        }
        if(h<l) index=h;

        System.out.println("printing index: "+index);
        return index;
    }

    private static int findCeil(int[] arr, int target) {
        int l=0,h=arr.length-1,index=-1;
        while (l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target) {
                index=mid;
                break;
            }
            else if(arr[mid]<target){
                l=mid+1;
            } else if (arr[mid]>target) {
                h=mid-1;
            }
        }
        if(h<l) index=l;

        System.out.println("printing index: "+index);
        return index;
    }

}
