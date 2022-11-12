package interviews.japan.line;

public class Task3 {
    public String bingo(int[][] board, int[] inputs){
        // write your code in Java 8
        String result="";
        if(horizontalCheck(board,inputs,result)){
            return result;
        }else if(verticallyCheck(board,inputs,result)){
            return result;
        }else if(diagonalCheck(board,inputs,result)){
            return result;
        }
        else return result;
    }

    private boolean diagonalCheck(int[][] board, int[] inputs, String result) {
        for(int i=0;i<board.length;i++){

        }
        return true;
    }

    private boolean verticallyCheck(int[][] board, int[] inputs, String result) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

            }
        }
        return true;
    }

    private boolean horizontalCheck(int[][] board, int[] inputs, String result) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

            }
        }
        return true;
    }

    // The following may not need to be modified
    public String solution(int n, int[] rawBoard, int[] inputs) {
        final int[][] board = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                board[i][j]=rawBoard[i * n + j];
            }
        }
        return bingo(board, inputs);
    }
}
