package interviews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntTest {
    public static void main(String[] args) {
        int[] a ={25,2,3,38,57,41};
        var arr = solution(a);
        System.out.println(arr);
    }
    static int[] solution(int[] a) {
        Map<Integer,Integer> counterMap = new HashMap<>();
        for(int item:a){
            while(item!=0){
                var k = item%10;
                var v=counterMap.get(k);
                counterMap.put(k, v==null?1:v+1);
                item=item/10;
            }
        }
        var max = counterMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
        List<Integer> list = new ArrayList<>();
        counterMap.forEach((k,v)->{
            if(v==max) list.add(k);
        });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
