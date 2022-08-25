package leetcodeSolutions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution989 {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list = new ArrayList<>();
        char[] chars = String.valueOf(k).toCharArray();
        int carry = 0;
        for(int i=num.length-1,j=chars.length-1;i>=0||j>=0;i--,j--){
            int sum = carry;
            sum+=i>=0?num[i]:0;
            sum+=j>=0?chars[j]-'0':0;
            carry=sum/10;
            list.add(sum%10);
        }
        if(carry>0){
            list.add(1);
        }
        Collections.reverse(list);
        return list;
        /* int cur=k;
        List<Integer> list = new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            if(i>=0) cur+=num[i];
            list.add(cur%10);
            cur/=10;
        }
        if(cur>0) list.add(1);
        Collections.reverse(list);
        return list;*/
    }
}
