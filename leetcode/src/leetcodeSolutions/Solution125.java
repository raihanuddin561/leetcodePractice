package leetcodeSolutions;

public class Solution125 {
    public boolean isPalindrome(String s) {
        s =s.toLowerCase();
        int st=0,e=s.length()-1;
        if(st>=e)return true;
        while (st<=e){
            while (!Character.isLetterOrDigit(s.charAt(st)) && st<e) st++;
            while (!Character.isLetterOrDigit(s.charAt(e)) && st<e) e--;
            if(s.charAt(st)!=s.charAt(e)) return false;
            st++;
            e--;
        }
        return true;
    }
}
