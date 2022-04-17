package hackerrank.algorithm;

import java.util.Arrays;
import java.util.StringJoiner;

public class FormatWatch {
    public static String timeConversion(String s) {
        String[] arr = s.split(":");
        String hour= Arrays.stream(arr).findFirst().get();
        int h = Integer.parseInt(hour);
        int hours = 0;
        if(s.contains("PM")){
           if(h!=12){
               hours = h+12;
           }else hours = h;

        }else {
            if(h==12)hours=00;
            else hours=h;
        }
        String val = String.valueOf(hours);
        arr[0]=val.equals("0")||val.length()==1?"0"+val:val;
        StringJoiner sj = new StringJoiner(":");
        for(String s1:arr){
            sj.add(s1);
        }
        return sj.toString().replaceAll("AM","").replaceAll("PM","");
    }
}
