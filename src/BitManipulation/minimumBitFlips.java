package BitManipulation;

public class minimumBitFlips {
    public static void main(String[] args) {


    // 1010  ->  0111
    // (1 0 1 0 ^ 0 1 1 1) =>  1 1 0 1
        // No. of set bits = NO. bits to be flip
    // ans = start ^ goal

        int start=4, goal=7;
        int ans= start ^ goal;

        int count=0;
        for(int i=0;i<31;i++)
        {
            boolean con=false;
            if((ans &(1<<i))!=0)
            {
                con=true;
            }
            if(con)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
