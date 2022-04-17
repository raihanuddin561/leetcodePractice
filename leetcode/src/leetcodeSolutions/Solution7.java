package leetcodeSolutions;

import java.util.stream.Stream;

public class Solution7 {
    public int reverse(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        int len =chars.length;
        String output = "";
        for (int i=len-1;i>=0;i--){
            if(chars[0]=='-'){
                output+='-';
                chars[0]=' ';
            }
            if(chars[i]!=' '){
                output+=chars[i];
            }

        }
        int finalResult = 0;{
            try{
                finalResult = Integer.parseInt(output);
            }catch (NumberFormatException e){

            }finally {
                finalResult = 0;
            }
        }
        if(finalResult<-Math.pow(2,31) || finalResult>Math.pow(2,31)-1){
            return 0;
        }
        return finalResult;
    }
}
