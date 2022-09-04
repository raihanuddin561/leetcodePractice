package leetcodeSolutions;

public class Solution917 {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start=0,end=s.length()-1;
        while (start<end){
            if (Character.isLetter(chars[start])&&Character.isLetter(chars[end])){
                char temp = chars[start];
                chars[start]=chars[end];
                chars[end]=temp;
                start++;
                end--;
            }else {
                if(!Character.isLetter(chars[start])) start++;
                if(!Character.isLetter(chars[end])) end--;
            }

        }
        return String.valueOf(chars);
        /*if(s.length()<1) return "";
        int start=0,end=s.length()-1;
        while (start<end){
            if(checkLetter(s.charAt(start))&&checkLetter(s.charAt(end))
                    &&start<end&&s.charAt(start)!=s.charAt(end)) {
                char temp = s.charAt(start);
                s=s.substring(0,start)+s.charAt(end)+s.substring(start+1);
                s=s.substring(0,end)+temp+s.substring(end+1);
                start++;
                end--;
            }else {
                if(!checkLetter(s.charAt(start))) start++;
                if(!checkLetter(s.charAt(end))) end--;
            }

        }*/
       // return s;
    }

    private boolean checkLetter(char aChar) {
//        (chars[start]>122&&chars[start]<97)||(chars[start]<65&&chars[start]>90)
         if((aChar>=65&&aChar<=90)||(aChar>=97&&aChar<=122)) return true;
         return false;
    }
}
