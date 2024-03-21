package BitManipulation;

import java.util.Scanner;

public class checkBitSetorNot {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the number:");
    int N= sc.nextInt();

    System.out.println("Enter the bit:");
    int bit=sc.nextInt();

     if((N & (1<<bit))!=0)
     {
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
     }

    }
}
