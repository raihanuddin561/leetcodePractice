package dsaPractice;

public class PatternPractice {
    public static void main(String[] args) {
       // pattern1(5);
        patternSquareAndMinNumberPrint(3);
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

    static void patternSquareAndMinNumberPrint(int n){
        int originN= n+1;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int atIndex =originN- Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(atIndex+" ");
            }
            System.out.println();
        }
    }
}
