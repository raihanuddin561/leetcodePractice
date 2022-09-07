package leetcodeSolutions;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        if(haystack.startsWith(needle)) return 0;
        for(int i=1;i<haystack.length();i++){
            String sub = haystack.substring(i);
            if(sub.startsWith(needle)) return i;
        }
        return -1;
    }
}
