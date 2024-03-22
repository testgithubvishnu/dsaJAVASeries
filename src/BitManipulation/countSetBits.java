package BitManipulation;

import java.util.Scanner;

public class countSetBits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        int count=0;
        while(num!=0)
        {
            if(num%2==1) {
                count++;
            }
            num=num/2;
        }
        System.out.println(count);
    }
}
