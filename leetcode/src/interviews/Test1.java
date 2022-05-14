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
}
