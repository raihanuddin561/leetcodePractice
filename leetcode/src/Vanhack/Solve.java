package Vanhack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solve {
    public static int bowling_score(String frames) {
        String[] bowls = frames.split(" ");
        int total = 0;
        int nextPoint = 0;
        int counter = 0;
        boolean bonus = false;
        int doubleBonus = 0;
        for(String s:bowls){

            int score = 0;
            char[] arr = s.toCharArray();
           /* if(counter+1<bowls.length && bowls[counter+1].equals("X")){
                if(arr[0]=='X')
            }*/
            if(arr.length>1 && arr[1]=='/'){
                if(bonus){
                    total+=parsingInt(String.valueOf(arr[0]));
                }
                bonus = true;
                score = parsingInt(String.valueOf(arr[0]))+(10-(parsingInt(String.valueOf(arr[0]))));
                if(doubleBonus>0){
                    total +=score;
                    doubleBonus=0;
                }
                total+=score;
            } else if (arr[0]=='X' || arr[0]=='x') {
                if(counter+1<bowls.length && bowls[counter+1].equals("X")){
                    if(arr[0]=='X') total+=10;
                }

                if(bonus ) {
                    bonus = false;
                    total += 10;
                }
                if( doubleBonus>0){
                   // doubleBonus--;
                    total+=10;
                }
               /* if(doubleBonus>0){
                    total+=10;
                    doubleBonus--;
                }*/
                doubleBonus = 2;
                total +=10;

            } else {
                bonus = false;
                total += calculatePoint(arr);
            }

            if(arr.length>2){
               for(int i=1;i<arr.length;i++){
                   if(arr[i]=='X' ){
                       total+=10;
                   }else  total += parsingInt(String.valueOf(arr[i]));
               }
            }
            counter++;
        }
        System.out.println("Total point: "+total);

        return total;
    }
    static int parsingInt(String s){
        return  Integer.parseInt(s);
    }
    private static int calculatePoint(char[] arr) {
        int point = 0;
        for(char a:arr){
            point+=Integer.parseInt(String.valueOf(a));
        }
        return point;
    }
}
