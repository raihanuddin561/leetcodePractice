package leetcodeSolutions;

public class Solution214 {
    public String shortestPalindrome(String s) {
        String s1 = s+"$"+new StringBuilder(s).reverse().toString();
        int[] lps = lps(s1);
        int res = lps[lps.length-1];
        String right = s.substring(res);
        String sub=new StringBuilder(right).reverse().toString()+s;
        return sub;
    }

    private int[] lps(String pattern) {
        int i = 1;
        int[] lps=new int[pattern.length()];
        int prevLps =0;
        while (i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(prevLps)){
                lps[i]=prevLps+1;
                prevLps++;
                i++;
            }else if(prevLps==0){
                lps[i]=0;
                i++;
            }else {
                prevLps=lps[prevLps-1];
            }
        }
        return lps;
    }

    //  String p=makePalindrome(s,0,s.length()-1,0);
       /* int start=0,end=s.length()-1,targetIndex=0;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                s=makeString(s,targetIndex,end);
                targetIndex++;
                start++;
            }else {
                if(s.charAt(start+1)==s.charAt(end)){
                    if(s.charAt(start+1)!=s.charAt(end-1)){
                        s=makeString(s,targetIndex,end);
                        targetIndex++;
                        start++;
                    }else {
                        start++;
                        end--;
                    }
                }else {
                    s=makeString(s,targetIndex,end);
                    targetIndex++;
                    start++;
                }

            }

        }
        return s;
    }

    private String makePalindrome(String s, int start, int end,int targetIndex) {
       // if(isPalindrome(s,0,s.length()-1)) return s;
        if(start>=end) return s;
        if(s.charAt(start)!=s.charAt(end)){
          s=makeString(s,targetIndex,end);
           targetIndex++;
        }else {
            if(s.charAt(start+1)==s.charAt(end)){
                if(s.charAt(start+1)!=s.charAt(end-1)){
                  s=makeString(s,targetIndex,end);
                    targetIndex++;
                }else {
                    start++;
                    end--;
                }
            }else {
                s=makeString(s,targetIndex,end);
                targetIndex++;
            }

        }
        return makePalindrome(s,start,end,targetIndex);

    }

    private String makeString(String s, int targetIndex, int end) {
        String sub=s.substring(targetIndex,s.length());
        s= s.substring(0,targetIndex)+s.charAt(end)+sub;
        return s;
    }

    private boolean isPalindrome(String s,int start,int end) {
        if(start>=end) return true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return isPalindrome(s,++start,--end);
    }*/
    /*  if(start>end) return s;

        if(s.charAt(start)==s.charAt(end)){
            if(s.charAt(start+1)==s.charAt(end)){
               if(s.charAt(start+1)!=s.charAt(end-1)){
                   s=s.substring(0,targetIndex)+s.charAt(end)+s.substring(targetIndex);
                   targetIndex++;
                   start=targetIndex+1;
               }
            }
            start++;

        }else {
            s=s.substring(0,targetIndex)+s.charAt(end)+s.substring(targetIndex);
            targetIndex++;
            start=targetIndex+1;
        }

        end--;
        return makePalindrome(s,start,end,targetIndex);*/
}
