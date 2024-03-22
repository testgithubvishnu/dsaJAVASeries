package BitManipulation;

import java.util.Scanner;

public class checkNUmberPowerOf2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        // Every Power of Two has exactly one set bit.
        // 16 - 10000 , 8 - 1000 ,4 - 100 etc.

        if((num & (num-1))==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
