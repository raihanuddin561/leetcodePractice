package leetcodeSolutions;

import java.util.Arrays;

public class Solution1732 {
    public int largestAltitude(int[] gain) {
            int[] alts=new int[gain.length+1];
            alts[0]=0;
            int sum=0;
            for (int i=0;i<gain.length;i++){
                sum=sum+gain[i];
                alts[i+1]=sum;
            }
            return Arrays.stream(alts).max().getAsInt();
    }
}
