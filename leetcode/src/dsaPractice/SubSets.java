package dsaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
       // subset("","abc");
        List<Integer> list = new ArrayList<>();
        int[] sets = {1,2,2};
        List<List<Integer>> res=subSetI(sets);
        System.out.println(res.toString());
    }
    static void subset(String p,String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char a = up.charAt(0);
        subset(p+a,up.substring(1));
        subset(p,up.substring(1));
    }

    static void subSetInt(List<Integer> a, int[] b){
        if(b.length==0) {
          //  System.out.println(a.toString());
            return;
        }
        int i=b[0];
        a.add(i);
        subSetInt(a,Arrays.copyOfRange(b,1,b.length));
        a.remove(Integer.valueOf(i));
        subSetInt(a,Arrays.copyOfRange(b,1,b.length));
    }
    static List<List<Integer>> subSetIntList(int[] arr){
       List<List<Integer>> outer = new ArrayList<>();
       outer.add(new ArrayList<>());
       for(int num:arr){
           int n = outer.size();
           for(int i=0;i<n;i++){
               List<Integer> internal = new ArrayList<>(outer.get(i));
               internal.add(num);
               outer.add(internal);
           }
       }
       return outer;
    }
    static List<List<Integer>> subSetI(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0,end=0;
        for(int i=0;i<arr.length;i++){
            start = 0;
            if(i>0&&arr[i]==arr[i-1]){
                start=end+1;
            }
            int n = outer.size();
            end=n-1;
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
