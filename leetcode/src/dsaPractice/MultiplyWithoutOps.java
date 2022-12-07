package dsaPractice;

import java.util.Scanner;

public class MultiplyWithoutOps {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give input: ");
        int multiplicand = sc.nextInt();
        while (multiplicand!=100){
            int multiplicator = 4;
            multiply(multiplicand,multiplicator);
            System.out.println();
            multiplicand = sc.nextInt();
        }
    }
    static void multiply(int x, int y){
        int product=0;
        int multiplicand = x;
        int multiplicator= y;
        for(int i=0; i<multiplicator; i++)
        {
            product = sum(product, multiplicand);
        }
        System.out.print("The product of "+multiplicand+" and "+multiplicator+" is:  "+product);
    }
    static int sum(int multiplicand, int multiplicator)
    {
        while(multiplicator != 0)
        {
            int x = (multiplicand & multiplicator);
            multiplicand = multiplicand ^ multiplicator;
            multiplicator = x<<1;
        }
        return multiplicand;
    }
}
