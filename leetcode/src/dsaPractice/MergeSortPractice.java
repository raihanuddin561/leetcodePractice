package dsaPractice;

import java.util.Arrays;

public class MergeSortPractice {
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3,1,7};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
      //  System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length<2) return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i=0,j=0,k=0;
        int[] mix=new int[left.length+right.length];
        while (i<left.length && j<right.length){
            if(left[i]>right[j]){
                mix[k]=right[j];
                j++;
            }else{
                mix[k]=left[i];
                i++;
            }
            k++;
        }
        while (i<left.length) {
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            mix[k]=right[j];
            j++;
            k++;

        }
        return mix;
    }

    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s==1) return;
        int mid = (s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr, int s,int mid, int e) {
        int[] mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i<mid&&j<e){
            if(arr[i]<arr[j]){
               mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix,0,arr,s,mix.length);
       /* for(int p=0;p<mix.length;p++){
            arr[s+p]=mix[p];
        }*/
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
