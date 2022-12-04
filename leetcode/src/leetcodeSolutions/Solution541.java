package leetcodeSolutions;

public class Solution541 {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        for(int i=0;i<length;i+=2*k){
            if(i+k-1<length){
                reverse(arr,i,i+k-1);
            }else{
                reverse(arr,i,length-1);
            }
        }
        String st = new String(arr);
        return st;
    }

    private void reverse(char[] arr, int startIndex, int endIndex) {
        while (startIndex<endIndex){
            char temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

    }
}
