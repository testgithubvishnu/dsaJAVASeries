package Recursion;

import java.util.Scanner;

public class printMultiples {
    public static void multiples(int n,int k)
    {
        if(k==1)
        {
            System.out.println(n);
            return;
        }
         multiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        System.out.println("Enter number of multiples:");
        int k=sc.nextInt();

        multiples(n,k);

    }
}
