package Recursion;

import java.util.Scanner;

public class SeriesSum {
    static int seriesSum1(int n)
    {
        if(n==0) return 0;

        return n+seriesSum1(n-1);
    }


    static int seriesSum2(int n)
    {
        if(n==1) return 1;
         if(n%2==0) {
             return seriesSum2(n - 1)-n;
         }
         else {
             return seriesSum2(n-1)+n;
         }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number:");
        int n=sc.nextInt();

        System.out.println("Sum of series is : "+seriesSum1(n));
        System.out.println("sum of series with alternate sign:"+seriesSum2(n));
    }
}
