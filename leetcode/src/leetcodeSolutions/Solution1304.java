package leetcodeSolutions;

import java.util.Arrays;

public class Solution1304 {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int neg=-1,pos=0,start=0;

        while(start<n){
            arr[start]=pos++;
            start++;
            if(start<n) {
                arr[start]=neg--;
            }
            start++;
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum==0) return arr;
        else {
            if(sum>0) arr[0]=arr[0]-sum;
            if(sum<0) arr[n-1]=arr[n-1]-sum;
        }
        return arr;
    }
}
