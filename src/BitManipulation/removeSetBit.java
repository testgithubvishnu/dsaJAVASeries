package BitManipulation;

public class removeSetBit {
    public static void main(String[] args) {
        int a=40;

        // 16 -> 100000   15 -> 101111
        // 40 -> 101000   39 -> 100111
        // Here leftmost bit removed
        // Here we will perform AND operation of N and N-1:

        //   1 0 0 0 0
        // &
        //   0 1 1 1 1
        // ________________
        //   0 0 0 0 0
        System.out.println(a &(a-1));

    }
}

