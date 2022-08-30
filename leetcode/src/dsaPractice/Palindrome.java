package dsaPractice;

public class Palindrome {
    public static void main(String[] args) {
        String s = "nine";
       // String s = "sitonapanotis";

        /*System.out.println(s.length()+":"+s.substring(1,s.length()-1));
        System.out.println(s.substring(0,14));*/
        System.out.println(checkPalindrome(s));

    }
    static boolean checkPalindrome(String s){
        if(s.length()==0||s.length()==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return checkPalindrome(s.substring(1,s.length()-1));
        }
        return false;
    }
}
