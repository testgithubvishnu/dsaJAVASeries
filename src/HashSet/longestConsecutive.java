package HashSet;

import java.util.HashSet;

public class longestConsecutive {
    public static  int LongConsecutive(int[] nums)
    {
        HashSet<Integer> st= new HashSet<>();
        for(int num: nums) st.add(num);
        int maxStreak=0;
        for(int num:st)
        {
            if(!st.contains(num-1))
            {
                int currNum=num;
                int currStreak=1;
                while(st.contains(currNum+1))
                {
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        int[] arr={0,3,7,2,5,8,4,6,0,1};
        System.out.println(LongConsecutive(arr));
    }
}
