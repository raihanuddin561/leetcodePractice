package leetcodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        int s = 0;
        int e = strs.length-1;
        boolean[] exist = new boolean[strs.length];
        List<List<String>> list = new ArrayList<>();
        while (s<=e){
            if(!exist[s]) {
                String word = strs[s];
                List<String> l = new ArrayList<>();
                l.add(word);
                exist[s]=true;
                while (s <= e) {
                    String anagram = strs[e];
                    if (!exist[e]&&isAnagram(word, anagram)) {
                        l.add(anagram);
                        exist[e]=true;
                    }
                    e--;
                }
                list.add(l);
            }
            e = strs.length-1;
            s++;
        }
    return list;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1 = new String(arr1);
        String s2 = new String(arr2);
        if(s1.equals(s2)) {
            return true;
        }
        return false;
    }
}
