package interviews.japan.line;

public class Test {
    public static void main(String[] args) {
        /*Task2 task2 = new
                Task2();
        int[][] map = {{1,1,2},{3,4,3},{3,1,2}};
        task2.minimumCost(map);*/
       /* Task1 task1 = new Task1();
        String[] arr = {"3","3","4","5","1"};
        task1.solution(arr);*/
        Task4 task4 = new Task4();
        /*
        [2, ['10.20.31.12 200 http://example.com/index', '10.20.30.12 200 http://example.com/welcome', '10.20.31.11 200 http://example.com/index', '192.168.10.12 200 http://example.com/index', '192.168.15.12 404 http://example.com/nonono', '192.168.17.12 404 http://example.com/nonono']]

         */
        String[] arr = {
                "10.20.31.12 200 http://example.com/index", "10.20.30.12 200 http://example.com/welcome",
                "10.20.31.11 200 http://example.com/index", "192.168.10.12 200 http://example.com/index",
                "192.168.15.12 404 http://example.com/nonono", "192.168.17.12 404 http://example.com/nonono"
        };
        task4.solution(2,arr);
    }
}
