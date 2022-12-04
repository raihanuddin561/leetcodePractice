package leetcodeSolutions;

public class Solution557 {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word:strArr){
            sb.append(reverse(word)).append(" ");
        }
        return sb.toString().trim();
    }

    private String reverse(String word) {
        char[] chars = word.toCharArray();
        int start = 0,end = chars.length-1;
        while (start<end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
