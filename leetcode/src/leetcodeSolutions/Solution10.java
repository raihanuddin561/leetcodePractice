package leetcodeSolutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution10 {
    public boolean isMatch(String s, String p) {
        if((s.length()>=1 && s.length()<=20) && (p.length()>=1 && p.length()<=30)) {
            Pattern pattern = Pattern.compile("(?ism)^" + p + "$");
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) {
                return true;
            }
        }
        return false;
    }
}
