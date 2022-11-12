package interviews.japan.line;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

public class Task2 {
    int minimumCost(int[][] map){
        // write your code in Java 8
        int r = map.length-1;
        int c = map[0].length-1;
        int cost= count(r,c,0,map);
        return -1;
    }

    private int count(int r, int c,int prev,int[][]map) {
        if(r==0||c==0) {
            if(prev==map[r][c]) return 0;
            return map[r][c];
        }
        //if(map[r][c]==)
       int left = count(r-1,c,map[r][c],map);
       int right = count(r,c-1,map[r][c],map);
       return left+right;

    }

    // The following may not need to be modified
    public int solution(int rows, int cols, String input) {
        int[][] costs = new int[rows][cols];
        final Scanner in = new Scanner(new BufferedReader(new StringReader(input)));
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                costs[i][j] = in.nextInt();
            }
        }
        return minimumCost(costs);
    }
}
