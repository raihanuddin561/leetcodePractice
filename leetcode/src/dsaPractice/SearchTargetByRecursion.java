package dsaPractice;

import java.util.ArrayList;
import java.util.List;

public class SearchTargetByRecursion {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,4,5,6,7};
        List find=find(arr,4,0);
        System.out.println(find.toString());
    }
    static List find(int[]arr,int t,int i){
        List<Integer> list=new ArrayList<>();
        if(i==arr.length) return list;
        if(arr[i]==t) list.add(i);
        List<Integer> getList=find(arr,t,++i);
        if(!getList.isEmpty()) list.addAll(getList);
        return list;
    }
}
