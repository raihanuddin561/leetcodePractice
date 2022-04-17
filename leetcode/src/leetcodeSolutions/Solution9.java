package leetcodeSolutions;

public class Solution9 {
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        String val = "";

        for(int i=chars.length-1;i>=0;i--){
            if(chars[0]=='-'){
                val+='-';
                chars[0]=' ';
            }
            if(chars[i]!=' '){
                val+=chars[i];
            }
        }

        if(String.valueOf(x).equals(val)){
            return true;
        }
        return false;
    }
}
