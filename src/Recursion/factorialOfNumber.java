package Recursion;

import java.util.Scanner;


public class factorialOfNumber {
    static int  printFactorial(int n)
    {
        if(n==0) return 1;

        return n*printFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();

        System.out.println(printFactorial(n));

    }
}
