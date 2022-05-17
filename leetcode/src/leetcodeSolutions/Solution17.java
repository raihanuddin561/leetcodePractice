package leetcodeSolutions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution17 {
    public List<String> letterCombinations(String digits) {

        Map<String ,String> map = Map.of("2","abc","3","def","4","ghi","5","jkl",
                "6","mno","7","pqrs","8","tuv","9","wxyz");
        int low = 0;
        int high = digits.length()-1;
        List<String> result = new ArrayList<>();
        if(digits.isEmpty() || digits.equals(null)) return result;
        if(digits.length()<2 ){
            if(!digits.equals("1") || !digits.equals("0")){
                String s = map.get(digits);
                char[] chars = s.toCharArray();
                for(char c:chars) result.add(String.valueOf(c));
                return result;
            }
        }
        Set<String> strings = new HashSet<>();
        while (low<high){
            if(digits.charAt(low)!='1' && digits.charAt(high)!='1'){

                String st1 = map.get(String.valueOf(digits.charAt(low)));
                String st2 = map.get(String.valueOf(digits.charAt(high)));
                strings.add(st1);
                strings.add(st2);
                high--;
                while (low<high){
                    String st = map.get(String.valueOf(digits.charAt(high)));
                    strings.add(st);
                    high--;
                }
                System.out.println("p");
                /*for(int i =0;i<st1.length();i++){
                    for (int j = 0;j<st2.length();j++){
                        String res = ""+st1.charAt(i)+st2.charAt(j);
                        result.add(res);
                    }
                }*/

            }

            if(high<=low){
                high = digits.length()-1;
                low++;
            }
        }
        int l = 0;
        int h = strings.size()-1;
        String[] sarr = strings.stream().toArray(String[]::new);
        while (l<h){
            String s = sarr[l];
            String s2 = sarr[h];
            while (l<h){

            }
        }
return result;
    }
}
