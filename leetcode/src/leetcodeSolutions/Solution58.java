package leetcodeSolutions;

public class Solution58 {
    public int lengthOfLastWord(String s) {

        if(s==null||s.equals("")) return 0;
        String[] words = s.strip().split(" ");
       return words[words.length-1].length();
    }
}
