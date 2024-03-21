package BitManipulation;

public class swapNumbers {
    public static void main(String[] args) {
        // Swapping without using third variable:

        int a=4;
        int b=5;
        System.out.println("a="+a+" b="+b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+" b="+b);
    }
}
