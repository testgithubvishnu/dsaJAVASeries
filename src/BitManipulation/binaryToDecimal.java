package BitManipulation;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Binary number:");
        String str=sc.nextLine();

        int n=str.length();
        int ans=0;
        int P2=1;

        for(int i=n-1;i>=0;i--)
        {
            if(str.charAt(i)=='1')
                 ans=ans+P2;
            P2=P2*2;

        }
        System.out.println("Decimal number is :"+ans);
    }
}
