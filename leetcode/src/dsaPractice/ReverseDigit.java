package dsaPractice;

public class ReverseDigit {
    static  int  sum=0;
    public static void main(String[] args) {
   //    reverse(1403);
       int res=0;
     res=  reverse(1403,res);
        System.out.println("res "+res);
      //  System.out.println(sum);
    }
    static void reverse(int digit){
        if(digit==0) return;
        int r = digit%10;
        sum=sum*10+r;
        //System.out.println(d);
       reverse(digit/10);
    }
    static int reverse(int digit,int sum){
        if(digit==0) return sum;
        int r = digit%10;
        sum=sum*10+r;
        //System.out.println(d);
       return reverse(digit/10,sum);
    }
}
