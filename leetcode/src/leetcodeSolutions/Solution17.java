package leetcodeSolutions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution17 {

    Map<Character,String> map = new HashMap<>(Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",
            '7',"pqrs",'8',"tuv",'9',"wxyz"));
    List<String> combination = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return combination;
        char[] ch = digits.toCharArray();
        String s = "";
        getCombination(ch,0,s);
        return combination;
    }

    private void getCombination(char[] ch, int i, String s) {
        if(s.length()==ch.length) {
            combination.add(s);
            return;
        }
        char[] letters = ch[i]!='1' && ch[i]!='0'?map.get(ch[i]).toCharArray():null;
        if(letters!=null) {
            for (char c : letters) {
                s += c;
                getCombination(ch, i + 1, s);
                s = s.substring(0, s.length() - 1);
                System.out.println(s);
            }
        }
    }
}
