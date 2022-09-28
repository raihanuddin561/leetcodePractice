package dsaPractice;

public class TryCatchPractice {
    public static void main(String[] args) {
        int val = getVal(3,2);
        System.out.println("val: "+val);
    }

    private static int getVal(int a, int b) {
        try {
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return -1;
        }finally {
            System.out.println("execute all");
           // return 0;
        }
    }
}
