package interviews.japan.line;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Task4 {
    public String[] solution(int n, String[] logs) {
        // write your code in Java 8
        List<String> urlList = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[]arr=logs[i].split(" ");
            if(arr[1].equals("200")){
                urlList.add(arr[2]);
            }
        }
        Collections.sort(urlList, Comparator.comparingInt(String::length).thenComparing(Function.identity()));
        return urlList.stream().toArray(String[]::new);
    }
}
