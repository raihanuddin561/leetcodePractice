package leetcodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<s.length();i++){
            int end = p.length();
            String word = "";
            if(i+end<=s.length()){
                 word = s.substring(i,i+end);
            }else word = s.substring(i);

            if(chechAnagram(word,p)){
                list.add(i);
            }
        }
        return list;
    }

    private boolean chechAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String word = new String(arr1);
        String word2 = new String(arr2);
        if(word.equals(word2)) return true;
        return false;
    }
}
