package Vanhack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
      /*  ArrayList<String> r = new ArrayList<>();
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
        Solve2.findRoutes(routes);*/
       /* HashMap<String, ArrayList<String>> requests = new HashMap<>();
        requests.put(
                "ada", new ArrayList<>(Arrays.asList(
                        new String[] {"mon", "tue", "wed", "thu", "fri", "sat"}
                ))
        );
        requests.put(
                "emma", new ArrayList<>(Arrays.asList(
                        new String[] {"tue", "wed", "thu", "sun"}
                ))
        );
        requests.put(
                "remy", new ArrayList<>(Arrays.asList(
                        new String[] {"mon", "fri", "sun"}
                ))
        );
        requests.put(
                "zach", new ArrayList<>(Arrays.asList(new String[] {}))
        );
        ChefScheduler.schedulable(requests);
       System.out.println(ChefScheduler.schedulable(requests));*/
       // System.out.println(SecondSolve1.schedulable(requests));

       /* ArrayList<SushiOrder> request = new ArrayList<>(
                Arrays.asList(
                        new SushiOrder(1, // seatId for this order
                                new ArrayList<>(Arrays.asList(
                                        new String[] {
                                                // menuItemIds for this order
                                                "tuna", "california", "avocado"
                                        }
                                ))
                        ),
                        new SushiOrder(3,
                                new ArrayList<>(Arrays.asList(
                                        new String[] {"avocado"}
                                ))
                        ),
                        new SushiOrder(2,
                                new ArrayList<>(Arrays.asList(
                                        new String[] {
                                                "salmon", "tuna", "crab", "scallop"
                                        }
                                ))
                        )
                )
        );
        SushiOrderManager manager = new SushiOrderManager();
        manager.addOrder(request);

        for (int i = 0; i < 8; i++) {
            System.out.println(manager.nextItem());
        }*/

       /* ArrayList<SushiOrder> request = new ArrayList<>(
                Arrays.asList(
                        new SushiOrder(2,
                                new ArrayList<>(Arrays.asList(
                                        new String[] {"dragon"}
                                ))
                        ),
                        new SushiOrder(1,
                                new ArrayList<>(Arrays.asList(
                                        new String[] {"avocado", "dynamite"}
                                ))
                        )
                )
        );
        SushiOrderManager manager = new SushiOrderManager();

        manager.addOrder( request);
        request = new ArrayList<>(
                Arrays.asList(
                        new SushiOrder(1,
                                new ArrayList<>(Arrays.asList(
                                        new String[] {"mushroom"}
                                ))
                        )
                )
        );
        manager.addOrder( request);

        for (int i = 0; i < 4; i++) {
            System.out.println(manager.nextItem());
        }*/


      //  System.out.println( Challenge.parseCsv("a,b,c\nd,e,f","",""));
       /* String s="ne,\"two wraps\n" +
                "onto \"\"two\"\" lines\",three\n" +
                "4,,6";*/
       // String s = "1.2.3\n4.5.6";
        String s = "a $string$ using $ as the quote, multi\n" +
                "line, \n, " +
                "1.2, 3, 4";
      //  String s = "1,\"two was here\",3\n4,5,6";
       // System.out.println( Challenge.parseCsv("",",","\""));
        System.out.println( Challenge.parseCsv(s,".","\""));
    }
}
