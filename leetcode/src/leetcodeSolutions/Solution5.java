package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution5 {
    public String longestPalindrome(String s) {
       int max =0;
       String maxSubString = "";
       String output = "";
       int counter = 0;
      for(int i=0;i<s.length();i++){
          int r =i,l=i;
          while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
              if(max<r-l+1){
                  output = s.substring(l,r+1);
                  max=r-l+1;
              }
              l--;
              r++;
          }
          l = i;r=i+1;
          while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
              if(max<r-l+1){
                  output = s.substring(l,r+1);
                  max=r-l+1;
              }
              l--;
              r++;
          }

      }

return output;
       /*for(int i =0 ;i<s.length();i++){
            String subString = "";
            for(int j=i;j<s.length();j++){
                subString+=s.charAt(j);
                if(checkPalindrome(subString)){
                    if(subString.length()>=max){
                        maxSubString = subString;
                        max = subString.length();
                    }
                }
            }
        }*/
    }

    private boolean checkPalindrome(String subString) {
        String reverse = "";
        for(int i=subString.length()-1;i>=0;i--){
            reverse+=subString.charAt(i);
        }
        if(reverse.equals(subString)){
            return true;
        }
        return false;
    }

   /* private Stream<String> subString(String s) {
        return IntStream.range(1,s.length()).mapToObj(i->s.substring(0,i));
    }*/
}
