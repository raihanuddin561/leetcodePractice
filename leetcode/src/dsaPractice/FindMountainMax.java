package dsaPractice;

public class FindMountainMax {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,10,9,8,7,6,5,2,1};
        int max = findMax(arr);
        System.out.println("Print max: "+max);

    }

    private static int findMax(int[] arr) {
        int s=0,e=arr.length-1,mid=-1;
        while (s<e){
            mid=s+(e-s)/2;
            //if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]) break;
             if(arr[mid]>arr[mid+1]) e=mid;
            else  s=mid+1;
        }
        return arr[s];
    }
}
