package leetcodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int[]arr = new int[digits.length];
        int carry=0;
        for(int i=digits.length-1;i>=0;i--){
           int sum=carry;
            if(i==digits.length-1) digits[i]+=1;
            sum+=digits[i];
            if(sum>9) {
                carry = sum / 10;
                sum%=10;
            }else carry=0;
            arr[i]=sum;

        }

        if (carry>0) {
            arr = Arrays.copyOf(arr,arr.length+1);
            arr[0]=carry;
        }
        return arr;
    }
}
