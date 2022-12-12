package leetcodeSolutions;

public class Solution345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0,end = s.length()-1;
        while (start<=end){
            while (start<end) {
                char ch = s.charAt(start);
                if(ch=='a'|ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    break;
                }
                start++;
            }
            while (start<end){
                char ch = s.charAt(end);
                if(ch=='a'|ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    break;
                }
                end--;
            }
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
