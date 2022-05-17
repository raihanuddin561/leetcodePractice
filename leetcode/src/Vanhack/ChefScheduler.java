package Vanhack;

import java.util.*;
import java.util.stream.Collectors;

final public class ChefScheduler {

    public static boolean schedulable(
            HashMap<String, ArrayList<String>> requests
    ) {
        String[] days = {"mon","tue","wed","thu","fri","sat","sun"};
        Map<String,List<String>> personsDays = new HashMap<>();
        String[] names = requests.keySet().toArray(String[]::new);
        Map<String,Integer> dayCounter = new HashMap<>();
        for(String day:days){
            personsDays.put(day,getPersonsByDay(day,requests));
        }
        for(String day:days){
            List<String> personsByDays = personsDays.get(day);
            List<String> newPersons = new ArrayList<>();
            if(personsByDays.size()>2){
                String first ="";
                String second = "";
                int low=0,high=personsByDays.size(),firstN=0,secondN=0;
                while (low<high){
                    int counter = dayCounter.get(personsByDays.get(low))!=null?dayCounter.get(personsByDays.get(low)):0;
                    if(low==0){
                        firstN = counter;
                        first = personsByDays.get(low);
                    } else if(low==1){
                        secondN = counter;
                        second = personsByDays.get(low);
                    } else {
                        if(firstN>counter){
                            firstN = counter;
                            first = personsByDays.get(low);
                        }
                        else if(secondN>counter ){
                            secondN = counter;
                            second = personsByDays.get(low);
                        }
                    }
                    low++;

                }
                newPersons.add(first);
                newPersons.add(second);
                personsDays.put(day,newPersons);
            }else {
                for(String person:personsByDays){
                    dayCounter.put(person,dayCounter.get(person)!=null?dayCounter.get(person)+1:1);
                }
            }
        }
        System.out.println(personsDays);
        for(List<String> val:personsDays.values()){
            if(val.size()<2){
                return false;
            }
        }
        for(int val:dayCounter.values()){
            if(val>5) return false;
        }
        return true;
    }
    private static List<String> getPersonsByDay(String day, HashMap<String, ArrayList<String>> requests) {
        List<String> persons = new ArrayList<>();
        requests.forEach((k,val)->{
            if(!val.contains(day.toLowerCase())){
                persons.add(k);
            }
        });
        return persons;
    }
}