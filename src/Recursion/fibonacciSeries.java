package Recursion;

import java.util.Scanner;


// Recursive Tree:
public class fibonacciSeries {
    public static int fibonacci(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();

        System.out.println("Fibonacci Number: "+fibonacci(n));

    }
}
