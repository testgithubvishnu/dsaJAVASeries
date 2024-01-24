package Recursion;

import java.util.Scanner;

public class printWithoutLoop {
    static  void printIncreasing(int n)
    {
        if(n==1 ) {
            System.out.println(1);
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }
    //----------------------------------------------------------------
    static  void printDecreasing(int n)
    {
        if(n==1 ) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        printDecreasing(n-1);
    }
    //-------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();

        printIncreasing(n);
        printDecreasing(10);

    }
}
