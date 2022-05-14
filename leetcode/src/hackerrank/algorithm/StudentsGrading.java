package hackerrank.algorithm;

import java.util.ArrayList;
import java.util.List;

public class StudentsGrading {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        grades.forEach(g -> {
            setGrade(g, result);
        });
        return result;
    }

    private static void setGrade(Integer g, List<Integer> result) {
         char[] chars = String.valueOf(g).toCharArray();
         int tenthTimes = Integer.parseInt(String.valueOf(chars[0]))*10;
        if(g!=100){
            if(tenthTimes<40){
                if(40-g<3){
                    g = 40;
                }
            }else {
                if(g>95 && g<100){
                    if(100-g<3){
                        g=100;
                    }
                }
                else if(g>tenthTimes && g<tenthTimes+5){
                    if((tenthTimes+5)-g<3){
                        g = tenthTimes+5;
                    }
                }else if (g>tenthTimes+5 && g<tenthTimes+10) {
                    if((tenthTimes+10)-g<3){
                        g=tenthTimes+10;
                    }
                }
            }
        }
        result.add(g);
    }

}
