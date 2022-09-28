package dsaPractice;

import java.util.Arrays;

public class KMPAlgo {
    public static void main(String[] args) {
        String hayStack = "sadbutsad";
        String neadle = "sad";
        int[] lps = lps(neadle);
      //  int[] lps = lps("aaaa");
       int i=0,j=0;
       int res = -1;
        while (i<hayStack.length()){
            if(hayStack.charAt(i)==hayStack.charAt(j)){
                i++;
                j++;
            }else {
                if(j==0){
                    i++;
                }else {
                    j=lps[j-1];
                }
            }
            if(j==lps.length) {
                res = Math.abs(lps.length-i);
                break;
            }
        }
        System.out.println("Matching index: "+res);
    }
    static int[] lps(String pattern){
        int[] lps=new int[pattern.length()];
        int prevLps=0,i=1;
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
}
