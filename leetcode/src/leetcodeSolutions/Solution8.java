package leetcodeSolutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution8 {
    public int myAtoi(String s) {
        Pattern pattern = Pattern.compile("^\\s*[+-]{0,1}[0-9]+");
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()){
            long val = 0;

            String groupVal = matcher.group().toString().trim();
            if( groupVal.length()<=12){
                val = Long.parseLong(groupVal);
                if(val<Integer.MIN_VALUE){
                    val = Integer.MIN_VALUE;
                } else if (val>Integer.MAX_VALUE) {
                    val = Integer.MAX_VALUE;
                }
            }else {
                try {
                    val = Long.parseLong(groupVal);
                }catch (NumberFormatException e){
                    if(groupVal.contains("-")){
                        val = Integer.MIN_VALUE;
                    }else val = Integer.MAX_VALUE;
                }

            }
            return (int) val;
        }
        return 0;
    }
    private Long parsing(String s){
        return Long.parseLong(s);
    }
}
