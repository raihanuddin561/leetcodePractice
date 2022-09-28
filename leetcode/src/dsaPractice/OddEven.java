package dsaPractice;

public class OddEven {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isOdd(n));
        System.out.println(isEven(66));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
    public static boolean isEven(int n){
        return (n&1)!=1;
    }
}
