package leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution43 {
    public String multiply(String num1, String num2) {
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int chLen1 = chars1.length;
        int chLen2 = chars2.length;
        int loop1 =chLen1,loop2=chLen2;
        if(loop2>loop1){
            char[] temp = chars1;
            chars1 = chars2;
            chars2 = temp;
            int tempLoop = loop1;
            loop1=loop2;
            loop2=tempLoop;
        }
        int[] res= new int[loop1+loop2];
        int carry = 0,r=0;
        for(int i=chars2.length-1;i>=0;i--,r++){
            int n1=chars2[i]-48;
            int sumIndex = loop1+loop2-1-r;
            carry = 0;
            int s=0;
            for(int j=chars1.length-1;j>=0;j--){
               int n2 = chars1[j]-48;
               int mul = n1*n2+carry;
               res[sumIndex]+=mul;
               carry = res[sumIndex]/10;
                res[sumIndex]%=10;
                sumIndex--;
            }
            if(carry!=0) res[sumIndex]=carry;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<res.length;i++){
            if(i==0&&res[i]==0)sb.append("");
            else sb.append(res[i]);
        }
return sb.toString();
      /*  int counter=0;
        int number1=0;
        for(int i=chars1.length-1;i>=0;i--){
            double num=chars1[i]-48;
            num=Math.pow(10,counter)*num;
            number1 += num;
            counter++;

        }
        int counter2=0;
        int number2=0;
        for(int i=chars2.length-1;i>=0;i--){
            double num=chars2[i]-48;
            num=Math.pow(10,counter2)*num;
            number2 += num;
            counter2++;

        }
        return String.valueOf(number1*number2);*/
    }
}
