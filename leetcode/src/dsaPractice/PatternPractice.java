package dsaPractice;

public class PatternPractice {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){

        for(int i=0;i<2*n;i++){
            int col = i>n?2*n-i:i;
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
