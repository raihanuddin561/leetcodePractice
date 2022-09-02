package dsaPractice;

public class Power {
    public static void main(String[] args) {
        int base=3;
        int ans=1;
        int n=6;
        while (n>0){
            if((n&1)==1) ans*=base;
            base*=base;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
