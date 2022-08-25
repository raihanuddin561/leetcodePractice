package leetcodeSolutions;

import java.util.List;

public class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cols=0,matched=0;
        if(ruleKey.equals("type")) cols=0;
        else if (ruleKey.equals("color")) cols = 1;
        else if (ruleKey.equals("name")) cols = 2;
        for(List<String> item:items){
            if(item.get(cols).equals(ruleValue)) matched++;
        }
        return matched;
    }
}
