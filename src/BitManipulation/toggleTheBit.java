package BitManipulation;

import java.util.Scanner;

public class toggleTheBit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number:");
        int N = sc.nextInt();

        System.out.println("Enter the bit to toggle:");
        int bit = sc.nextInt();

        N=N^(1<<bit);
        System.out.println(N);
    }

}
