package Vanhack;

import java.util.*;

public class SecondSolve1 {
    enum Days{
        MON,TUE,WED,THU,FRI,SAT,SUN;
    }
    public static boolean schedulable(
            HashMap<String, ArrayList<String>> requests
    ) {
        Map<String,Integer> counter = new HashMap<>();
        Map<String, List<String>> personsByDays = new HashMap<>();
        Days[] days =Days.values();
        for(Days day:days){
            personsByDays.put(day.name(),getPersonsByDay(day.name(),requests,counter));
        }
        personsByDays.forEach((k,v)->{
            if(v.size()>2){
                List<String> updatedValues = getRemovableName(v,counter);
                personsByDays.put(k,updatedValues);
            }
        });
        for(List<String> v: personsByDays.values()){
            if(v.size()<2) return false;
           /*
            else {
                List<String> found = new ArrayList<>();
                for(String s:v){
                    if(found.contains(found)) return false;
                }
            }
            */
        }
        Map<String,Integer> dayCount = new HashMap<>();
        counter.forEach((k,v)->{
            personsByDays.forEach((p,q)->{
               if(q.contains(k)) dayCount.put(k,dayCount.get(k)!=null?dayCount.get(k)+1:1);
            });
        });
        for(int val:dayCount.values()){
            if(val>5) return false;
        }
        return true;
    }

    private static List<String> getRemovableName(List<String> v, Map<String, Integer> counter) {
        String name ="";
        int count = 0;
        int low =0;
        while (v.size()>2){
            if(count==0){
                count=counter.get(v.get(low));
                name=v.get(low);
            }else {
                if(count<=counter.get(v.get(low))){
                    count = counter.get(v.get(low));
                    name=v.get(low);
                    v.remove(name);
                }
            }
        }
        return v;
    }

    private static List<String> getPersonsByDay(String day, HashMap<String, ArrayList<String>> requests,Map<String,Integer> counter) {
        List<String> persons = new ArrayList<>();
        requests.forEach((k,val)->{
            if(!val.contains(day.toLowerCase())){
                persons.add(k);
            }
        });
        persons.forEach(p->{
            counter.put(p,counter.get(p)!=null?checkDays(counter,p):1);
        });
        return persons;
    }

    private static Integer checkDays(Map<String, Integer> counter,String person) {
        if(counter.get(person)<5){
            return counter.get(person)+1;
        }
        return counter.get(person);
    }
}
