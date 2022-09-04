package dsaPractice;

import java.util.Arrays;

public class TriangleArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        triangleSum(arr);
      //  System.out.println(Arrays.toString(triangleSum(arr)));
    }
    static void triangleSum(int[] arr){
        if(arr.length<=1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] a=new int[arr.length-1];
        for(int i=0;i<a.length;i++){
            a[i]=arr[i]+arr[i+1];
        }

        triangleSum(a);
        System.out.println(Arrays.toString(arr));
    }
}
