package leetcodeSolutions;

public class Solution268 {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};
        System.out.println(findMissingNumber(arr));

    }
    static int findMissingNumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i];
            if(correct<arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j) return j;
        }
        return arr.length;
    }

    private static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index]=arr[index2];
        arr[index2] =temp;
    }
}
