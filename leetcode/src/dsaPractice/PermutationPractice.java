package dsaPractice;

import java.util.ArrayList;
import java.util.List;

public class PermutationPractice {
    public static void main(String[] args) {
        List<String> ans = permutation("","abcd");
        System.out.println(ans);
        //System.out.println(permutation("","abc"));
    }
    static List<String> permutation(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c= up.charAt(0);
        List<String> lst = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            lst.addAll(permutation(f+c+l,up.substring(1)));
        }
        return lst;
    }
}
