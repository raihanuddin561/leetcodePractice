package toptal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SolutionToptal {
    public int solution(String[] T, String[] R) {
        // write your code in Java SE 8
        Set<String> groups = new HashSet<>();
        for(int i=0;i< T.length;i++){
            String gname = T[i].replaceAll("(.*?[0-9])[A-Za-z]+","$1_");
           groups.add(gname.split("_")[0]);

        }
       int size =  groups.size();
        int passedGroup = 0;
        for(String g:groups){
            boolean flag = true;

            for(int i=0;i< T.length;i++){
                if(T[i].contains(g)){
                    if(!R[i].equals("OK")) flag = false;
                }
            }
            if(flag) passedGroup++;
        }
        int result = (passedGroup*100)/size;
        return result;
    }
}
