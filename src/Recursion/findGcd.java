package Recursion;

import java.util.Scanner;

public class findGcd {
    static  int FindGcd(int x,int y)
    {
        while(x%y!=0)
        {
            int rem=x%y;
            x=y;
            y=rem;

            // _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
            // | LCM= X*y/(gcd);                       |
            // | Euclids Algorithm:                    |
            // | It Says that,  GCD(x,y)=GCD(y,x%y);    |
            // |_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|
            //
             }
        return y;
    }

    static int euclidAlgorithm(int x,int y)
    {
        if(y==0) return x;
        return FindGcd(y,x%y);
    }
    public static void main(String[] args) {
        {
           Scanner sc= new Scanner(System.in);
            System.out.println("Enter two numbers");
           int n1=sc.nextInt();
           int n2=sc.nextInt();

            System.out.println("Greatest Common Divisor of GIven number is:"+FindGcd(n1,n2));
            System.out.println("Greatest Common Divisor of GIven number is:"+euclidAlgorithm(n1,n2));

        }
    }
}
