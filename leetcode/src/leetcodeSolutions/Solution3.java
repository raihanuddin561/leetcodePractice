package leetcodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        String output = "";
        if(s.length()==1){
            return 1;
        }
        for(char c: s.toCharArray()){
            if(output.contains(String.valueOf(c))){
                output = output.substring(output.indexOf(String.valueOf(c))+1);
            }
            output = output+String.valueOf(c);
            length = Math.max(length, output.length());
        }
        return length;
    }


    private boolean checkDuplicateChars(String s) {
        Map<String,String> checkMap = new HashMap<>();
        boolean checked = false;
        for(char c:s.toCharArray()){
            if(!checkMap.containsKey(String.valueOf(c))){
                checkMap.put(String.valueOf(c),String.valueOf(c));
                checked =false;
            }else {
                checked = true;
                break;
            }
        }
        return checked;
    }


}
