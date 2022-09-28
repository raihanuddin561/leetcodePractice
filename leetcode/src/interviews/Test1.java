package interviews;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static List<String> months = Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
    public String prepareMonth(String str1,int k){
      //  int number = k%12;
        int index = months.indexOf(str1);
        int newIndex = (index+k)%12;
        return months.get(newIndex);
    }
    public static String run(String startPosition, int R, int C) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */

        char[] chars = startPosition.toCharArray();
        int row = chars[0]-48;
        int col=chars[1];
        int rowRem = R%8;
        int colRem=C%8;
        row = row+rowRem;
        col=col+colRem;
        row=row>8?row%8:row;
        col=col>8?col%8:col;
        String endPosition = "";
        endPosition+=row;
        col+=96;
        endPosition+=(char)col;
        return endPosition;
    }
}
