package leetcodeSolutions;

import java.util.Arrays;
import java.util.StringJoiner;

public class Solution6 {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        int row = 0;
        boolean down = true;
        String[] arr = new String[numRows];
        Arrays.fill(arr,"");
        for(int i=0;i<len;i++){
            arr[row] +=chars[i];
            if(row==numRows-1){
                down = false;
            } else if (row==0) {
                down = true;
            }
            if(down) row++;
            else row --;
        }
        StringJoiner sj = new StringJoiner("");
        for(String a:arr){
            sj.add(a);
        }
        return sj.toString();
    }

}
