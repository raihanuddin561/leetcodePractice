package leetcodeSolutions;

public class Solution344 {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }

    private void reverse(char[] s, int start, int end) {
        if(start<end) {
        char temp=s[start];
        s[start] = s[end];
        s[end]=temp;
        reverse(s,++start,--end);}
    }
}
