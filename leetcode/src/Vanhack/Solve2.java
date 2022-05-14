package Vanhack;

import java.util.*;
import java.util.stream.Collectors;

public class Solve2 {public static String findRoutes(ArrayList<ArrayList<String>> routes) {
    String route="";
    int counter=0;
    String track="";
    for(ArrayList<String> r:routes){
        if(counter==0){
            route+=r.get(0)+","+r.get(1);
            track = r.get(1);
        }else {
            track = searchRoute(routes,track,counter);
            route+=","+track;
            if(track.contains(",")){
                String[] trackArr = track.split(",");
                track = trackArr[trackArr.length-1];
            }
        }
        counter++;
    }
    List<String> l =Arrays.stream(route.split(",")).distinct().collect(Collectors.toList());
    String result="";
    for(String s:l){
        result+=s+", ";
    }
    System.out.println(result);
    return result.replaceAll(",\\s*$","");
}

    private static String searchRoute(ArrayList<ArrayList<String>> routes, String track,int counter) {
        String r = "";
        boolean found = false;
        for(ArrayList<String> s:routes){
            if(s.get(0).equals(track)){
                r= s.get(0)+","+s.get(s.size()-1);
                found = true;
            }
        }
        if(!found){
            r = routes.get(counter).get(0) + ","+routes.get(counter).get(1);
        }

        return r.trim();
    }
}
