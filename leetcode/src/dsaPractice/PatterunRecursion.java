package dsaPractice;

public class PatterunRecursion {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        printStart(n,0);
    }

    private static void printStart(int r, int c) {
        if(r==0) return;
        System.out.print(" *");
        if(r==c){
            r--;
            c=0;
            System.out.println();
        }
        printStart(r,++c);
    }
}
