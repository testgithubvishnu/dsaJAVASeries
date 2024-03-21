package BitManipulation;

import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
    int N = sc.nextInt();

        System.out.println("Enter the bit to set:");
    int bit = sc.nextInt();

    N=N &(~(N<<bit));
        System.out.println(N);
  }
}
