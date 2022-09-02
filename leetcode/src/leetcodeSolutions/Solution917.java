package leetcodeSolutions;

public class Solution917 {
    public String reverseOnlyLetters(String s) {
        if(s.length()<1) return "";
       // char[] chars = s.toCharArray();
        int start=0,end=s.length()-1;
        while (start<end){
            if(checkLetter(s.charAt(start)&&checkLetter(s.charAt(end)&&start<end&&s.charAt(start!=s.charAt(end) {
                char temp = s.charAt(start);
                s.setCharAt(start,) = s.charAt(end);
                chars[end]=temp;
                start++;
                end--;
            }else {
                if(!checkLetter(chars[start])) start++;
                if(!checkLetter(chars[end])) end--;
            }

        }
        StringBuilder sb =new StringBuilder();
        for(char c:chars){
            sb.append(c);
        }
        return sb.toString();
    }

    private boolean checkLetter(char aChar) {
//        (chars[start]>122&&chars[start]<97)||(chars[start]<65&&chars[start]>90)
         if((aChar>=65&&aChar<=90)||(aChar>=97&&aChar<=122)) return true;
         return false;
    }
}
