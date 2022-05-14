package Vanhack;

import java.util.ArrayList;

public class VanTest {
    public static void main(String[] args) {
      /*  Solve_p.bowling_score("11 11 11 11 11 11 11 11 11 11"); // ans: 20
        Solve_p.bowling_score("5/ 4/ 3/ 2/ 1/ 0/ X 9/ 4/ 7/2"); // ans: 143
        Solve_p.bowling_score("X X X X X X X X X XXX"); // ans: 300
        Solve_p.bowling_score("8/ 7/ 34 X 2/ X X 80 X 8/9"); //ans: 170*/

/*
[["USA","BRA"],["JPN","PHL"],["BRA","UAE"],["UAE","JPN"]]
Chicago, Winnipeg, Seattle, Montreal, Toronto, Toronto, Chicago, Winnipeg, Seattle
 */
        ArrayList<String> r = new ArrayList<>();
        ArrayList<String> r1 = new ArrayList<>();
        ArrayList<String> r2 = new ArrayList<>();
        ArrayList<String> r3 = new ArrayList<>();
        r.add("USA");
        r.add("BRA");
        r1.add("JPN");
        r1.add("PHL");
        r2.add("BRA");
        r2.add("UAE");
        r3.add("UAE");
        r3.add("JPN");
        ArrayList<ArrayList<String>> routes = new ArrayList<>();
        routes.add(r);
        routes.add(r1);
        routes.add(r2);
        routes.add(r3);
        Solve2.findRoutes(routes);
    }
}
